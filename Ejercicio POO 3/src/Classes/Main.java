 package Classes;
import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;
import Classes.Alumno;
import Classes.Modulo;
import java.util.ArrayList;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Cargando alumnos en el sistema...");
		ArrayList<Alumno> alumnos = guardarAlu();
		
		System.out.println("Cargando modulos en el sistema...");
		ArrayList<Modulo> modulos = guardarMod();
		
		System.out.println("Matriculando alumnos en sus cursos...");
		buscarPareja(alumnos, modulos);
		
		System.out.println("--- Alumnos con su modulo correspondiente ---");
		for(Modulo m : modulos) {
			System.out.println("--- MODULO " + m.getId_modulo() +  "---\n" + "Asignatura: " + m.getNombre() + "\n" + 
								"Curso: " + m.getCurso() + "\n" + 
								"Nº horas: " + m.getHoras() + "\n" + 
								"Profesor: " + m.getProfesor() + "\n" + 
								"ID_modulo: " + m.getId_modulo() + "\n");
			for(Alumno a : m.listaAlumnos()) {
				System.out.println("Nombre: " + a.getNombre() + "\n" + 
									"Apellidos: " + a.getApellidos() + "\n" +
									"NRE: " + a.getNre() + "\n" + 
									"Email: " + a.getEmail() + "\n" + 
									"Dirección: " + a.getDireccion() + "\n" + 
									"ID: " + a.getId() + "\n");
			}
		}
			
	}
	public static ArrayList<Alumno> guardarAlu(){
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		File file = new File("Assets/alumnos.txt");
		try (Scanner reader = new Scanner(file)) {
		      while (reader.hasNextLine()) {
		        String linea = reader.nextLine();
		        String[] datos= linea.split("&");
		        int id = Integer.parseInt(datos[0]);
		        
		        Alumno newAlu = new Alumno(id, datos[1], datos[2], datos[3], datos[4], datos[5]);
		     
		        alumnos.add(newAlu);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		return alumnos;
	}
	
	public static ArrayList<Modulo> guardarMod(){
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
		File file2 = new File("Assets/modulos.txt");
		try(Scanner reader = new Scanner(file2)){
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos2 = linea.split("&");
				
				int id_modulo = Integer.parseInt(datos2[0]);
				int curso = Integer.parseInt(datos2[2]);
				int horas = Integer.parseInt(datos2[3]);
				
				Modulo newModulo = new Modulo(id_modulo, datos2[1],curso, horas, datos2[4]);
				
				modulos.add(newModulo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		return modulos;
	}
	
	public static void buscarPareja(ArrayList<Alumno> alumnos, ArrayList<Modulo> modulos) {
		File file3 = new File("Assets/modulo_alumno.txt");
		try(Scanner reader = new Scanner(file3)){
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String[] datos3 = linea.split(",");
				
				int idModulo = Integer.parseInt(datos3[0]);
				int idAlumno = Integer.parseInt(datos3[1]);
				
				Modulo m = buscarMod(idModulo, modulos);
				Alumno a = buscarAlu(idAlumno, alumnos);
				
				if(m != null && a != null) {
					m.matricularAlumno(a);
				}
			}	
		} catch(FileNotFoundException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
	}
	public static Alumno buscarAlu(int idAlumno, ArrayList<Alumno> alumnos) {
		
		for(Alumno a : alumnos) {
			if(a.getId() == idAlumno) {
				return a;
			}
		}
		return null;
	}
	
	public static Modulo buscarMod(int idModulo, ArrayList<Modulo> modulos) {
		
		for(Modulo m : modulos) {
			if(m.getId_modulo() == idModulo) {
				return m;
			}
		}
		
		return null;
	}
	
	
				
				
	
		
	
}
