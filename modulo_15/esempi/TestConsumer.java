import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String args[]) {
        Videoteca videoteca = new Videoteca();
        SocialBacheca bacheca = new SocialBacheca();
        Film films[] = videoteca.getFilms();
        Film lanternaVerde =  films[7];
        bacheca.aggiornaFilm(lanternaVerde, film -> film.setMediaRecensioni(5));
        System.out.printf("La media voto delle recensioni di %s è stata aggiornata a %s", lanternaVerde.getNome(), lanternaVerde.getMediaRecensioni());

        Film starWarsEpisodio1 =  films[1];
        Consumer<Film> aggiornaVotoConsumer = film -> film.setMediaRecensioni(3);
        Consumer<Film> aggiornaNomeConsumer = film -> film.setNome("Star Wars Episodio 1 - La minaccia fantasma");
        bacheca.aggiornaFilm(starWarsEpisodio1, aggiornaNomeConsumer.andThen(aggiornaVotoConsumer));
        System.out.printf("\nLa media voto delle recensioni di %s è stata aggiornata a %s", starWarsEpisodio1.getNome(), starWarsEpisodio1.getMediaRecensioni());

    }
}