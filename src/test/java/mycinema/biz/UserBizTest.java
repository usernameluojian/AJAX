package mycinema.biz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;



@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class UserBizTest {

	@Autowired
	private UserBiz target;
	
	@Test
	public void testCheckLogin(){
		Assert.assertNotNull(target.checkLogin("sam", "123"));
		Assert.assertNull(target.checkLogin("sam", "1234"));
	}
}
