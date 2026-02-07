package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Marca: ");
		String marca = teclado.nextLine();
		
		System.out.print("Modelo: ");
		String modelo = teclado.nextLine();
		
		System.out.print("Año: ");
		int año = Integer.parseInt(teclado.nextLine());
		
		coche c1 = new coche(marca, modelo, año);
		
		mostrarValores(marca, modelo, año);
		
	}
	public static void mostrarValores(String marca, String modelo, int año) {
		System.out.print("La marca es " + marca + " ,el modelo es " + modelo + " y es del año " + año);
	}
	
	

}
