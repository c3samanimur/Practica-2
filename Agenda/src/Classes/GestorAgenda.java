package Classes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorAgenda {
	private static final String FICHERO = "assets/agenda.txt";
	
	
	public void agregarContacto(Contacto nuevoContacto) {
			File file = new File(FICHERO);
		try{
			FileWriter writer = new FileWriter(file, true);
			String linea = nuevoContacto.getNombre() + ";" + nuevoContacto.getTelefono() + "\n";
			writer.write(linea);
			writer.close();
			
		} catch ( IOException e) {
			System.out.println("Error al escribir en el fichero...");
		}
	}
	
	public void leerContacto() {
		File file = new File(FICHERO);
		if(file.length() == 0) {
			System.out.println("ERROR. Agenda vacía");
			return;
		}
		try {
			Scanner reader = new Scanner(file);
			System.out.println("--- TUS CONTACTOS ---\n");
			
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos = linea.split(";");
				
				if(datos.length == 2) {
					System.out.println("👤" + datos[0] + "\t📞" + datos[1]);
				}
			}
			
			System.out.println("---------------------");
			reader.close();
		} catch(IOException e) {
			System.out.println("Error al leer la agenda");
		}
	}
}
