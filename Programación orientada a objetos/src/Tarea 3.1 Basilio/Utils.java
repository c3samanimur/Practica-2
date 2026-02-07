import java.lang.reflect.Array;
import java.util.Scanner;


public class Utils {
	public static boolean esTriangulo(double a, double b, double c) {
		return(a + b > c) && (a + c > b) && (c + b > a);
	}
	public static String tipoTriangulo(double a, double b, double c) {
		if(!esTriangulo(a,b,c)) {
			return "ERROR";
		}
		if(a == b && b == c) {
			return "EQUILATERO";
		} else if(a == b || a == c || b == c) {
			return "ISOSCELES";
		} else{
			return "ESCALENO";
		}
	}
	
	public static int masFrecuenteInt(int[] numeros) {
	    if (numeros == null || numeros.length == 0) return -1;
	    
	    int masFrecuente = numeros[0];
	    int repetir = 0; 

	    
	    for (int i = 0; i < numeros.length; i++) {
	        int num = numeros[i];
	        int contador = 0; 

	        
	        for (int j = 0; j < numeros.length; j++) {
	            if (numeros[j] == num) {
	                contador++;
	            }
	        }

	        if (contador > repetir) {
	            repetir = contador;
	            masFrecuente = num;
	        }
	    }
	    return masFrecuente;
	
	}
	
	public static int buscarInt(int[] numeros, int valor) {
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == valor) {
				return i;
			}
		}
		return -1;
	}
}
