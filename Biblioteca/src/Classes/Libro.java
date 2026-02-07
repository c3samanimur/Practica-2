package Classes;

public class Libro {
	public String titulo;
	public String autor;
	public String isbn;
	public boolean prestado;
	
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.prestado = false;
	}
	public Libro(String titulo, String autor, String isbn, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.prestado = prestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String toString() {
		String estado = (this.prestado == true ? "[PRESTADO] 🔴" : "[DISPONIBLE] 🟢");
		return "[ " + estado + " ] " + titulo + " (ISBN: " + isbn + ")";
	}
}
