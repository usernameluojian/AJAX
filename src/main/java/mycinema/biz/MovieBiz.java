package mycinema.biz;

import java.util.List;

import mycinema.entity.Movie;

public interface MovieBiz {
	List<Movie> getAll();
	List<Movie> getMovies(int cid);
	List<Movie> getMoviesPagings(int cid, String title, int startRow, int maxRows);
	int fetchMovieRows(int cid, String title);
	Movie fetchById(int id);
	void add(Movie movie);
	void update(Movie movie);
	void delete(int id);
}
