package Ejercicios;
import java.util.Scanner;


public class Ejercicio2 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Introduce el ancho de tu rectángulo: ");
		int ancho = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Introduce la altura de tu rectángulo: ");
		int alto = Integer.parseInt(teclado.nextLine());
		
		rectangulo r1 = new rectangulo(ancho, alto);
		
		int area = calcularArea(ancho, alto);
		
		System.out.println("El área de tu rectángulo es: " + area);
		
	}
	public static int calcularArea(int ancho, int alto) {
		int area = ancho * alto;
		return area;
	}
}
