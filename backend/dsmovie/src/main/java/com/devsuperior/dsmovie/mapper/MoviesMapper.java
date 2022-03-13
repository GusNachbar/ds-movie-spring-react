package com.devsuperior.dsmovie.mapper;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;


@Mapper(componentModel = "spring")
public interface MoviesMapper {

  MovieDTO dtoToMovie (Movie movie);
}
