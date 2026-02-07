import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int tamaño = pedirInt("¿Cuantos alumnos deseas?: ");
		
		Alumno[] alumnos = ingresarAlu(tamaño);
		

	}
	
	
	public static int pedirInt(String enunciado) {
		int num = 0;
		boolean tipo;
		do {
			try {
				System.out.println(enunciado);
				num = Integer.parseInt(teclado.nextLine());
				tipo = true;
			} catch(Exception e) {
				System.out.println("Debes de introducir un número entero");
				tipo = false;
			}
			if(tipo == true && num > 0){
				break;
			}else if(tipo == true && num < 0) {
				System.out.println("Debes de introducir un número mayor de 0!!!");
				continue;
			} 
			
		} while(true);
		
		return num;
		
		
	}
	
	public static Alumno[] ingresarAlu(int tamaño) {
		Alumno[] alumnos = new Alumno[tamaño];
		
		for(int i = 0; i < tamaño; i++) {
			System.out.println("--- ALUMNO Nº " + (i+1));
			
			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.println("Apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.println("NRE: ");
			String nre = teclado.nextLine();
			
			System.out.println("Email: ");
			String email = teclado.nextLine();
			
			System.out.println("Direccion: ");
			String direccion = teclado.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellidos, nre, email, direccion);
		}
		
		return alumnos;
	}
	
}
