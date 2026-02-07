package Classes;

import java.util.ArrayList;



public class Alumno {
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private String direccion;
	private String nre;
	private ArrayList<Modulo> mod;
	
	public Alumno(int id, String nombre, String apellidos, String email, String direccion, String nre) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.nre = nre;
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
		if(nombre.length() >= 3) {
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
	
	public String getNre() {
		return nre;
	}
	public void setNre(String nre) {
		this.nre = nre;
	}
	public void addModulo(Modulo m) {
		this.mod.add(m);
	}
	public ArrayList<Modulo> listaModulos(){
		return mod;
	}
	
	public String toString() {
		return "ID: " + this.id+ "\n" + 
				"Nombre: " + this.nombre + "\n" + 
				"Apellidos: " + this.apellidos + "\n" + 
				"Email: " + this.email + "\n" + 
				"Direccion: " + this.direccion + "\n" + 
				"NRE: " + this.nre;
	}


	


	
	
	
}
