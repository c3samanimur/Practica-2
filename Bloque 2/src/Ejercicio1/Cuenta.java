package Ejercicio1;

public class Cuenta {
	private String titular;
	private double cantidad;
	private double numerosRojos;
	
	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		if(titular.length() != 0) {
			this.titular = titular;
		}
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public double getNumerosRojos() {
		return numerosRojos;
	}
	
	public String toString() {
		return "Nombre: " + this.titular + "\nSaldo: " + this.cantidad + "\nNumeros rojos: " + this.numerosRojos;
		
	}
	
	
	public void ingresar(double cantidad) {
		if(cantidad > 0) {
			this.cantidad = this.cantidad + cantidad;
		} 
	}
	
	public void retirar(double cantidad) {
		if(this.cantidad - cantidad >= -numerosRojos) {
			this.cantidad = this.cantidad + cantidad;
		} else {
			System.out.println("¡No tienes tanto saldo!");
		}
	}
}
