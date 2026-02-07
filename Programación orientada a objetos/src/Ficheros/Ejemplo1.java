package Ficheros;
import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;            


public class Ejemplo1 {
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		File fichero = new File("./assets/texto.txt");

	   
	    try (Scanner lector = new Scanner(fichero)) {
	      while (lector.hasNextLine()) {
	        String info = lector.nextLine();
	        System.out.println(info);
	      }
	      lector.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Ha ocurrido un error!.");
	      
	    }
	}
}
