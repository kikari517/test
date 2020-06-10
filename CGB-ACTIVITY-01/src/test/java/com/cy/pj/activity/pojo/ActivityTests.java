package com.cy.pj.activity.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ActivityTests {
	//private static final Logger log =LoggerFactory.getLogger(ActivityTests.class);
	@Test
	public void testAty01() {
		Activity aty=new Activity();
		aty.setId(10L);
		aty.setTitle("A-Title");
		aty.setCategory("A-Type");
		System.out.println(aty.getId());
		System.out.println(aty.getTitle());
		System.out.println(aty.getCategory());
		log.info(aty.toString());
	}
	
}
