package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Session {
	private User user;
	private boolean logged;
	private static final String FILE_PATH = "assets/files/";
	private static final String USERS_FILE = "users.txt";
	

	public Session() {
		this.logged = false;
		this.user = null;
	}

	public boolean isLogged() {
		return this.logged;
	}

	public void logout() {
		this.logged = false;
		this.user = null;
		System.out.println("Sesión cerrada con éxito\n");
		
	}

	public void showUser() {
		if (this.user != null) {
			System.out.print("--- DATOS DEL USUARIO ---\n\n");
			System.out.println("Usuario: " + this.user.getUsername());
			System.out.println("Nombre: " + this.user.getName());
			System.out.println("NIF: " + this.user.getNif());
			System.out.println("Email: " + this.user.getEmail());
			System.out.println("Dirección: " + this.user.getAddress());
			System.out.println("Fecha de nacimiento: " + this.user.getBirthdate());
			System.out.println("Rol: " + this.user.getRole());
			Input.toContinue();
		} else {
			System.out.println("No hay ninguna sesión iniciada actualmente\n");
			Input.toContinue();
		}
	}

	public boolean login(String username, String password) {
		File file = new File(FILE_PATH + USERS_FILE);
		try {
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos = linea.split("#");

				if (datos[0].equalsIgnoreCase(username) && datos[1].equals(password)) {
					this.user = new User(datos[0], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7],
							datos[1]);
					this.logged = true;
					reader.close();
					return true;
				}
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("ERROR: No se encuentra ningún usuario con esas credenciales en los archivos");
		}
		return false;
	}

	public void signup() {
		String newUsername = "";
		boolean existe = false;
		
		do {
			newUsername = Input.getString("Introduce el nombre de usuario que desees: ");
			existe = existsUser(newUsername);
			if(existe) {
				System.out.println("Error: El nombre de usuario ya esta asociado a una cuenta. Prueba con otro.");
			}
		} while(existe);
		String password = Input.getString("Introduce contraseña: ");
        String name = Input.getString("Nombre completo: ");
        String nif = Input.getString("NIF: ");
        String email = Input.getString("Email: ");
        String address = Input.getString("Dirección: ");
        String birthdate = Input.getString("Fecha nacimiento: ");
        String role = "user";
        
        User newUser = new User(newUsername, name, nif, email, address, birthdate, role, password);
        
        writeUser(newUser);
		
	}
	
	private boolean existsUser(String username) {
		File file = new File (FILE_PATH + USERS_FILE);
		if(!file.exists()) return false;
		
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos = linea.split("#");
				
				if(datos.length > 0 && datos[0].equalsIgnoreCase(username)) {
					reader.close();
					return true;
				}
			}
			reader.close();
		} catch(Exception e) {
			
		}
		return false;
	}
	private void writeUser(User newUser) {
		File file = new File(FILE_PATH + USERS_FILE);
		try {
			FileWriter writer = new FileWriter(file, true);
			String register = newUser.getUsername() + "#" + newUser.getPassword() + "#" + newUser.getName() + "#"
					+ newUser.getNif() + "#" + newUser.getEmail() + "#" + newUser.getAddress() + "#"
					+ newUser.getBirthdate() + "#" + newUser.getRole();
			
			if(file.exists() && file.length() > 0) {
				writer.write("\n");
			}
			writer.write(register);
			writer.close();
			
			System.out.println("Usuario registrado con éxito");
			
		} catch(IOException e) {
			System.out.println("Error al escribir al fichero");
		}
	}

	public User getUser() {
		return this.user;
	}

}
