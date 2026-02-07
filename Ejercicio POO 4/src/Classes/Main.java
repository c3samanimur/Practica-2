package Classes;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Classes.Alumno;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = pedirNum("¿Cuantos alumnos quieres introducir?");
		
		Alumno[] alumnos = ingresarAlumnos(num);
		mostrarAlu(alumnos);
		
		ordenarAlu(alumnos);
		
		generarHtml(alumnos);
		
	}
	
	public static int pedirNum(String enunciado) {
		int num = 0;
		boolean valor;
		do {
			try {
				System.out.println(enunciado);
				num = Integer.parseInt(teclado.nextLine());
			
			} catch(Exception e) {
				System.out.println("Número entero!!");
			}
		} while(valor = false);
		
		
		return num;
	}
	
	private static Alumno[] ingresarAlumnos(int num) {
		Alumno[] alumnos = new Alumno[num];
		
		for(int i = 0;i < alumnos.length ; i++) {
			System.out.println("ALUMNO Nº " + (i+1));
			
			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.println("Apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.println("DNI: ");
			String dni = teclado.nextLine();
			
			System.out.println("Curso: ");
			String curso = teclado.nextLine();
			
			System.out.println("Edad: ");
			int edad = Integer.parseInt(teclado.nextLine());
			
			alumnos[i] = new Alumno(nombre, apellidos, dni, curso, edad);
			
		}
		
		return alumnos;
	}
	
	public static void mostrarAlu(Alumno[] alumnos) {
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println("ALUMNO Nº " + (i+1) + "\n" + 
							   "Nombre: " + alumnos[i].getNombre() + "\n" + 
							   "Apellidos: " + alumnos[i].getApellidos() + "\n" + 
							   "DNI: " + alumnos[i].getDni() + "\n" + 
							   "Curso: " + alumnos[i].getCurso() + "\n" + 
							   "Edad: " + alumnos[i].getEdad() + "\n");
		}
	}
	public static void ordenarAlu(Alumno[] alumnos) {	
		for(int i = 0; i < alumnos.length - 1; i++) {
			
		} for(int j = 0; j < alumnos.length - 1; j++) {
			String apellido1 = alumnos[j].getApellidos();
			String apellido2 = alumnos[j+1].getApellidos();
			char c1 = apellido1.charAt(0);
			char c2 = apellido2.charAt(0);
			
			if(c1 > c2) {
				Alumno aux = alumnos[j];
				alumnos[j] = alumnos[j+1];
				alumnos[j+1] = aux;
			}
		}
		
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println("ALUMNO Nº " + (i+1) + "\n" + 
							   "Nombre: " + alumnos[i].getNombre() + "\n" + 
							   "Apellidos: " + alumnos[i].getApellidos() + "\n" + 
							   "DNI: " + alumnos[i].getDni() + "\n" + 
							   "Curso: " + alumnos[i].getCurso() + "\n" + 
							   "Edad: " + alumnos[i].getEdad() + "\n");
		}
	}
	
	public static void generarHtml(Alumno[] alumnos) {
		String html = "";
		File file = new File("Assets/web.html");
		
		html += "<!DOCTYPE html><html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script><title>Lista de alumnos</title><h1>Lista de alumnos</h1></head>"
				+ "<body>";
		
		html += "<table>"
				+ "<th>ALUMNOS</th>";
		for(int i = 0; i < alumnos.length; i++) {
			html += "<tr>"
					+ "<th>Nombre</th>"
					+ "<th>Apellidos</th>"
					+ "<th>DNI</th>"
					+ "<th>Curso</th>"
					+ "<th>Edad</th>"
					+ "</tr>"
					+ "<tr>"
					+ "<td>" + alumnos[i].getNombre() + "</td>"
					+ "<td>"+ alumnos[i].getApellidos() + "</td>"
					+ "<td>" + alumnos[i].getDni() + "</td>"
					+ "<td>"+ alumnos[i].getCurso() + "</td>"
					+ "<td>"+ alumnos[i].getEdad() + "</td><br>"
					+ "</tr>";
		}
		
		html += "</table></body></html>";
		
		try {
		      FileWriter writer = new FileWriter(file);
		      writer.write(html);
		      writer.close();  
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		    }
	}
}
