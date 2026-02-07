package Ejercicio2;
import Ejercicio2.Persona;
import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--- CALCULAR IMC ---\n");
		
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce tu género: ");
		char genero = teclado.nextLine().charAt(0);
		
		System.out.println("Introduce tu peso(KG): ");
		double peso = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Introduce tu altura(cm): ");
		int altura = Integer.parseInt(teclado.nextLine());
		
		//Primer constructor con todos los parametros, el dni al generarse dentro se le pasa un null
		Persona p1 = new Persona(nombre, edad,"", genero, peso, altura);
		
		Persona p2 = new Persona(nombre, edad,"", genero);
		
		Persona p3 = new Persona();
		p3.setNombre("Paconi");
		p3.setEdad(17);
		p3.setSexo('M');
		p3.setPeso(85);
		p3.setAltura(185);
		
		System.out.print("Resultados 1º persona: ");
		mostrarResultados(p1);
		
		System.out.print("Resultados 2º persona:");
		mostrarResultados(p2);
		
		System.out.print("Resultados 3º persona:");
		mostrarResultados(p3);
		
		
		
		
	}
	public static void mostrarResultados(Persona p) {
		
		if(p.calcularIMC() == -1) {
			System.out.println("¡CUIDADO! - - Tienes infrapeso");		
		} else if(p.calcularIMC() == 0) {
			System.out.println("¡ENHORABUENA! - - Estas en tu peso ideal");
		} else if(p.calcularIMC() == 1) {
			System.out.println("¡CUIDADO! - - Tienes sobrepeso");
		}
	}
	
	
}
