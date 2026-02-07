import java.util.ArrayList;

public class Modulo {
	private String id_mod;
	private String nombre_mod;
	private String curso;
	private String horas;
	private String profesor;
	private ArrayList<Alumno> alu;
	
	public Modulo(String id_mod, String nombre_mod, String curso, String horas, String profesor) {
		this.id_mod = id_mod;
		this.nombre_mod = nombre_mod;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
		this.alu = new ArrayList();
	}
	public void matricularAlu(Alumno a) {
		alu.add(a);
	}
	
	public String getId_mod() {
		return id_mod;
	}

	public void setId_mod(String id_mod) {
		this.id_mod = id_mod;
	}

	public String getNombre_mod() {
		return nombre_mod;
	}

	public void setNombre_mod(String nombre_mod) {
		this.nombre_mod = nombre_mod;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alu;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alu = alumnos;
	}
	
	
	public String toString() {
		return "ID: " + this.id_mod + "\n" + 
				"Nombre: " + this.nombre_mod + "\n" + 
				"Curso: " + this.curso + "\n" + 
				"Horas: " + this.horas + "\n" +
				"Profesor: " + this.profesor + "\n";
	}
	
	
}
