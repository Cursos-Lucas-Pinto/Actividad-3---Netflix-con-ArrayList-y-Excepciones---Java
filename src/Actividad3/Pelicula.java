package Actividad3;

public class Pelicula extends Netflix implements IVisualizable{
	
	private int año;
	
	public Pelicula() {
		super();
		this.año = 0;
	}
	
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.año = 0;
	}
	
	public Pelicula(String titulo, String genero, String creador, int duracion, int año) {
		super(titulo, genero, creador, duracion);
		this.año = año;
	}
		
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public void marcarVisto() {
		this.visto = true;		
	}

	@Override
	public boolean esVisto() {
		return this.visto;
	}

	@Override
	public int tiempoVisto() {
		return this.getTiempoVisto();
	}
	
	@Override
	public String toString() {
		String mensaje="Titulo: "+ this.getTitulo() + "\nGenero: "+ this.getGenero() + "\nCreador: " + this.getCreador() + "\nDuracion (en minutos): " + this.getDuracion() + "\nAño: " + this.getAño();
		return mensaje;
	}
	
}