package metodos;

public class estudiante {
	public String nombre;
	public String apellidos;
	private double calificacion;
	
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		if(calificacion >= 0 && calificacion <= 10) {
			//El this es OBLIGATORIO cuando hay una variable local y una definida con el mismo nombre.
			this.calificacion = calificacion;
		}
		
	}
	
	
}
