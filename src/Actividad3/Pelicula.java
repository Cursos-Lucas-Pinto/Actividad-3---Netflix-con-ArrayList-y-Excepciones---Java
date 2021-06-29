package Actividad3;

public class Pelicula extends Netflix implements IVisualizable{
	
	private int a�o;
	
	public Pelicula() {
		super();
		this.a�o = 0;
	}
	
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.a�o = 0;
	}
	
	public Pelicula(String titulo, String genero, String creador, int duracion, int a�o) {
		super(titulo, genero, creador, duracion);
		this.a�o = a�o;
	}
		
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		String mensaje="Titulo: "+ this.getTitulo() + "\nGenero: "+ this.getGenero() + "\nCreador: " + this.getCreador() + "\nDuracion (en minutos): " + this.getDuracion() + "\nA�o: " + this.getA�o();
		return mensaje;
	}
	
}