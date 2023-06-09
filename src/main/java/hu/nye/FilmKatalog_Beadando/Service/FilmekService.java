package hu.nye.FilmKatalog_Beadando.Service;

import hu.nye.FilmKatalog_Beadando.Data.model.Filmek;

import java.util.List;

/**
 * TODO.
 */

public interface FilmekService {

    Filmek createFilmek(Filmek filmek);

    Filmek retrieveFilmekById(Long id);

    List<Filmek>retrieveAllFilmek();

    Filmek updateFilmek(Filmek filmek);

    void deleteFilmekById(Long id);
}
