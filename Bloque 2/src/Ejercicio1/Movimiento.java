package Ejercicio1;


public class Movimiento {
	private String dniTitular;
	private String concepto;
	private double importe;
	
	private String fecha;
	private String hora;
	
	private static int contador = 1;
	private int idMovimiento;
	
	
	public Movimiento(String dniTitular, String concepto, double importe, String fecha, String hora){
		this.dniTitular = dniTitular;
		this.concepto = concepto;
		this.importe = importe;
		this.fecha = fecha;
		this.hora = hora;
		this.idMovimiento = contador;
		contador++;
	}


	public String getDniTitular() {
		return dniTitular;
	}


	public String getConcepto() {
		return concepto;
	}

	public double getImporte() {
		return importe;
	}

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}


	public static int getContador() {
		return contador;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}


}
