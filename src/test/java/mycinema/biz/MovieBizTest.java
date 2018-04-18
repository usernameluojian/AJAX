package mycinema.biz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import mycinema.entity.Movie;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class MovieBizTest {

	@Autowired
	private MovieBiz target;
	
	@Test
	public void testGetMovies() {
		assertEquals(7, target.getMovies(1).size());
		assertEquals(4, target.getMovies(2).size());	
	}

	@Test
	public void testGetMoviesPagings() {
		assertEquals(4, target.getMoviesPagings(1, null, 1, 4).size());
		assertEquals(3, target.getMoviesPagings(1, null, 2, 4).size());
	}

	@Test
	public void testFetchMovieRows() {
		assertEquals(18, target.fetchMovieRows(0, ""));
		assertEquals(7, target.fetchMovieRows(1, ""));
		assertEquals(4, target.fetchMovieRows(0, "的"));
		assertEquals(2, target.fetchMovieRows(1, "的"));
	}

	@Test
	public void testFetchById() {
		Movie m = target.fetchById(1);
		assertEquals("疯狂的石头", m.getTitle());
		assertEquals("喜剧", m.getCategoryName());
	}

	@Test
	public void testAddAndDelete() {
		Movie m = new Movie(0, "title2", "movieCode2", "director2", new Date(System.currentTimeMillis()), 1, null);
		target.add(m);
		assertTrue(m.getId()>0);
		target.delete(m.getId());
		assertNull(target.fetchById(m.getId()));
	}

	@Test
	public void testUpdate() {
		Movie m = new Movie(9, "title3", "movieCode3", "director3", new Date(System.currentTimeMillis()), 2, null);
		target.update(m);
		assertEquals("title3", target.fetchById(9).getTitle());
	}

	@Test
	public void testGetAll() {
		assertEquals(18, target.getAll().size());
	}

}
