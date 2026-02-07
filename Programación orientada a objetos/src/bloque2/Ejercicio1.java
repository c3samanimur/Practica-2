package bloque2;

public class Ejercicio1 {
	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Perico", 0);
		System.out.println(c1);
		c1.ingresar(1000);
		System.out.println(c1);
		c1.retirar(300);
		System.out.println(c1);
		c1.retirar(800);
		System.out.println(c1);
		c1.ingresar(200);
		System.out.println(c1);
		c1.retirar(100);
		System.out.println(c1);
		c1.retirar(500);
		System.out.println(c1);
		
	}
}
