package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	@Autowired
	StudentDAO dao;
	
	@PostMapping("insert")
	public Student insert(@RequestBody  Student s) {
		return dao.insert(s);
	}
	
	@PostMapping("insertall")
	public Student insert(@RequestBody List<Student> s) {
		return (Student) dao.insertall(s);
	}

	
	
	@GetMapping("getall")
	public List<Student> getall(){
	return dao.getall();
	}
	
	@PutMapping("update")
	public Student update(@RequestBody Student s) {
		return dao.update(s);
	}

	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return dao.deleteByid(id);
	}
  
	@GetMapping("getbyname/{name}")
	public List<Student> getByname(@PathVariable String name){
	return dao.getByName(name);
	}

	
	
	
	
}

