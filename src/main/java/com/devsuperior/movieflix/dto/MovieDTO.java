package com.devsuperior.movieflix.dto;

import java.util.HashSet;
import java.util.Set;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.projections.MovieGenre;

public class MovieDTO {
	
	
	private Long id;	
	private String title;
	private String subTitle;
	private Integer year;
	private String imgUrl;
	private String synopsis;	
	private Genre genre ;		
	private Set<ReviewDTO> reviews =  new HashSet<>();
	
	public MovieDTO() {}
	

	public Set<ReviewDTO> getReviews() {
		return reviews;
	}

	public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis, Genre genre) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genre = genre;
	}
	

	public MovieDTO(Movie entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.subTitle = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.synopsis = entity.getSynopsis();
		this.genre = entity.getGenre();
	}
	
		
	public MovieDTO(Movie entity, Set<Review> rev) {
		this(entity);
		rev.forEach(obj -> this.reviews.add(new ReviewDTO(obj)));			
	}
	
	public MovieDTO(MovieGenre entity) {
		this.id = entity.getIdMovie();
		this.title= entity.getTitle();
		this.subTitle = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();		
		this.genre.setId(entity.getIdGenre()); 
		this.genre.setName(entity.getNameGenre());
	}


	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

}
