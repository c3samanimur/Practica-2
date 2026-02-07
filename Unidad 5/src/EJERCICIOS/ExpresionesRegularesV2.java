package EJERCICIOS;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class ExpresionesRegularesV2 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		//EJERCICIO1
		validarEntero();
		
		//EJERCICIO2
		validarEnteroPositivo();
		
		//EJERCICIO3
		validarEnteroNegativo();
		
		//EJERCICIO4
		validarDNI();
		
		//EJERCICIO5
		validarIP();
		
		//EJERCICIO6
		validarMatricula();
		
		//EJERCICIO7
		validarBinario();
		
		//EJERCICIO8
		validarOctal();
		
		//EJERCICIO9
		validarHexadecimal();
		
		//EJERCICIO10,11,12,13,14,15
		validarNumReal();
		
		//EJERCICIO16
		validarFecha();
		
		//EJERCICIO17
		validarNombre();
	}
	
	public static void validarEntero() {
		//Empieza con un simbolo de + o - (opcional) y sigue con un numero comprendido entre 0-9
		String regex = "^[+-]?[0-9]+$";
	}
	
	public static void validarEnteroPositivo() {
		//Debe empezar SI o SI por un entero
		String regex = "^[0-9]+$";
	}
	
	public static void validarEnteroNegativo() {
		//Debe de empezar SI o SI por -
		String regex = "^[-][0-9]+$";
	}
	
	public static void validarDNI() {
		//Debe empezar por 8 numeros  y despues una unica letra
		String regex = "^[0-9]{8}[Tt|Rr|Ww|Aa|Gg|Mm|Yy|Ff|Pp|Dd|Xx|Bb|Nn|Jj|Zz|Ss|Qq|Vv|Hh|Ll|Cc|Kk|Ee]{1}$";
	}
	
	public static void validarIP() {
		
		String regex = "^([01]?[0-9]|[2][0-4][0-9]|25[0-5])\\.([01]?[0-9]|[2][0-4][0-9]|25[0-5])\\.([01]?[0-9]|[2][0-4][0-9]|25[0-5])\\.([01]?[0-9]|[2][0-4][0-9]|25[0-5])";;
	}
	
	public static void validarMatricula() {
		
		String regex = "^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$";
	}
	
	public static void validarBinario() {
		
		String regex = "^([01]|1[01]+)$";
	}
	
	public static void validarOctal() {
		
		String regex = "([0-7]|[1-7][0-7]+)";
	}
	
	public static void validarHexadecimal() {
		
		String regex = "^[0-9A-F]+$";
	}
	
	public static void validarNumReal() {
		
		String regex = "^[+-]?[0-9]+(\\.[0-9]+)?$";
		
		String regex2 = "^[+]?[0-9]+(\\.[0-9]+)?$";
		
		String regex3 = "^[-][0-9]+(\\.[0-9]+)?$";
		
		String regex4 = "^[+-]?[0-9]+(\\.[0-9]{3})?$";
		
		String regex5 = "^[+]?[0-9]+(\\.[0-9]{3})?$";
		
		String regex6 = "^[-][0-9]+(\\.[0-9]{3})?$";
	}
	
	public static void validarFecha() {
		
		String regex = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/(0[0-9]{3}|1[0-9]{3}|20[0-9]{2})$"; 
	}
	
	public static void validarNombre() {
		
		String regex = "^[A-Z][a-z]+(\\ \\-[A-Z][a-z]+)*?$";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
