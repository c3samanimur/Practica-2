import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = ingresarAlu();
		ArrayList<Modulo> modulos = ingresarMod();
		
		buscarPareja(alumnos, modulos);
		
		generarHtml(modulos, alumnos);
		
		for(Alumno a : alumnos) {
			System.out.println("-- ALUMNO " + a.getId() + "\n" + 
					"Nombre: " + a.getNombre() + "\n" + 
					"Apellidos: " + a.getApellidos() + "\n" + 
					"Dni: " + a.getDni() + "\n" + 
					"Email: " + a.getEmail() + "\n" + 
					"Dirección: " + a.getEmail() + "\n" + 
					"Telefono: " + a.getTelefono() +"\n");
			for(Modulo m : a.getModulos()){ 
				System.out.println("-- ASIGNATURA " + m.getId_mod() + "--\n" +
						"Nombre: " + m.getNombre_mod() + "\n" + 
						"Curso: " + m.getCurso() + "\n" + 
						"Horas: " + m.getHoras() + "\n" + 
						"Profesor: " + m.getProfesor() + "\n");
			}
		}

	}
	
	public static ArrayList<Alumno> ingresarAlu(){
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		File file = new File("Assets/alumnos.txt");
		try (Scanner reader = new Scanner(file)) {
		      while (reader.hasNextLine()) {
		        String linea = reader.nextLine();
		        String datos[] = linea.split("&");
		        
		        Alumno newAlu = new Alumno(datos[0], datos[1], datos[2],datos[3], datos[4], datos[5], datos[6]);
		        
		        alumnos.add(newAlu);
		        
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		return alumnos;
	}
	
	public static ArrayList<Modulo> ingresarMod(){
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
		File file = new File("Assets/modulos.txt");
		try (Scanner reader = new Scanner(file)) {
		      while (reader.hasNextLine()) {
		        String linea = reader.nextLine();
		        String datos2[] = linea.split("&");
		        
		        Modulo newMod = new Modulo(datos2[0], datos2[1], datos2[2], datos2[3], datos2[4]);
		        
		        modulos.add(newMod);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return modulos;
	}
	
	public static void buscarPareja(ArrayList<Alumno> alumnos, ArrayList<Modulo> modulos) {
		File file = new File("Assets/modulo_alumno.txt");
		try (Scanner reader = new Scanner(file)) {
		      while (reader.hasNextLine()) {
		        String linea = reader.nextLine();
		        String[] datos3 = linea.split(",");
		        
		        String idMod = datos3[0];
		        String idAlu = datos3[1];
		        
		       Modulo m = buscarMod(idMod, modulos);
		       Alumno a = buscarAlu(idAlu, alumnos);
		       
		       if(m != null && a != null) {
		    	   a.guardarModulo(m);
		       }
		        
		        
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static Modulo buscarMod(String idMod, ArrayList<Modulo> modulos) {
		for(Modulo m : modulos) {
			if(idMod.equals(m.getId_mod())) {
				return m;
			}
		}
		return null;
	}
	
	public static Alumno buscarAlu(String idAlu, ArrayList<Alumno> alumnos) {
		for(Alumno a : alumnos) {
			if(idAlu.equals(a.getId())) {
				return a;
			}
		}
		return null;
	}
	
	public static void generarHtml(ArrayList<Modulo> modulos, ArrayList<Alumno> alumnos) {
		String html = "";
		
		html += "<!DOCTYPE html><html><head><title>Modulos con sus alumnos</title></head>"
				+ "<body><table>";
		
		for(Alumno a : alumnos) {
			html += "<tr>"
					+ "<th>ID_ALUMNOS</th>"
					+ "<th>NOMBRE</th>"
					+ "<th>APELLIDOS</th>"
					+ "<th>DNI</th>"
					+ "<th>EMAIL</th>"
					+ "<th>DIRECCION</th>"
					+ "<th>TELFONO</th>"
					+ "</tr>";
			
			html += "<tr>"
					+ "<td>" + a.getId() + "</td>"
					+ "<td>" + a.getNombre() + "</td>"
					+ "<td>" + a.getApellidos() + "</td>"
					+ "<td>" + a.getDni() + "</td>"
					+ "<td>" + a.getEmail() + "</td>"
					+ "<td>" + a.getDireccion() + "</td>"
					+ "<td>" + a.getTelefono() + "</td>"
					+ "</tr>";
			
			 html += "<table>"
				 		+ "<tr>"
				 		+ "<th>ID_MOD</th>"
				 		+ "<th>MODULO</th>"
				 		+ "<th>CURSO</th>"
				 		+ "<th>HORAS</th>"
				 		+ "<th>PROFESOR</th>"
				 		+ "</tr>";
			for(Modulo m : modulos) {
				html += "<tr>"
				 		+ "<td>" + m.getId_mod() + "</td>"
				 		+ "<td>" + m.getNombre_mod() + "</td>"
				 		+ "<td>" + m.getCurso() + "</td>"
				 		+ "<td>" + m.getHoras() + "</td>"
				 		+ "<td>" + m.getProfesor() + "</td>"
				 		+ "</tr>";
			}
		}
		
		html += "</table></body></html>";
		
		try {
			  FileWriter writer = new FileWriter("Assets/web2.html");
		      writer.write(html);
		      writer.close();  // must close manually
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      
		    }
	}
	
}
