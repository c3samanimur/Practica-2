package Programa;
import Classes.DigitalSafe;
import Classes.SafeConfig;
import Classes.SafeController;
import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		
		DigitalSafe registro = new DigitalSafe("basi", "801447");
		SafeController modificar = new SafeController(registro);
		
		System.out.println(SafeConfig.bienvenida + "\n" + SafeConfig.nombre_banco);
		int opcion = pedirInt("--- CAJA FUERTE ---\n1. ABRIR CAJA\n0. SALIR\n");
		
		if(opcion == 1) {
			comprobarDatos(registro);
		}
	}
	public static int pedirInt(String enunciado) {
		int opcion = 0;
		boolean tipo;
		do {
			try {
				System.out.println(enunciado);
				opcion = Integer.parseInt(teclado.nextLine());
				tipo = true;
			}catch(Exception e) {
				System.out.println("DEBES DE INTRODUCIR UN NÚMERO");
				tipo = false;
			}
			if(opcion > 1 || opcion < 0) {
				System.out.println("Opción fuera de rango");
				continue;
			} else if(tipo = true && opcion == 1) {
				break;
			} else if(opcion == 0) {
				System.out.println("Saliendo del programa");
				break;
			}
			
		} while(true);
		
		return opcion;	
	}
	
	public static void comprobarDatos(DigitalSafe registro) {
		
		System.out.println("Introduce el pin: ");
		String pin = teclado.nextLine();
		
		
		
	}
	
}
