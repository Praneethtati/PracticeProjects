
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentdao {
	@Autowired
	Studentrepo repo;

	public Student findbyuser(String user) {
		return repo.findByuser(user);
	}
	
	
	public Student findbypassword(String password) {
		return repo.findBypassword(password);
	}
	
}
