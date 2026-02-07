package regex;
import java.util.regex.*;

public class Ejemplo25{
	public static void main(String[] args) {
		String texto = "pepe.al@gmail.com";
		String regex = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\n"
				+ "\\.[A-Za-z]{2,})$";  
	
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		
		
		boolean res1 = texto.matches(".*1[^2].*"); 
		System.out.println("Coinciden? " + res1);
	
		
	}
}
