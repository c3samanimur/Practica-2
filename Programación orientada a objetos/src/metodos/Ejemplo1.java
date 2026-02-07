package metodos;

import java.util.Scanner;

public class Ejemplo1 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		persona p1 = new persona();
		
		System.out.print("Nombre: ");
		p1.nombre = teclado.nextLine().trim();
		
		System.out.print("Apellidos: ");
		p1.apellidos = teclado.nextLine().trim();
		
		System.out.print("DNI: ");
		p1.dni = teclado.nextLine().trim();
		
		System.out.print("Direccion: ");
		p1.direccion = teclado.nextLine().trim();
		
		System.out.println("Nombre completo: " + p1.nombreCompleto());
		
	}
}
