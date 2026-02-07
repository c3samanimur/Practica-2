package EJERCICIOS;

import java.util.Scanner;

public class Simulacro3 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(comprobarIP("192.0.2.145"));
		System.out.println(comprobarIP("203.0.113.24"));
		System.out.println(comprobarIP("256.100.50.25"));
		System.out.println(comprobarIP("192.168.1.5.10"));
	}
	public static boolean comprobarIP(String IP) {
		return IP.matches("^([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])$");
	}
}
