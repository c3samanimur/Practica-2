package estatic;
import java.util.Scanner;

public class Ejemplo1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Precio de una tarjeta gráfica: ");
		double precioGrafica = Double.parseDouble(teclado.nextLine().trim());
		
		System.out.print("Precio de un kilo de harina: ");
		double precioHarina = Double.parseDouble(teclado.nextLine().trim());
		
		double ivaGrafica = utilidades.calcularIva(precioGrafica);
		System.out.println("IVA de la gráfica: " + ivaGrafica);
		
		double ivaHarina = utilidades.calcularIvaReducido(precioHarina);
		System.out.println("IVA de la harina: " + ivaHarina);
		
		
		
		
		
		
		
	
	}

}
