package Ejercicios;
import java.util.Scanner;


public class Ejercicio4 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Que nota has sacado: ");
		double calificacion = Double.parseDouble(teclado.nextLine());
		
		estudiante e1 = new estudiante(nombre, calificacion);
	}
}
