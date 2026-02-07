import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Cargando productos...");
		ArrayList<Producto> productos = ingresarProd();
		
		System.out.println("Cargando clientes...");
		ArrayList<Cliente> clientes = ingresarCli();
		
		buscarCliente(productos, clientes);
		
		
		for(Producto p : productos) {
			System.out.println("ID_PROD: " + p.getId() + "\n" + 
							"Nombre: " + p.getNombre() + "\n" + 
							"Precio: " + p.getPrecio() + "\n" + 
							"Stock: " + p.getStock() + "\n");
			for(Cliente c : p.getClientes()) {
				System.out.println("ID_CLIENTE: " + c.getId_cliente() + "\n" + 
									"Nombre_cliente: " + c.getNombre_cliente() + "\n" + 
									"Saldo: " + c.getSaldo() + "\n");
				
					
				}
		}
		ordenar(productos, clientes);
		//comprobaciones(productos, clientes);
		
	}
	
	
	public static ArrayList<Producto> ingresarProd(){
		ArrayList<Producto> prod = new ArrayList();
		File file = new File("Assets/Productos.txt");
		
		try (Scanner myReader = new Scanner(file)) {
		      while (myReader.hasNextLine()) {
		        String linea = myReader.nextLine();
		        String datos[] = linea.split("#");
		        double precio = Double.parseDouble(datos[2]);
		        int stock = Integer.parseInt(datos[3]);
		        Producto newProd = new Producto(datos[0], datos[1], precio, stock);
		        prod.add(newProd);
		        
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		return prod;
	}
	public static ArrayList<Cliente> ingresarCli(){
		ArrayList<Cliente> cli = new ArrayList();
		
		File file = new File("Assets/Clientes.txt");
		
		try (Scanner myReader = new Scanner(file)) {
		      while (myReader.hasNextLine()) {
		        String linea = myReader.nextLine();
		        String datos[] = linea.split("#");
		        double saldo = Double.parseDouble(datos[2]);
		        
		        Cliente newCli = new Cliente(datos[0], datos[1], saldo);
		        cli.add(newCli);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
		return cli;
	}
	
	public static void buscarCliente(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
		File file = new File("Assets/Ventas.txt");
		
		try(Scanner reader = new Scanner(file)){
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String datos[] = linea.split("#");
				
				Cliente c =buscarCli(datos, clientes);
				Producto p = buscarProducto(datos, productos);
				
				if(c != null && p != null) {
					p.venta(c);
				}
				boolean c1 = comprobacion1(datos, productos);
				boolean c2 = comprobacion2(productos, clientes);
				
				if(c1 && c2) {
					
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	
	}
	
	public static Cliente  buscarCli(String[] datos, ArrayList<Cliente> clientes) {
		for(int i = 0; i < datos.length; i++) {
			for(Cliente c : clientes) {
				if(datos[i].equals(c.getId_cliente())) {
					return c;
				}
			}
		}
		return null;
	}
	
	public static Producto buscarProducto(String[] datos, ArrayList<Producto> productos) {
		for(int i = 0; i < datos.length; i++) {
			for(Producto p : productos) {
				if(datos[i].equals(p.getId())) {
					return p;
				}
			}
		}
		return null;
	}
	
	public static boolean comprobacion1(String[] datos,ArrayList<Producto> productos) {
		for(int i = 0; i < datos.length; i++) {
			for(Producto p : productos) {
				if(datos[i].equals(p.getStock())){
					int stock_v = Integer.parseInt(datos[i]);
					if(stock_v < p.getStock()) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean comprobacion2(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
		for(Producto p : productos) {
			for(Cliente c : clientes) {
				if(c.getSaldo() > p.getPrecio()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void ordenar(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
		for(int i = 0; i < productos.size(); i++) {
			for(int j = 0; j < productos.size(); j++) {
				i
			}
		}
	}
	
	
}
