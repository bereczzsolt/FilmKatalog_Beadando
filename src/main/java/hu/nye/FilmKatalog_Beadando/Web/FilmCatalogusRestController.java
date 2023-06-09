package hu.nye.FilmKatalog_Beadando.Web;

import hu.nye.FilmKatalog_Beadando.Data.model.Filmek;
import hu.nye.FilmKatalog_Beadando.Service.FilmekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/filmek")
public class FilmCatalogusRestController {

    private final FilmekService filmekService;
    @Autowired
    public FilmCatalogusRestController(FilmekService filmekService) {
        this.filmekService = filmekService;
    }
    @GetMapping("/{id}")
    public Filmek getFilmekById(@PathVariable Long id){
        return filmekService.retrieveFilmekById(id);
    }
    @GetMapping
    public List<Filmek>getAllKonyvek(){
        return filmekService.retrieveAllFilmek();
    }
    @PostMapping
    public Filmek createFilmek(@RequestBody Filmek filmek){
        return filmekService.createFilmek(filmek);
    }

    @PutMapping
    public Filmek updateFilmek(@RequestBody Filmek filmek){
        return filmekService.updateFilmek(filmek);
    }

    @DeleteMapping("/{id}")
    public void deleteFilmekById(@PathVariable Long id){
        filmekService.deleteFilmekById(id);
    }



}