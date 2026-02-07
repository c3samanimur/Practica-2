package metodos;

import java.util.Scanner;

public class Ejemplo3 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		System.out.print("Especie: ");
		String especie = teclado.nextLine();
		
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Peso: ");
		double peso = Double.parseDouble(teclado.nextLine());
		
		animal a1 = new animal(especie, nombre, peso);
		
		
		
		
		
		
	}
}
