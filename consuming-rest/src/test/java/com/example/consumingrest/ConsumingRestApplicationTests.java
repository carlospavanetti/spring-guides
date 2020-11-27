package com.example.consumingrest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootTest
class ConsumingRestApplicationTests {
	@Autowired
	private WebClient client;

	@Test
	void contextLoads() {
		assertThat(client).isNotNull();
	}

}
