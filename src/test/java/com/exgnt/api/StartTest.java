package com.exgnt.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChasisApplication.class)
@WebAppConfiguration
public class StartTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain() {
		assertTrue(true);
	}

}
