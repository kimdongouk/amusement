package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exciting.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TimeMapperTests {
	
	@Setter(onMethod_ = {@Autowired})
	private TimeMapper timeMapper;
	
	@Test
	public void testExist() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
	}
	
	/*
	 * @Test public void testExist2() { log.info("==========getTime2=========");
	 * log.info(timeMapper.getTime2()); }
	 */
	
}
