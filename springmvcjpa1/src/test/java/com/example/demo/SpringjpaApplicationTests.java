
package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringjpaApplicationTests {


	@Autowired
	StudentRepository repo;
	
	@Test
	public void test() {
		System.out.println("inside the test");
		Student s=new Student();
		s.setName("karthik");
		s.setEmail("k@c.c");
		//repo.save(s);
		assertNotNull(repo.save(s));
		
	}
}

