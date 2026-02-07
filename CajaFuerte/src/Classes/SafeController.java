package Classes;
public class SafeController {
	private DigitalSafe currentSafe;
	private boolean isOpen;
	
	public SafeController(DigitalSafe currentSafe) {
		this.currentSafe = currentSafe;
	}
	
	
	
	public DigitalSafe getCurrentSafe() {
		return currentSafe;
	}



	public void setCurrentSafe(DigitalSafe currentSafe) {
		this.currentSafe = currentSafe;
	}



	public boolean isOpen() {
		return isOpen;
	}



	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}



	public void openSafe(String pin) {
		String realPin = this.currentSafe.getPin();		
		
		if(realPin.equals(pin)) {
			isOpen = true;
		} else {
			System.out.println("CONTRASEÑA INCORRECTA");
			isOpen = false;
		}
	}
	
	public void closeSafe() {
		isOpen = false;
	}
	
	public void deposit(double amount) {
	
		if(amount <= SafeConfig.limite) {
			currentSafe.updateBalance(amount);
		} else {
			System.out.println("Cantidad superior al límite permitido");
		}
	}
	
	public void withdraw(double amount) {
		
		if(amount <= SafeConfig.limite) {
			currentSafe.updateBalance(-amount);
		}
	}
	
}
