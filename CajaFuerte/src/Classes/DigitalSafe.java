package Classes;

public class DigitalSafe {
	private String nombre;
	private String pin;
	private double balance;
	
	public DigitalSafe(String nombre, String pin) {
		this.nombre = nombre;
		this.pin = pin;
		this.balance = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() >= 3) {
			this.nombre = nombre;
		}
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		if(pin.length() >= 5) {
			this.pin = pin;
		} else {
			System.out.println("Contraseña demasiado corta");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void updateBalance(double amount) {
		this.balance = balance + amount;
	}
	
	
	
}
