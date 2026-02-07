package regex;
import java.util.regex.*;

public class Ejemplo6 {
	public static void main(String[] args) {
		String texto = "abc del mareo";
		String regex = "mar."; 
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*mar..*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
