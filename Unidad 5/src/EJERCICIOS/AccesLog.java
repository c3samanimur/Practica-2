package EJERCICIOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import clases.Acceso;

public class AccesLog {
	public static void main(String[] args) {
		ArrayList<Acceso> access = procesarLinea();
	}
	
	public static ArrayList<Acceso> procesarLinea(){
		ArrayList<Acceso> accesos = new ArrayList<>();
		File file = new File("Assets/access_log.txt");
		
		String regex1 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\."
				+ "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
		
		String regex2 = "user:\\s*(\\S+)";
		
		
		
		 try (Scanner lector = new Scanner(file)) {
		      while (lector.hasNextLine()) {
		        String linea = lector.nextLine();
		        
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return accesos;
	}
}
