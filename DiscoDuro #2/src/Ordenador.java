
public class Ordenador {
	private String marca;
	private String modelo;
	private int ram;
	private int capacidad;
	private int espacio;
	private boolean encendido;
	
	public Ordenador() {
		this.ram = 4;
		this.capacidad = 50;
		this.encendido = false;
	}
	
	public Ordenador(int ram) {
		this.ram = ram;
	}
	
	public Ordenador(int ram, int capacidad) {
		this.ram = ram;
		this.capacidad = capacidad;
	}
	
	public Ordenador(String marca, String modelo, int ram, int capacidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca.length() > 0) {
			this.marca = marca;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if(modelo.length() > 0) {
			this.modelo = modelo;	
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if(ram%2 == 0) {
			this.ram = ram;
		} else {
			System.out.println("La ram debe de ser un múltiplo de 2");
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		if(capacidad > 0) {
			this.capacidad = capacidad;
		}
	}

	public int getEspacio() {
		return espacio;
	}

	public void setEspacio(int espacio) {
		if(espacio >= 0) {
			this.espacio = espacio;
		}
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void  encender() {
		if(this.encendido) {
			System.out.println("El ordenador  ya esta encendido");
		} else {
			this.encendido = true;
			System.out.println("Encendiendo ordenador...");
		}
	}
	public void apagar() {
		if(!this.encendido) {
			System.out.println("El ordenador esta apagado");
		} else {
			this.encendido = false;
			System.out.println("Apagando ordenador...");
		}
	}
	
	public void transferirArchivos(double gb) {
		if(this.encendido) {
			if(espacio + gb <= capacidad) {
				this.espacio += gb;
				System.out.println("Transferidos: " + gb + " GB. Espacio actual: " + this.espacio);
			} else {
				System.out.println("ESPACIO INSUFICIENTE");
			}
		} else {
			System.out.println("ORDENADOR APAGADO");
		}
	}
	
	public void eliminarArchivos(double gb) {
		if(this.encendido) {
			if(this.espacio - gb < 0) {
				this.espacio = 0;
			} else {
				this.espacio -= gb;
			}
		} else {
			System.out.println("ORDENADOR APAGADO");
		}
	}
	
	public String toString() {
		return "Marca: " + getMarca() + "\n"
				+ "Modelo: " + getModelo() + "\n"
				+ "Ram: " + getRam() + "\n"
				+ "Capacidad: " + getCapacidad();
	}
	
	
}
