package bloque2;

public class Cuenta{
	private String titular;
	private double saldo;
	private double numerosRojos;
	
	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.numerosRojos = 0;
	}
	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = 0;
		this.numerosRojos = 0;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public void seTitular(String titular) {
		if(titular.length() > 0) {
			this.titular = titular;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public double getNumerosRojos() {
		return this.numerosRojos;
	}
	
	public String toString() {
		return this.titular + ". Saldo: " + this.saldo + "$. " + (numerosRojos < 0 ? "Numeros rojos: " + numerosRojos + "$" : "");
		
	}
	
	public void ingresar(double cantidad) {
		if(cantidad > 0) {
			if(numerosRojos < 0) {
				if((numerosRojos * -1) > cantidad) {
					numerosRojos += cantidad;
				} else {
					double diferencia = numerosRojos + cantidad;
					numerosRojos = 0;
					saldo = diferencia;
				}
			} else {
				saldo += cantidad;
			}
		}
	}
	
	public void retirar(double cantidad) {
		if(cantidad > 0) {
			if(saldo >= cantidad) {
				saldo -= cantidad;
				
			} else {
				double diferencia = saldo - cantidad;
				saldo = 0;
				numerosRojos = diferencia;
			}
		}
	}
}
