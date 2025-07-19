package com.example.demo;

import com.example.demo.service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MovieService movieService;

	@Test
	void testIsNotNull() {
		assertNotNull(movieService);
	}

}
