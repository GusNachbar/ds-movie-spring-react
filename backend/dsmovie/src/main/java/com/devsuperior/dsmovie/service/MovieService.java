package com.devsuperior.dsmovie.service;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findMovies(Pageable pegeable){
        Page<Movie> movies = movieRepository.findAll(pegeable);
        return movies.map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findMovie(Long id){
        Movie movie = movieRepository.findById(id).get();
        MovieDTO dto = new MovieDTO(movie);
        return dto;
    }
}
