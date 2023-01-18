package com.tutorial.databasedemo;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.databasedemo.entity.Person;
import com.tutorial.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All users: {}", dao.findAll().toString());
		log.info("User having id=10001: {}",dao.findById(10001));
		log.info("Deleting user having user id: 10002, no. of Rows deleted=> {}",dao.deleteById(10002));
		Person p = new Person(10004,"Soumalya Bhattacharya","Arambagh",new Date());
		log.info("Inserting into a person",dao.insert(p));
		String dob = "22-01-2001 11:55:00";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = format.parse(dob);
		p.setBirthdate(date);
		log.info("Updating birthdate of person having id: {}",p.getId(),dao.update(p));
	}

}
