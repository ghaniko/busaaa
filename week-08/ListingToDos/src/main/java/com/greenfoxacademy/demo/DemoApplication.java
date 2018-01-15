package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.Models.Todo;
import com.greenfoxacademy.demo.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	TodoRepository cruds;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		cruds.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
