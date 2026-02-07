package bloque2;

import java.util.ArrayList;

public class CuentaV2 {
	private Titular titular;
	private double saldo;
	private double numerosRojos;
	private ArrayList<Movimiento> movimientos;
	
	public CuentaV2(Titular titular) {
		this.titular = titular;
		this.saldo = 0;
		this.numerosRojos = 0;
	}
	public CuentaV2(Titular titular, double saldo) {
		this.titular = titular;
		this.saldo = 0;
		this.numerosRojos = 0;
	}
	
	public Titular getTitular() {
		return this.titular;
	}
	public void seTitular(Titular titular) {
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
	public void addMovimiento(Movimiento m) {
		this.movimientos.add(m);
		if(m.getImporte() > 0) {
			ingresar(m.getImporte());
		} else {
			retirar(m.getImporte() * -1);
		}
	}
	
	public ArrayList<Movimiento> getMovimiento(){
		return this.movimientos;
	}
}
