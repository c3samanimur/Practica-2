
public class Main {
	public static void main(String[] args) {
		 Ordenador ordenador1 = new Ordenador("DELL", "XPS", 6, 50);
		 
		 System.out.println(ordenador1);
		 
		 ordenador1.encender();
		 
		 ordenador1.encender();
		 
		 System.out.println(ordenador1 + "\n");
		 
		 ordenador1.apagar();
		 
		 System.out.println(ordenador1);
		 
		 ordenador1.encender();
		 ordenador1.transferirArchivos(10);
		 
		 System.out.println(ordenador1);
		 
	}
	
	
	
}
