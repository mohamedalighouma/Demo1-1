package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Demo11ApplicationTests {

	@Test
	void contextLoads() {
		 assertThat("bar").isEqualTo("bar");	
	}

}
