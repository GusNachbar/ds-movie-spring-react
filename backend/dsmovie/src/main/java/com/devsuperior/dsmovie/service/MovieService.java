package com.devsuperior.dsmovie.service;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.mapper.MoviesMapper;
import com.devsuperior.dsmovie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MoviesMapper moviesMapper;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findMovies(Pageable pegeable){
        Page<Movie> movies = movieRepository.findAll(pegeable);
        return movies.map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findMovie(Long id){
        Movie movie = movieRepository.findById(id).get();
        return moviesMapper.dtoToMovie(movie);
    }
}
