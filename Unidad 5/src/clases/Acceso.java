package clases;

public class Acceso {
	private String usuario;
	private String ip;
	private String fecha;
	private String nivelError;
	
	public Acceso(String usuario, String ip, String fecha, String nivelError) {
		this.usuario = usuario;
		this.ip = ip;
		this.fecha = fecha;
		this.nivelError = nivelError;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNivelError() {
		return nivelError;
	}

	public void setNivelError(String nivelError) {
		this.nivelError = nivelError;
	}
	
	public String toString() {
		return "[ " + this.fecha + " ] user: " + this.usuario + " IP: " + this.ip + 
				" level: " + this.nivelError;
	}
}
