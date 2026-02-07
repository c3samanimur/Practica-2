package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = ingresarAlu();
		
		ordenarAlu(alumnos);
	}
	
	public static ArrayList<Alumno> ingresarAlu() {
		ArrayList<Alumno> alumnos = new ArrayList();
		File file = new File("Assets/alumnos_poo4.txt");
		 try (Scanner reader = new Scanner(file)) {
		      while (reader.hasNextLine()) {
		        String linea = reader.nextLine();
		        String[] datos = linea.split(";;");
		        
		        Alumno newAlu = new Alumno(datos[0],datos[1],datos[2],datos[3]);
		        alumnos.add(newAlu);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		    }
		
		return alumnos;
	}
	
	public static void ordenarAlu(ArrayList<Alumno> alumnos) {
		
		for(int i = 0; i < alumnos.size() - 1; i++) {
			for(int j = 0; j < alumnos.size() -1 ; j++) {
				Alumno alu1 = alumnos.get(j);
				Alumno alu2 = alumnos.get(j+1);
				
				String apellido1 = alu1.getApellidos();
				String apellido2 = alu2.getApellidos();
				
				char c1 = apellido1.charAt(0);
				char c2 = apellido2.charAt(0);
				
				if(c1 > c2) {
					Alumno aux = alumnos.get(j);
					alumnos.set(j, alumnos.get(j+1));
					alumnos.set(j+1, aux);	
					
				}
		}
	}
		
		for(Alumno alu : alumnos) {
			System.out.println("Nombre: " + alu.getNombre() + "\n"
							+ "Apellidos: " + alu.getApellidos() + "\n"
							+ "DNI: " + alu.getDni() + "\n"
							+ "Email: " + alu.getEmail() + "\n");
		}
	}
}
