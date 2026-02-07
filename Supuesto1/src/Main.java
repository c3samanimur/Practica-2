import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		do {
			opcion = pedirInt("--- Escritura y lectura de ficheros --\n\n1. Insertar\n2. Leer\n0. SALIR");
			if(opcion == 1) {
				escribirFichero();
			} else if(opcion == 2) {
				leerFichero();
			}
		} while(opcion != 0);
	}
	public static int pedirInt(String menu) {
		int opcion = 0;
		boolean tipo;
		do {
			try {
				System.out.println(menu);
				opcion = Integer.parseInt(teclado.nextLine());
			}catch(Exception e) {
				System.out.println("Debes de introducir un número entero!!!");
				continue;
			}
			
			if(opcion >= 0 && opcion < 3) {
				break;
			} else if(opcion < 0 || opcion > 3) {
				System.out.println("NUMERO FUERA DE RANGO");
				continue;
			} 
		} while(true);
		return opcion;
	}
	public static void escribirFichero() {
		System.out.println("--- ESCRIBIR EN EL FICHERO ---\n");
		String txt = "";
		do {
			System.out.println("¿Que quieres escribir en el fichero?: ");
			txt = teclado.nextLine();
			if(txt.length() >= 5) {
				break;
			} else {
				System.out.println("MINIMO 5 LETRAS!");
				continue;
			}
		}while(true);
		
		
		File file = new File("Assets/fichero.txt");
		try {
		      FileWriter writer = new FileWriter(file, true);
		      writer.write(txt + "\n");
		      writer.close();  
		      System.out.println("Mensaje escrito con éxito!!\nQue mensaje tan bonito\n");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void leerFichero() {
		System.out.println("--- LEER EL FICHERO ---\n");
		ArrayList<String> datos = new ArrayList();
		File file = new File("Assets/fichero.txt");
		try (Scanner reader = new Scanner(file)) {
		      while (reader.hasNextLine()) {
		        String linea = reader.nextLine();
		        datos.add(linea);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		ArrayList<String> data= ordenarAlfabeticamente(datos);
		for(int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i));
		}
		
	}
	
	public static ArrayList<String> ordenarAlfabeticamente(ArrayList<String> datos) {
		
		for(int i = 0; i < datos.size() ; i++) {
			for(int j = i+1; j < datos.size(); j++) {
				if(datos.get(i).compareTo(datos.get(j)) > 0) {
					String aux = datos.get(i);
					datos.set(i, datos.get(j));
					datos.set(j, aux);
				}
				
			}
		}
		
		return datos;
	}
}
