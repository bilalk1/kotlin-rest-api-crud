package vyroonboarding.movieapi.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import vyroonboarding.movieapi.entity.Movie

interface MovieRepository : CrudRepository<Movie, Int>{

    @Query("SELECT m FROM Movie as m")
    fun getAllMovies():List<Movie>
}