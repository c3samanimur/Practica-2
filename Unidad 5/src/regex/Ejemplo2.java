package regex;
import java.util.regex.*;

public class Ejemplo2 {
	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd";
		String regex = "asd"; //Comprobar que contenga asd
		
		//Hacer busquedas y extraer los fragmentos que coinciden
		
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " 
		+ concordancias.group() + ")");
		}
		
		//Comprobar si toda la cadena cumple con la expresión
		
		boolean res1 = texto.matches(".*asd.*"); 
		System.out.println("Coinciden? " + res1);
		
		
	}
}