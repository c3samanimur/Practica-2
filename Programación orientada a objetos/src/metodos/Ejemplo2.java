package metodos;

import java.util.Scanner;

public class Ejemplo2 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		estudiante e1 = new estudiante();
		
		System.out.print("Nombre: ");
		e1.nombre = teclado.nextLine();
		
		System.out.print("Apellidos: ");
		e1.apellidos = teclado.nextLine();
		
		System.out.print("Calificación: ");
		e1.setCalificacion(Double.parseDouble(teclado.nextLine()));
		
	}
}
