package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>  {
	
	
	
	/*@Query(nativeQuery = true, value = "SELECT mov.id as idMovie,  mov.title, mov.sub_title,  mov.img_url, gen.name as nameGenre, gen.id as idGenre "
			+ " FROM tb_movie mov " 
			+ " INNER JOIN tb_genre gen ON mov.genre_id = gen.id  "	      
	        + " ORDER BY mov.title DESC ")
	List<MovieGenre> listAllMovie();*/
	
	@Query("SELECT mov "
			+ "FROM Movie mov "
			+ "WHERE mov.id=:idMovie")			
	List<Movie> search1(Long idMovie);

	
	
	
	

}
