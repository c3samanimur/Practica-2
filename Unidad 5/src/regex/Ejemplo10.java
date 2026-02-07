package regex;
import java.util.regex.*;

public class Ejemplo10{
	public static void main(String[] args) {
		String texto = "JavaWorld";
		String regex = "[0-9a-f]"; 
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*[0-9a-f].*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
