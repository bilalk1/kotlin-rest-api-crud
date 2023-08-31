package vyroonboarding.movieapi.service

import org.springframework.stereotype.Service
import vyroonboarding.movieapi.dto.MovieDTO
import vyroonboarding.movieapi.repository.MovieRepository
import vyroonboarding.movieapi.utils.mapper.MovieMapper

@Service
class MovieServiceImpl(
        private val movieReoisitory: MovieRepository,
        private val movieMapper: MovieMapper
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        val movie = movieMapper.toEntity(movieDTO);
        movieReoisitory.save(movie)
        return movieMapper.fromEntity((movie ));
    }

    override fun getMovies(): List<MovieDTO> {
        val movies  =  movieReoisitory.getAllMovies();
        return movies.map { movieMapper.fromEntity(it) }
    }


}