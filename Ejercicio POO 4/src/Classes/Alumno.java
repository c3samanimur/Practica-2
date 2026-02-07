package Classes;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private String curso;
	private String email;
	private int edad;
	
	public Alumno(String nombre, String apellidos, String dni, String curso, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.curso = curso;
		this.edad = edad;
	}
	public Alumno(String nombre, String apellidos, String dni, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() > 0) {
			this.email = email;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if(apellidos.length() > 0){
			this.apellidos = apellidos;
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(dni.length() == 9) {
			this.dni = dni;
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if(curso.length() > 0) {
			this.curso = curso;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad > 5) {
			this.edad = edad;
		}
	}
	
	

	
}
