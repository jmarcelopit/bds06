package com.devsuperior.movieflix.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;			

	@Transactional(readOnly =true)
	public MovieDTO findAllMovie(Long id ){
		
		Movie movie = movieRepository.findById(id).get();
		   return new MovieDTO(movie);
	}
	
	@SuppressWarnings("unchecked")
	public Page<MovieDTO> findMovieForGenre(Long genreId, PageRequest pageRequest){
		
		Page<Movie> list = movieRepository.findAll(pageRequest);
		return (Page<MovieDTO>) list.stream().map(x -> new MovieDTO(x)).collect(Collectors.toList());
	}

	
	
}
