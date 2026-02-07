package Ficheros;
import java.io.File;    
import java.time.LocalDateTime;              
import java.io.FileNotFoundException; 
import java.util.Scanner;   
import java.util.ArrayList;

import java.io.FileWriter;
import java.io.IOException;





public class Ejemplo4 {
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<alumno> lista = obtenerAlumno();
		generarHTML(lista);
		
		for(int i = 0; i < lista.size(); i++) {
			alumno alu = lista.get(i);
			System.out.println(alu);
		}
	}
	public static ArrayList<alumno> obtenerAlumno(){
		ArrayList<alumno> listado = new ArrayList<alumno>();
		
		File fichero = new File("./assets/alumnos.csv");
		
		   
	    try (Scanner lector = new Scanner(fichero)) {
	      while (lector.hasNextLine()) {
	        String linea = lector.nextLine();
	        String[] campos = linea.split(";");
	        
	        if(campos.length == 5) {
	        	int id = Integer.parseInt(campos[0]);
	        	alumno alu = new alumno(id, campos[1], campos[2], campos[3], campos[4]);
	        	listado.add(alu);
	        }
	      }
	      lector.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Ha ocurrido un error!.");
	      
	    }
		
		return listado;
	}
	public static void generarHTML(ArrayList<alumno> lista) {
		String html = 
				"<!DOCTYPE html><html><head><tittle>Listado de alumnos</tittle><body><h1>ALUMNOS</h1><table>";
		
		for(int i = 0; i < lista.size(); i++) {
			alumno alu = lista.get(i);
			html += "<tr><td>" + alu.getId() + "</td><td>" + alu.getNombre() + "</td><td>" + alu.getApellidos() + "</td><td>"
					+ alu.getFechaNac() + "</td><td>" + alu.getEmail() + "</td></tr>";
			
			
		}
		html += "</table></body></html>";
		try {
			FileWriter myWriter = new FileWriter("./output/"+ LocalDateTime.now()+ ".html");
			myWriter.write(html);
			myWriter.close(); // must close manually
			System.out.println("HTML creado con exito");
		} catch (Exception e) {
			System.out.println("Algo fue mal");
			e.printStackTrace();

		}
	}
}