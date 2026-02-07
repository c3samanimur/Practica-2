
public class Alumno {
	private String nombre;
	private String apellidos;
	private String nre;
	private String email;
	private String direccion;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, String nre, String email, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nre = nre;
		this.email = email;
		this.direccion = direccion;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() >= 3) {
			this.nombre = nombre;
		}
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if(apellidos.length() >= 6) {
			this.apellidos = apellidos;
		}
	}
	public String getNre() {
		return nre;
	}
	public void setNre(String nre) {
		if(nre.length() >= 8) {
			this.nre = nre;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() >= 6) {
			this.email = email;
		}
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		if(direccion.length() >= 0) {
			this.direccion = direccion;
		}
	}
	
	public String info() {
		return "Nombre: " + this.nombre + "\n" + 
				"Apellidos " + this.apellidos + "\n" + 
				"NRE: " + this.nre + "\n" + 
				"Email: " + this.email + "\n" + 
				"Dirección: " + this.direccion + "\n";
	}
	
}

