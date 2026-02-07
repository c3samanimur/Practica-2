package regex;
import java.util.regex.*;

public class Ejemplo4 {
	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd";
		String regex = "sd$"; 
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*sd$"); 
		System.out.println("Coinciden? " + res1);
		
		
	}
}