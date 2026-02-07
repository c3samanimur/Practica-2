
public class Tienda {
	private Producto newProducto;
	private boolean isOpen;
	
	public Tienda() {
		this.isOpen = false;
	}
	
	public void openStore() {
		this.isOpen = true;
		System.out.println(Config.welcome);
	}
	
	public void registerProducto(String nombre, double precio, int stock, String id) {
		Producto newProducto = new Producto(nombre, precio, stock, id);
	}
	
	public void viewProduct() {
		if(newProducto != null) {
			newProducto.toString();
		}
	}
}
