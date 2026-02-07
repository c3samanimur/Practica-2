package regex;
import java.util.regex.*;

public class Ejemplo24{
	public static void main(String[] args) {
		String texto = "0abc dfd13gfdg asdr1Nabcty0";
		String regex = "1[^2]";  
	
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
