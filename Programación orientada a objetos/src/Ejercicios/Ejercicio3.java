package Ejercicios;
import java.util.Scanner;


public class Ejercicio3 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Introduce el radio del círculo: ");
		double radio = Double.parseDouble(teclado.nextLine());
		
		circulo c1 = new circulo (radio);
		
		double area = calcularArea(radio);
		double perimetro = calcularPerimetro(radio);
		
		System.out.print("El área del circulo es " + area + " y el perímetro es " + perimetro);
	}
	public static double calcularArea(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	public static double calcularPerimetro(double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
}
