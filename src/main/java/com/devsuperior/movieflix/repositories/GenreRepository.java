package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Genre;


public interface GenreRepository extends JpaRepository<Genre, Long> {
	
	/*@Query(nativeQuery = true, value = "SELECT tb_genre.id, tb_genre.name  "
			+ "FROM tb_genre "
			+ "INNER JOIN tb_movie ON tb_movie.genre = tb_genre.id ")
			//+ "WHERE genres.description = :genreName")
	List<Genre> search1();*/
	

}
