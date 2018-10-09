package com.boot;

import com.test.service.TestService;
import com.test.service.TestServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunittestApplicationTests {

	private TestService testService=new TestServiceImpl();

	@Test
	public void contextLoads() {

		System.out.println(testService.test());
	}

}
