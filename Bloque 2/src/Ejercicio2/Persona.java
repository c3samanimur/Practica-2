package Ejercicio2;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private int altura;
	
	private static final char SEXO_DEFECTO = 'H';
	
	
	//Constructor por defecto
	public Persona() {
		nombre = "";
		edad = 0;
		generarDNI();
		sexo = SEXO_DEFECTO;
		peso = 0;
		altura = 0;
	}
	

	//Contructor con algunos por defecto
	public Persona(String nombre, int edad, String dni, char sexo){
		this.nombre = nombre;
		this.edad = edad > 0 ? edad : 0;
		this.dni = dni;
		this.sexo = sexo == 'H' || sexo == 'M' ? sexo : SEXO_DEFECTO;
		this.peso = 0;
		this.altura = 0;
		
	}
	
	//Constructor con todos los atributos
		public Persona(String nombre, int edad, String dni, char sexo, double peso, int altura) {
			this.nombre = nombre;
			this.edad = edad > 0 ? edad : 0;
			this.dni = dni;
			this.sexo = sexo == 'H' || sexo == 'M' ? sexo : SEXO_DEFECTO;
			this.peso = peso > 0 ? peso : 0;
			this.altura = altura > 0 ? altura : 0;
		}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() > 0) {
			this.nombre = nombre;
		}
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad = edad;
		}
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		if(sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		}
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
		
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if(altura > 0) {
			this.altura = altura;
		}
		
	}
	
	public String toString() {
		String datos = "NOMBRE: " + this.nombre + "\nEDAD: " + this.edad + "\nDNI: " + this.dni  
				+ "\nSEXO: " + this.sexo + "PESO: " + this.peso + "\nALTURA: " + this.altura;
		
		return datos;
	}
	
	public int calcularIMC() {
		
		double imc = peso / Math.pow(altura/100.0, 2);
		if(imc < 20) {
			return -1;
		} else if(imc >= 20 && imc <= 25) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	public void generarDNI() {
		String dni = "";
		for(int i = 0; i < 8; i++) {
			dni += (int)(Math.random()*10);
		}
		int numero = Integer.parseInt(dni);
		int posicion = numero%23;
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
				'Q', 'V', 'H', 'L', 'C', 'K', 'E'
		};
		
		char letra = letras[posicion];
		dni += letra;
		this.dni = dni;
		
	}
	
	
}
