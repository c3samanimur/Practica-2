package regex;
import java.util.regex.*;

public class Ejemplo19{
	public static void main(String[] args) {
		String texto = "abc dfdgfdg asdrabcty";
		String regex = "^[aA][bB][cC].*";  
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches("^[aA][bB][cC].*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
