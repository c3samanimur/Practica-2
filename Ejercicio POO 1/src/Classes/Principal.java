package Classes;
import Classes.Alumno;
import java.util.Scanner;
public class Principal {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad = numAlu("Introduce el número de alumnos que desea registrar: ");
		Alumno[] alumnos = new Alumno[cantidad];
		
		crearAlu(alumnos);
		
	}
	public static int numAlu(String txt) {
		System.out.println(txt);
		int cantidad = Integer.parseInt(teclado.nextLine());
		return cantidad;
	}
	
	public static void crearAlu(Alumno[] alumnos) {
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println("--- DATOS DEL ALUMNO " + (i+1) + "---");
			
			System.out.print("Nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.print("Apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.print("NRE: ");
			String nre = teclado.nextLine();
			
			System.out.print("Email: ");
			String email = teclado.nextLine();
			
			System.out.print("Dirección: ");
			String direccion = teclado.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellidos, nre, email, direccion);
		}
	}
	
	
	
	
}
