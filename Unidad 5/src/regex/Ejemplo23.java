package regex;
import java.util.regex.*;

public class Ejemplo23{
	public static void main(String[] args) {
		String texto = "0abc dfdgfdg asdrabcty0";
		String regex = "(a|b)+";  
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*(a|b)+.*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
