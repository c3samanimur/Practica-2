
public class Libro {
	private String isbn;
	private String titulo;
	private int paginas;
	private String autor;
	private boolean prestado;
	
	public Libro() {
		
	}
	
	public Libro(String isbn, String titulo, int paginas, String autor, boolean prestado) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.paginas = paginas;
		this.autor = autor;
		this.prestado = prestado;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		if(isbn.length() > 0) {
			this.isbn = isbn;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.length() > 0) {
			this.titulo = titulo;
		}
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		if(paginas > 0) {
			this.paginas = paginas;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor.length() > 0) {
			this.autor = autor;
		}
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestado() {
		if(this.prestado) {
			System.out.println("Libro prestado");
		} else {
			this.prestado = true;
		}
	}
	public void devolver() {
		if(!prestado) {
			System.out.println("Libro no prestado");
		} else {
			this.prestado = false;
		}
	}
	
	public double imprimir(double coste) {
		return this.paginas * coste;
	}
	
	public String toString() {
		String mensaje = "El libro " + getIsbn() + " con titulo " + getTitulo() + " y autor "
				+ getAutor() + " tiene " + getPaginas() + " paginas y ";
		
		if(prestado) {
			mensaje += " esta prestado";
		} else {
			mensaje += " no esta prestado";
		}
		
		return mensaje;
	}
	
}
