package com.devsuperior.movieflix.dto;


import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO {
	
	
	private Long id;	
	private String text;		
	private Movie movie;	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text, Movie movie) {		
		this.id = id;
		this.text = text;
		this.movie = movie;
	}
	
	public ReviewDTO(Review entity) {		
		this.id = entity.getId();
		this.text = entity.getText();
		this.movie = entity.getMovie();
		this.user = entity.getUser();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setMovieId(long l) {
		this.movie.setId(l);
		
	}

}
