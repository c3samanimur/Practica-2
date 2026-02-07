package Programa;
import java.util.Scanner;
import Classes.Libro;
import Classes.GestorBiblioteca;
import Classes.Input;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		GestorBiblioteca gestor = new GestorBiblioteca();
		int opcion = 0;
		
		do {
			System.out.println("\n📚 --- BIBLIOTECA MUNICIPAL --- 📚\n1 - Ver catálogo de libros\n2 - Registrar nuevo libro\n3 - Prestar libro(cambiar estado)\n0 - SALIR\n");
			opcion = Input.getInt("Selecciona una opción: ");
			
			if(opcion == 1) {
				gestor.verLibros();
			} else if(opcion == 2) {
				System.out.println("\n--- ALTA DE LIBRO ---");
                String titulo = Input.getString("Título: ");
                String autor = Input.getString("Autor: ");
                String isbn = Input.getString("ISBN: ");
                Libro nuevoLibro = new Libro(titulo, autor, isbn);
                
				gestor.registrarLibro(nuevoLibro);
			} else if(opcion == 3) {
				System.out.println("\n--- PRÉSTAMO DE LIBROS ---");
				gestor.verLibros();
				String buscar = Input.getString("Introduce el ISBN a buscar: ");
				gestor.prestarLibro(buscar);
			} else if(opcion == 0){
				System.out.println("saliendo del sistema...\n");
			}
		} while(opcion != 0);
	}
}
