import java.util.ArrayList;

public class Producto {
	private String id;
	private String nombre;
	private double precio;
	private int stock;
	private ArrayList<Cliente> nuevaCompra;
	
	public Producto(String id, String nombre, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.nuevaCompra = new ArrayList();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id.length() > 0) {
			this.id = id;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() >= 3) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if(stock > 0) {
			this.stock = stock;
		}
	}
	public void venta(Cliente c) {
		this.nuevaCompra.add(c);
	}
	public ArrayList<Cliente> getClientes() {
		return nuevaCompra;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.nuevaCompra = clientes;
	}

	public String toString() {
		return "ID_PRODUCTO: " + this.id + "\n" + 
				"Nombre: " + this.nombre + "\n" + 
				"Precio: " + this.precio + "\n" + 
				"Stock: " + this.stock + "\n";
	}
	
	
	
}
