
public class Main {
	public static void main(String[] args) {
		Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez", false);
		
		System.out.print(libro1);
		
		libro1.prestado();
		
		System.out.print(libro1);
		
		libro1.devolver();
		
		System.out.print(libro1);
		
		double coste = libro1.imprimir(0.5);
		
		System.out.println("\nEl coste ha sido " + coste + " $");
	}
}
