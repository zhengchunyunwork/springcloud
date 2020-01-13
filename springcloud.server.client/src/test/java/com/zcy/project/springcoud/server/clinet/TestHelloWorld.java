package com.zcy.project.springcoud.server.clinet;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.zcy.project.springcloud.server.client.AppClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AppClient.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestHelloWorld {

	
	@LocalServerPort
	private int port;
	
	private URL base;
	
	@Autowired
	private TestRestTemplate template;
	
	@Before
	public void setup() throws Exception {
		this.base = new URL("http://localhost:" + port + "/api/hello");
	}
	
	@Test
	public void getHello() {
		ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
		assertEquals(response.getStatusCodeValue(), 200);
	}
}
