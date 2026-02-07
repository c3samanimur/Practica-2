package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio2 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce tu DNI: ");
		String dni = teclado.nextLine();
		
		System.out.println("Introduce tu NIE: ");
		
		String regex = "^[0-9]{8}[Tt|Rr|Ww|Aa|Gg|Mm|Yy|Ff|Pp|Dd|Xx|Bb|Nn|Jj|Zz|Ss|Qq|Vv|Hh|Ll|Cc|Kk|Ee]{1}";
		
		String regex1 = "^[Xx|Yy|Zz]{1}[0-9]{7}[Tt|Rr|Ww|Aa|Gg|Mm|Yy|Ff|Pp|Dd|Xx|Bb|Nn|"
				+ "Jj|Zz|Ss|Qq|Vv|Hh|Ll|Cc|Kk|Ee]{1}";
		
		if(dni.matches(regex)) {
			System.out.println("EL dni es VALIDO");
		} else {
			System.out.println("El dni NO es VALIDO");
		}
			
		
	}
}
