package Ficheros;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class
import java.util.Scanner;

public class Ejemplo3 {
	public static Scanner teclado = new Scanner(System.in);
	
	  public static void main(String[] args) {
		  System.out.println("Introduce una frase para añadir a tu ficher txt: ");
		  String frase = teclado.nextLine();
	    try {
	      FileWriter myWriter = new FileWriter("./assets/texto.txt", true);
	      myWriter.write("\n" + frase);
	      myWriter.close();  
	      System.out.println("Mensaje escrito con éxito");
	    } catch (IOException e) {
	      System.out.println("Ha ocurrido un error");
	      e.printStackTrace();
	    }
	  }
	}