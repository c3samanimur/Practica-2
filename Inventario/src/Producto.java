
public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	private String id;
	
	public Producto(String nombre, double precio, int stock, String id) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", id=" + id + "]";
	}
	
}
