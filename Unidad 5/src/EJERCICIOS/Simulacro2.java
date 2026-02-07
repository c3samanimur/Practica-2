	package EJERCICIOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simulacro2 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		String dominio = pedirDominio("Introduce el dominio que deseas buscar: ");
		
		ArrayList<Usuario> users = obtenerUser(dominio);
		
		System.out.println("Aquí estan los usuarios que han usado " + dominio);
		
		for(Usuario u : users) {
			System.out.println("ID: " + u.getId() + "\n" + 
							   "NOMBRE: " + u.getNombre() + "\n" + 
							   "APELLIDOS: " + u.getApellidos() + "\n" + 
							   "DNI: " + u.getDni() + "\n" + 
							   "EMAIL: " + u.getEmail() + "\n" + 
							   "DIRECCION: " + u.getTelefono() + "\n" + 
							   "TELEFONO: " + u.getTelefono() + "\n") ;
		}
		
		enviarMails(users);
		
	}
	
	public static String pedirDominio(String enunciado) {
		System.out.println(enunciado);
		String dominio = teclado.nextLine();
		
		return dominio;
	}
	
	public static ArrayList<Usuario> obtenerUser(String dominio){
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		File file = new File("Assets/usuarios.txt");
		
		Pattern patron = Pattern.compile("\\b" + dominio + "\\b");
		try (Scanner lector = new Scanner(file)) {
		      while (lector.hasNextLine()) {
		        String linea = lector .nextLine();
		        String[] datos = linea.split("&");
		        Usuario user = new Usuario(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
		        
		        Matcher matcher = patron.matcher(user.getEmail());
		        if(matcher.find()) {
		        	users.add(user);
		        }
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
		return users;
	}
	
	public static void enviarMails(ArrayList<Usuario> users) {
		File html = new File("Assets/plantilla.html");
		String plantilla = "";
		try (Scanner myReader = new Scanner(html)) {
		      while (myReader.hasNextLine()) {
		        plantilla = myReader.nextLine();
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		String email = "";
		for(Usuario u : users) {
			email = plantilla.replace("=nombre=", u.getNombre()).replace("=apellidos=", u.getApellidos()
					.replace("=dni=", u.getDni()).replace("=direccion=", u.getDireccion())
					.replace("=telefono=", u.getTelefono()).replace("=email=", u.getEmail()));
			
			try (FileWriter escritor = new FileWriter("Outputs/")) {
			    escritor.write(email); 
			    
			} catch (IOException e) {
			    System.out.println("Error de entrada/salida: " + e.getMessage());
			}
		}
	}
}
