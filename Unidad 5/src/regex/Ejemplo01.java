package regex;
import java.util.regex.*;

public class Ejemplo01 {
	public static void main(String[] args) {
		String texto = "012ab9c";
		String regex = "\\d"; //equivale a [0-9]
		
		//Hacer busquedas y extraer los fragmentos que coinciden
		
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		//Comprobar si toda la cadena cumple con la expresión
		
		boolean res1 = texto.matches("\\d"); //Un unico caracter numerico
		System.out.println("Coinciden? " + res1);
		
		boolean res2 = texto.matches(".*\\d.*"); //Un caracter numerico precedido y seguido de cualquier caracter
		System.out.println("Coinciden? " + res2);
	}
}
