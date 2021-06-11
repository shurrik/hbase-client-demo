package com.example.demo;

import lgh.springboot.starter.hbase.template.HBaseTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private HBaseTemplate hBaseTemplate;

	@Test
	void contextLoads() {
	}


}
