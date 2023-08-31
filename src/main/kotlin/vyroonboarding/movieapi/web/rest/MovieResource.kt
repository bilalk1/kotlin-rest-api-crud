package vyroonboarding.movieapi.web.rest

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import vyroonboarding.movieapi.dto.MovieDTO
import vyroonboarding.movieapi.service.MovieService

@RestController
class MovieResource(
        private val movieService: MovieService
) {
    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        try {
            return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED);
        } catch (error: IllegalArgumentException) {
            return ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    fun getMovies(): List<MovieDTO>{
        return movieService.getMovies();
    }

    @GetMapping
    fun getMovieById
}