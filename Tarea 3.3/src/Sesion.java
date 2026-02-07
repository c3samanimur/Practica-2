import java.io.File;
import java.util.Scanner;

public class Sesion {
	public boolean login(String username, String password) {
		File file = new File("Assets/usuarios.txt");
		try {
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos = linea.split("#");

				if (datos[0].equals(username) && datos[1].equals(password)) {
					reader.close();
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: No se encuentra ningún usuario con esas credenciales en los archivos");
		}
		return false;
	}
	
	
}
