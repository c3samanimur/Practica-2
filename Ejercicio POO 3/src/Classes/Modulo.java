package Classes;
import java.util.ArrayList;


public class Modulo {
	private int id_modulo;
	private String nombre;
	private int curso;
	private int horas;
	private String profesor;
	private ArrayList<Alumno> alu;
	
	public Modulo(int id_modulo, String nombre, int curso, int horas, String profesor) {
		this.id_modulo = id_modulo;
		this.nombre = nombre;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
		this.alu = new ArrayList<Alumno>();
	}
	
	
	public int getId_modulo() {
		return id_modulo;
	}
	public void getId_modulo(int id_modulo) {
		this.id_modulo = id_modulo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public void matricularAlumno(Alumno newAlu) {
		this.alu.add(newAlu);
	}
	public ArrayList<Alumno> listaAlumnos(){
		return alu;
	}
	
	



	
	
}
