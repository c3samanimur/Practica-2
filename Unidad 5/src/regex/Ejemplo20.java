package regex;
import java.util.regex.*;

public class Ejemplo20{
	public static void main(String[] args) {
		String texto = "abc dfdgfdg asdrabcty";
		String regex = "[a-zA-Z]{5,10}";  
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*[a-zA-Z]{5,10}.*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}

