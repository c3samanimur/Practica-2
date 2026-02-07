package regex;
import java.util.regex.*;

public class Ejemplo9{
	public static void main(String[] args) {
		String texto = " 0123*aadd_ +  d6?f";
		String regex = "\\b"; 
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*\\b.*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
