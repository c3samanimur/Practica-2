import java.util.ArrayList;

public class Alumno {
	private String id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	private String direccion;
	private String telefono;
	private ArrayList<Modulo>mod;
	
	
	
	public Alumno(String id, String nombre, String apellidos, String dni, String email, String direccion, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mod = new ArrayList();
	}
	
	public void guardarModulo(Modulo m) {
		mod.add(m);
	}
	public ArrayList<Modulo> getModulos() {
		return mod;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String toString() {
		return "ID: " + this.id + "\n" + 
				"Nombre: " + this.nombre + "\n" + 
				"Apellidos: " + this.apellidos + "\n" + 
				"DNI: " + this.dni + "\n" + 
				"Email: " + this.email + "\n" + 
				"Dirección: " + this.direccion + "\n" + 
				"Teléfono: " + this.telefono + "\n";
	}
}
