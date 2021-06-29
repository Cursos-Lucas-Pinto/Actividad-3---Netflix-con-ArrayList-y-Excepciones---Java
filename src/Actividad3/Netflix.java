package Actividad3;

public class Netflix {
	
	private String titulo;
	private String genero;
	private String creador;
	public boolean visto;
	public int tiempoVisto;
	private int duracion;
	
	public Netflix() {
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.visto = false;
		this.duracion = 0;
	}
	
	public Netflix(String titulo, String creador) {
		this.titulo = titulo;
		this.genero = "";
		this.creador = creador;
		this.visto = false;
		this.duracion = 0;
	}
	
	public Netflix(String titulo, String genero, String creador, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getTiempoVisto() {
		return tiempoVisto;
	}
	
	public void setTiempoVisto(int tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}
	
}
