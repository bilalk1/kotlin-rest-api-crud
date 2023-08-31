package vyroonboarding.movieapi.service

import vyroonboarding.movieapi.dto.MovieDTO

interface MovieService {
    fun createMovie(movie: MovieDTO): MovieDTO;
    fun getMovies(): List<MovieDTO>
}