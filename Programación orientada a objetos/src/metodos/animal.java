package metodos;

public class animal {
	private String especie;
	private String nombre;
	private double peso;
	
	//CONSTRUCTOR: Sirve para asginar valores al objeto en tiempo de ejecución
	public animal(String especie, String nombre, double peso) {
		this.especie = especie;
		this.nombre = nombre;
		this.peso = peso > 0 ? peso : 0; 
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		if(especie.length() > 0) {
			this.especie = especie;
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() > 0) {
			this.nombre = nombre;
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
	
	
}
