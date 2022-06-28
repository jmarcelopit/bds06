package com.devsuperior.movieflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.services.MovieService;


@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<MovieDTO> findMovieById(@PathVariable Long id) {
		//PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
		MovieDTO movie = service.findAllMovie(id);		
		return ResponseEntity.ok().body(movie);
	}
	
	
	/*@GetMapping(value="/{id}")
	public ResponseEntity<Page<MovieDTO>> findMovieForGenre(@PathVariable Long genreId,Pageable pageable) {
		PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
		Page<MovieDTO> list = service.findMovieForGenre(genreId, pageRequest);		
		return ResponseEntity.ok().body(list);
	}*/
	

}
