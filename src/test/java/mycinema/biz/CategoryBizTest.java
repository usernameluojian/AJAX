package mycinema.biz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import mycinema.entity.Category;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class CategoryBizTest {
	@Autowired
	private CategoryBiz target;

	@Test
	public void testGetAll() {
		assertEquals(5, target.getAll().size());
	}

	@Test
	public void testFetchById() {
		assertEquals("喜剧", target.fetchById(1).getName());
	}

	@Test
	public void testAddAndDelete() {
		Category c = new Category(0, "其他");
		target.add(c);
		assertTrue(c.getId()>0);
		target.delete(c.getId());
		assertNull(target.fetchById(c.getId()));
	}

	@Test
	public void testUpdate() {
		Category c = new Category(5, "科普");
		target.update(c);
		assertEquals("科普", target.fetchById(5).getName());
	}

}
