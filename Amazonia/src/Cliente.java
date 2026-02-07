import java.util.ArrayList;

public class Cliente {
	private String id_cliente;
	private String nombre_cliente;
	private double saldo;
	private ArrayList<Producto> cestaCompra;
	 
	
	public Cliente(String id_cliente, String nombre_cliente, double saldo) {
		this.id_cliente = id_cliente;
		this.nombre_cliente = nombre_cliente;
		this.saldo = saldo;
		this.cestaCompra = new ArrayList();
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Producto> getCestaCompra() {
		return cestaCompra;
	}

	public void setCestaCompra(ArrayList<Producto> cestaCompra) {
		this.cestaCompra = cestaCompra;
	}
}
