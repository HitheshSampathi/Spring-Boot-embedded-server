package com.hithesh.embeddedserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;

@SpringBootTest
class EmbeddedServerApplicationTests {

	@MockBean
	private ServletWebServerApplicationContext webServerAppCtxt;

	@Test
	void contextLoads() {
	}


}
