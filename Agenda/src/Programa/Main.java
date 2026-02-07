package Programa;
import java.util.Scanner;
import Classes.GestorAgenda;
import Classes.Contacto;
import Classes.Input;
import Classes.Mensajes;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		GestorAgenda gestor = new GestorAgenda();
		int opcion = 0;
		
		do {
			System.out.print("\n📒 --- MI AGENDA TELEFÓNICA --- 📒\n\n1- Ver todos los contactos\n2- Agregar nuevo contacto\n0- SALIR\n");
			opcion = Input.getInt("Seleccione una opción: ");
			
			if(opcion == 1) {
				gestor.leerContacto();
			} else if(opcion == 2) {
				System.out.print("--- NUEVO CONTACTO ---\n\n");
				String nombre = Input.getString("Nombre: ");
				String telefono = Input.getString("Teléfono: ");
				
				Contacto nuevoContacto = new Contacto(nombre, telefono);
				gestor.agregarContacto(nuevoContacto);
				
				System.out.println(Mensajes.GUARDAR_CONTACTO);
			} else if(opcion == 0) {
				System.out.println(Mensajes.DESPEDIDA);
			}
		} while (opcion != 0);
	}
	
}
