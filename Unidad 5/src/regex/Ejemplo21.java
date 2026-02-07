package regex;
import java.util.regex.*;

public class Ejemplo21{
	public static void main(String[] args) {
		String texto = "0abc dfdgfdg asdrabcty";
		String regex = "^[^\\d].*";  
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches("^[^\\d].*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
