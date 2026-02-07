package EJERCICIOS;
import java.util.Scanner;
import java.util.regex.*;

public class Simulacro1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce una frase con verbos en infinitivo");
		String frase = teclado.nextLine();
	
		String regex = "\\b([a-zA-ZñÑáéíóúÁÉÍÓÚ]?)+([aAeEiI][rR])\\b";
		
		Pattern patron = Pattern.compile(regex);
		Matcher buscador = patron.matcher(frase);
		
		
		
		System.out.println(frase.replaceAll(regex, "VERBO"));
		
		
	}
}
