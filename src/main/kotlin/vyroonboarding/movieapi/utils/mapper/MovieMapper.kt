package vyroonboarding.movieapi.utils.mapper

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import vyroonboarding.movieapi.dto.MovieDTO
import vyroonboarding.movieapi.entity.Movie

@Service
class MovieMapper : Mapper<MovieDTO, Movie> {
    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
            entity.id,
            entity.name,
            entity.rating,
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
            domain.id,
            domain.name,
            domain.rating,
    )
}