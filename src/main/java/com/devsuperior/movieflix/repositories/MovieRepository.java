package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>  {
	
	
	
	/*@Query(nativeQuery = true, value = "SELECT mov.id as idMovie,  mov.title, mov.sub_title,  mov.img_url, gen.name as nameGenre, gen.id as idGenre "
			+ " FROM tb_movie mov " 
			+ " INNER JOIN tb_genre gen ON mov.genre_id = gen.id  "	      
	        + " ORDER BY mov.title DESC ")
	List<MovieGenre> listAllMovie();
	
	@Query("SELECT mov "
			+ "FROM Movie mov "
			+ "WHERE mov.id=:idMovie")			
	Movie findMovieById(Long idMovie);
	
	@Query("SELECT mov "
			+ "FROM Movie mov "
			+ "WHERE mov.genre.id=:idGenre")
	Page<Movie> findMovieByGenre(Long idGenre,Pageable pageable);*/

	@Query("SELECT obj FROM Movie obj WHERE :genre IS NULL OR obj.genre = :genre ORDER BY obj.title")
	Page<Movie> findByGenre(Genre genre, Pageable pageable);
	
	@Query("SELECT obj FROM Movie obj JOIN FETCH obj.genre WHERE obj IN :movies")
	List<Movie> findMoviesAndGenres(List<Movie> movies);
	
	
	

}
