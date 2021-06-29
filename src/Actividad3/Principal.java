package Actividad3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		int posSerieMasLarga = 0;
		int posPelMasReciente = 0;
		
		Pelicula pelicula1 = new Pelicula();
		Pelicula pelicula2 = new Pelicula("Spiderman", "Sam Raimi");
		Pelicula pelicula3 = new Pelicula("Batman", "Bob Kane");
		Pelicula pelicula4 = new Pelicula("Superman", "Accion", "Mario Puzo", 143, 1978);
		Pelicula pelicula5 = new Pelicula("Terminator", "Ciencia Ficcion", "Harlan Ellison", 108, 1985);
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Juego de Tronos", "George Martin");
		Serie serie3 = new Serie("Stranger Things", "Misterio", "Hermanos Duffer", 60, 3);
		Serie serie4 = new Serie("House of Cards", "Beau Willimon");
		Serie serie5 = new Serie("Peaky Blinders", "Accion", "Steven Knight", 60, 5);
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		
		try {
		peliculas.add(pelicula1);
		peliculas.add(pelicula2);
		peliculas.add(pelicula3);
		peliculas.add(pelicula4);
		peliculas.add(pelicula5);
		peliculas.add(23,pelicula5);
		} catch (IndexOutOfBoundsException arrayE) {
			System.out.println("Estas intentado asignar un objeto en una posicion inexistente.");
		}
		finally {
			System.out.println("Se produjo una excepcion.\n");
		}
		
		
		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		series.add(serie4);
		series.add(serie5);
		
		//marcar visto
		peliculas.get(2).marcarVisto();
		peliculas.get(4).marcarVisto();
		
		series.get(3).marcarVisto();
		series.get(4).marcarVisto();
		
		//insertar tiempo de visualizacion
		peliculas.get(0).setTiempoVisto(38);
		peliculas.get(1).setTiempoVisto(45);
		peliculas.get(2).setTiempoVisto(90);
		peliculas.get(3).setTiempoVisto(18);
		peliculas.get(4).setTiempoVisto(15);
		
		//Peliculas que se visualizaron
		System.out.println("Peliculas que se visualizaron:");
		for(int i = 0; i < 5; i++) {
			if(peliculas.get(i).esVisto() == true) {
				System.out.println("Titulo: " + peliculas.get(i).getTitulo());
				System.out.println("Tiempo de visualización (en minutos): " + peliculas.get(i).tiempoVisto());
				System.out.println("");
			}
		}
		
		//insertar tiempo de visualizacion
		series.get(0).setTiempoVisto(32);
		series.get(1).setTiempoVisto(22);
		series.get(2).setTiempoVisto(85);
		series.get(3).setTiempoVisto(17);
		series.get(4).setTiempoVisto(46);
		
		//Series que se visualizaron
		System.out.println("\nSeries que se visualizaron:");
		for(int i = 0; i < 5; i++) {
			if(series.get(i).esVisto() == true) {
				System.out.println("Titulo: " + series.get(i).getTitulo());
				System.out.println("Tiempo de visualización: " + series.get(i).tiempoVisto());
				System.out.println("");
			}
		}

		//Serie con mas temporadas
		System.out.println("\nSerie con mas temporadas: ");
		for(int i = 1; i < 5; i++) {
			if(series.get(i).getnTemporada() > series.get(i-1).getnTemporada()) {
				posSerieMasLarga = i;
			}
		}
		
		System.out.println(series.get(posSerieMasLarga).toString());
		
		//Pelicula mas reciente
		System.out.println("\nPelicula mas reciente: ");
		for(int i = 1; i < 5; i++) {
			if(peliculas.get(i).getAño() > peliculas.get(i-1).getAño()) {
				posPelMasReciente = i;
			}
		}
		
		System.out.println(peliculas.get(posPelMasReciente).toString());
	}
}