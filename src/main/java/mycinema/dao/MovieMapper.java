package mycinema.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mycinema.entity.Movie;

public interface MovieMapper {
	List<Movie> getAll();
	List<Movie> getMovies(@Param("cid") int cid);
	List<Movie> getMoviesPagings(@Param("cid")int cid, @Param("title")String title, @Param("startRow")int startRow, @Param("maxRows")int maxRows);
	int fetchMovieRows(@Param("cid")int cid, @Param("title")String title);
	Movie fetchById(int id);
	void add(Movie movie);
	void update(Movie movie); 
	void delete(int id);
	List<String> getTitlesByContains(@Param("contains") String contains, @Param("maxRows") int maxRows);
}
