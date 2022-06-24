package com.devsuperior.movieflix.dto;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

public class GenreDTO {
	
	
	private Long id;	
	private String name;	
	
	private Set<MovieDTO> movies = new HashSet<>();
	
	
	public GenreDTO() {
		
	}

	public GenreDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}	


	public GenreDTO(Genre entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	public GenreDTO(Genre entity, Set<Movie> movie) {
		this(entity);
		movie.forEach(mov -> this.movies.add(new MovieDTO(mov)));
			
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<MovieDTO> getMovies() {
		return movies;
	}
	

}
