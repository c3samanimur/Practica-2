package Ejercicios;

public class coche {
	private String marca;
	private String modelo;
	private int año;
	
	public coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		if(año >= 1900 && año <= 2030) {
			this.año = año;
		}
	}
	
}
