package com.zcy.project.springcoud.server.clinet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.zcy.project.springcloud.server.client.AppClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AppClient.class)
@AutoConfigureMockMvc
public class TestHelloWorldMock {

	@Autowired
    private MockMvc mvc;
	
//	@Ignore
	@Test
	public void testHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void testApiHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/hello")).andExpect(MockMvcResultMatchers.content().string("introduce from port -1"));
	}
	
}
