import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = pedirInt("¿Cuantos alumnos quieres guardar");
		Alumno[] alumnos = ingresarAlu(numero);
		
		ordenarAlus(alumnos);
		
		generarHtml(alumnos);
	}
	
	public static int pedirInt(String enunciado) {
		int numero = 0;
		boolean tipo;
		do {
			try {
				System.out.println(enunciado);
				numero = Integer.parseInt(teclado.nextLine());
				
			}catch (Exception e) {
				System.out.println("Debes de introducir un número entero");
				tipo = false;
			}
			
			if(tipo = true && numero > 0) {
				break;
			} else {
				System.out.println("Numero fuera de rango");
				continue;
			}
			
		}while(true);
		
		
		return numero;
	}
	
	public static Alumno[] ingresarAlu(int numero) {
		Alumno[] alumnos = new Alumno[numero];
		for(int i = 0; i < numero; i++) {
			System.out.println("-- " + (i+1) + " ALUMNO --\n");
			
			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.println("Apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.println("DNI: ");
			String dni = teclado.nextLine();
			
			System.out.println("Email: ");
			String email = teclado.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellidos, dni, email);
		}
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println("-- " + (i+1) + "ALUMNO --"
					+ "NOMBRE: " + alumnos[i].getNombre() + "\n" + 
					"APELLIDOS: " + alumnos[i].getApellidos() + "\n" + 
					"DNI: " + alumnos[i].getDni() + "\n" + 
					"EMAIL: " + alumnos[i].getEmail());
		}
		return alumnos;
	}
	
	public static void ordenarAlus(Alumno[] alumnos) {
		
		for(int i = 0; i < alumnos.length -1 ; i++) {
			for(int j = 0; j < alumnos.length - 1 ; j++) {
				
				String apellido1 = alumnos[j].getApellidos();
				String apellido2 = alumnos[j+1].getApellidos();
				
				int orden = apellido1.compareTo(apellido2);
				
				if(orden < 0) {
					continue;
				} else if(orden == 0) {
					continue;
				} else if(orden > 0) {
					Alumno aux = alumnos[j];
					alumnos[j] = alumnos[j+1];
					alumnos[j+1] = aux;
				}	
			}
		}
		System.out.println("NOMBRES ORDENADOS ALFABETICAMENTE\n");
		for(int k = 0; k < alumnos.length; k++) {
			
			System.out.println("-- " + (k+1) + "ALUMNO --\n"
					+ "NOMBRE: " + alumnos[k].getNombre() + "\n" + 
					"APELLIDOS: " + alumnos[k].getApellidos() + "\n" + 
					"DNI: " + alumnos[k].getDni() + "\n" + 
					"EMAIL: " + alumnos[k].getEmail());
		}
	}
	
	public static void generarHtml(Alumno[] alumnos) {
		String html = "";
		
		html += "<!DOCTYPE html><html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script><title>Nombres ordenados de mayor a menos</title></head>"
				+ "<body><table>";
		
		for(int i = 0; i < alumnos.length; i++) {
			
			html += "<tr>"
					+ "<th>NOMBRE</th>"
					+ "<th>APELLIDOS</th>"
					+ "<th>DNI</th>"
					+ "<th>EMAIL</th>"
					+ "</tr>";
			html += "<tr>"
					+ "<td>" + alumnos[i].getNombre()  + "</td>"
					+ "<td>" + alumnos[i].getApellidos() + "</td>"
					+ "<td>" + alumnos[i].getDni() + "</td>"
					+ "<td>" + alumnos[i].getEmail() + "</td>"
					+ "</tr>";
		}
		
		try {
		      FileWriter myWriter = new FileWriter("Assets/web.html");
		      myWriter.write(html);
		      myWriter.close();  // must close manually
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      
		    }
		
		
	}
	
}
