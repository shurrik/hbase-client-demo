package com.example.demo;

import lgh.springboot.starter.hbase.annotation.HBaseEntityScan;
import lgh.springboot.starter.hbase.template.HBaseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@HBaseEntityScan("com.example.demo.entity")
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private HBaseTemplate hbaseTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
