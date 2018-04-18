package mycinema.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mycinema.biz.MovieBiz;
import mycinema.dao.MovieMapper;
import mycinema.entity.Movie;

@Service
public class MovieBizImpl implements MovieBiz {

	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public List<Movie> getMovies(int cid) {
		return movieMapper.getMovies(cid);
	}

	@Override
	public List<Movie> getMoviesPagings(int cid, String title, int startRow, int maxRows) {
		return movieMapper.getMoviesPagings(cid, title, startRow, maxRows);
	}

	@Override
	public int fetchMovieRows(int cid, String title) {
		return movieMapper.fetchMovieRows(cid, title);
	}

	@Override
	public Movie fetchById(int id) {
		return movieMapper.fetchById(id);
	}

	@Override
	public void add(Movie movie) {
		movieMapper.add(movie);
	}

	@Override
	public void update(Movie movie) {
		movieMapper.update(movie);
	}

	@Override
	public void delete(int id) {
		movieMapper.delete(id);
	}

	@Override
	public List<Movie> getAll() {
		return movieMapper.getAll();
	}
}
