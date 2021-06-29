package Actividad3;

public class Serie extends Netflix implements IVisualizable{
	
	private int nTemporada;
	
	public Serie() {
		super();
		this.nTemporada = 1;
	}
	
	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.nTemporada = 1;
	}
	
	public Serie(String titulo, String genero, String creador, int duracion, int nTemporada) {
		super(titulo, genero, creador, duracion);
		this.nTemporada = nTemporada;
	}

	public int getnTemporada() {
		return nTemporada;
	}

	public void setnTemporada(int nTemporada) {
		this.nTemporada = nTemporada;
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
		String mensaje="Titulo: "+ this.getTitulo() + "\nGenero: "+ this.getGenero() + "\nCreador: " + this.getCreador() + "\nDuracion (en minutos): " + this.getDuracion() + "\nN° de temporadas: " + this.getnTemporada();
		return mensaje;
	}
	
}
