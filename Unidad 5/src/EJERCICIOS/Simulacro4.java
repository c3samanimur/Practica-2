package EJERCICIOS;

import java.util.Scanner;

public class Simulacro4 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion = 0;
		do {
			try {
				System.out.println("--- JUEGO DEL AHORCADO ---\n1- Nuevo juego\n2- Ver ranking\n0- Finalizar");
				System.out.println("Introduzca una opción: ");
				opcion = Integer.parseInt(teclado.nextLine());
			}catch(Exception e) {
				System.out.println("Debes de introducir un número");
			}
			if(opcion < 0 || opcion > 2) {
				System.out.println("Número fuera de rango");
				continue;
			}
			if(opcion == 1) {
				iniciarPartida();
			} else if(opcion == 2) { 
				
			} else if(opcion == 0) {
				System.out.println("Saliendo del juego...");
			}
		} while(true);
		
	
	}
	
	public static void iniciarPartida() {
		System.out.println("Introduce tu nombre de usuario: ");
		String username = teclado.nextLine();
		int opcion = 0;
		do {
			try {
				System.out.println("[ " + username  + " ]\nElige una dificultad\n1- FACIL\n2- NORMAL\n3- DIFICIL");;
				opcion = Integer.parseInt(teclado.nextLine());
			}catch(Exception e) {
				System.out.println("Debes de introducir un número");
			}
			if(opcion < 0 || opcion > 2) {
				System.out.println("Número fuera de rango");
				continue;
			} else if(opcion == 1) {
				
			}
			
		} while(true);
		
		
	}
}
