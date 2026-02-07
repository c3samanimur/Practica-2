package Ficheros;

public class alumno {
	private int id;
	private String nombre;
	private String apellidos;
	private String fechaNac;
	private String email;
	
	public alumno() {
		
	}
	
	public alumno(int id, String nombre, String apellidos, String fechaNac, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() > 0) {
			this.nombre = nombre;
		}
		
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if(apellidos.length() > 0) {
			this.apellidos = apellidos;
		}
		
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		if(fechaNac.length() > 0) {
			this.fechaNac = fechaNac;
		}
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.length() > 0) {
			this.email = email;
		}
		
		
	}
	public String toString() {
		return nombre + " " + apellidos;
	}
	
	
	
}
