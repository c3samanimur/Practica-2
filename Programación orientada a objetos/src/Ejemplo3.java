import Ejemplo3.coche;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		coche c1 = new coche();
		
		c1.marca = "Opel";
		c1.modelo = "Corsa";
		c1.color = "Azul";
		c1.matricula = "8346LNS";
		
		System.out.println(c1.marca + " " + c1.modelo + " " + c1.color + "( " + c1.matricula + " )");
	}

}
