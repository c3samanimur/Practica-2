package EJERCICIOS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce un nombre de usuario: ");
		String username = teclado.nextLine();
		
		String regex = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ][\\w_#$%?=+-]{2,19}";
		
		Pattern patron = Pattern.compile(regex);
		if(username.matches(regex)) {
			System.out.println("El username es válido");
		} else {
			System.out.println("El username NO es válido");
		}
		
	}
}
