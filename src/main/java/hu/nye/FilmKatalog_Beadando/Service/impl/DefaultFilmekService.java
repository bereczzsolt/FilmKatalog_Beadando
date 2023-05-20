package hu.nye.FilmKatalog_Beadando.Service.impl;

import hu.nye.FilmKatalog_Beadando.Data.model.Filmek;
import hu.nye.FilmKatalog_Beadando.Data.repository.Repository;
import hu.nye.FilmKatalog_Beadando.Service.FilmekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultFilmekService implements FilmekService {

    private final Repository<Filmek, Long> filmekRepository;
    @Autowired
    public DefaultFilmekService(Repository<Filmek, Long> filmekRepository) {
        this.filmekRepository = filmekRepository;
    }


    @Override
    public Filmek createFilmek(Filmek filmek) {
        return filmekRepository.save(filmek);
    }

    @Override
    public Filmek retrieveFilmekById(Long id) {
        return filmekRepository.getById(id);
    }

    @Override
    public List<Filmek> retrieveAllFilmek() {
        return filmekRepository.getAll();
    }

    @Override
    public Filmek updateFilmek(Filmek filmek) {
        return filmekRepository.update(filmek);
    }

    @Override
    public void deleteFilmekById(Long id) {
        filmekRepository.deleteById(id);
    }
}
