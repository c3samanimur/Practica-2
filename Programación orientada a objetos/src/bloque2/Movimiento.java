package bloque2;

public class Movimiento {
	private String dni;
	private int numero;
	private String fecha;
	private String hora;
	private double importe;
	private String concepto;
	
	public Movimiento(String dni, int numero, String fecha, String hora, double importe, String concepto) {
		
	}

	public String getDni() {
		return dni;
	}

	public int getNumero() {
		return numero;
	}

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}

	public double getImporte() {
		return importe;
	}

	public String getConcepto() {
		return concepto;
	}
}
