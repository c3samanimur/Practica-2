import java.util.Scanner;

public class Ejemplo2{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Libro[] libros = crearLibros(3);
		
		mostrarLibros(libros);
			
			
		}
		
		public static Libro[] crearLibros(int cantidad) {
			Libro[] libros = new Libro[3];
			for(int i = 0; i < libros.length; i++) {
				libros[i] = new Libro();
				
				System.out.println((i+1) + "º libro");
				
				System.out.print("Titulo: ");
				libros[i].titulo = teclado.nextLine();
				
				System.out.print("Páginas: ");
				libros[i].paginas = Integer.parseInt(teclado.nextLine());
				
				System.out.print("Autor: ");
				libros[i].autor = teclado.nextLine();
				
		}
			return libros;
		
	}
		public static void mostrarLibros(Libro[] libros) {
			System.out.println("\nLIBROS\n");
			for(int i = 0; i < libros.length; i++) {
				System.out.println((i+1) + "º libro");
				System.out.println(libros[i].titulo + " (" + libros[i].paginas + " páginas)");
				
			}
			
		}
}