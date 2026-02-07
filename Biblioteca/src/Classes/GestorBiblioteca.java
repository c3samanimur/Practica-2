package Classes;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import Classes.Mensajes;
import java.util.ArrayList;

public class GestorBiblioteca {
	private static final String FICHERO = "assets/biblioteca.txt";
	
	public void registrarLibro(Libro nuevoLibro) {
		File file = new File(FICHERO);
		
		try {
			FileWriter writer = new FileWriter(file);
			String linea = nuevoLibro.getTitulo() + ";" + nuevoLibro.getAutor() + ";" + nuevoLibro.getIsbn()
			+ ";" + nuevoLibro.isPrestado();
			writer.write(linea);
			writer.close();
			System.out.println(Mensajes.REGISTRO);
		} catch(IOException e) {
			System.out.println("Error al escribir...");
		}
	}
	
	public void verLibros() {
		File file = new File(FICHERO);
		
		try {
			Scanner reader = new Scanner(file);
			System.out.print("--- BIBLIOTECA ALCANTARILLA ---\n\n");
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos = linea.split(";");
				
				if(datos.length== 4) {
					boolean estaPrestado = Boolean.parseBoolean(datos[3]);
					Libro l = new Libro(datos[0], datos[1], datos[2], estaPrestado);
					System.out.println(l.toString());	
				}
			}
			System.out.println("------------------------------");
			reader.close();
			
		} catch(Exception e) {
			System.out.println("Error al leer los libros\n");
		}
	}
	
	//Metodo para aprender a modificar archivos .txt
	public void prestarLibro(String isbnBuscar) {
		//Metemos el txt en una lista para tratarlo
		ArrayList<Libro> memoria= new ArrayList<>();
		
		boolean encontrado = false;
		File file = new File(FICHERO);
		
		//El primero paso es leer el archico (Scanner reader)
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos = linea.split(";");
				boolean estaPrestado = Boolean.parseBoolean(datos[3]);
				Libro l = new Libro(datos[0], datos[1], datos[2], estaPrestado);
				
				if(l.getIsbn().equals(isbnBuscar)) {
					l.setPrestado(true);
					encontrado = true;
					System.out.println("¡Libro modificado!");
				}
				memoria.add(l);
				
			}
			if(encontrado) {
				FileWriter writer = new FileWriter(FICHERO);
				for(Libro libro : memoria) {
					writer.write(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getIsbn() + ";" + libro.isPrestado() + "\n");
					
				}
				writer.close();
			}
			reader.close();
			
		} catch(Exception e) {
			
		}
		
	}
}
