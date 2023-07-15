package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
@Autowired
	Studentdao dao;

Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("/register-user/{suser}/{spassword}/{semail}")
public String registermicroservice(HttpServletRequest req,HttpServletResponse res,@PathVariable("suser") String suser,@PathVariable("spassword") String spassword,@PathVariable("semail") String semail)
{
	Student student =new Student();
	student.setSuser(suser);
	student.setSpassword(spassword);
	student.setSemail(semail);
	 log.info("values set");
	 log.info(student.getSuser()+"   "+student.getSpassword()+"   "+student.getSemail());
	 
	 Student ss=dao.insert(student);
	 if(ss!=null) {
		 return "registration is successfull";
	 }
	 else {
		 return "registration failed";
	 }
}
	
}

