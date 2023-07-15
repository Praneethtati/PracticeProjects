
package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
Logger log=Logger.getAnonymousLogger();
@RequestMapping("/first")
	public ModelAndView displayid(HttpServletRequest req,HttpServletResponse res) {
	log.info("entered into the model and view of displayid");
	log.info("ready to take id value");	
	String id=req.getParameter("id");
	log.info("input taken for id");

		ModelAndView mv=new ModelAndView();
		log.info("going to jsp page");
		mv.setViewName("display.jsp");
		log.info("entered the jsp and taken the id value");
		mv.addObject("id", id);
		
		return mv;
	}

@ResponseBody
@RequestMapping("/second")
public String displayname(HttpServletRequest req,HttpServletResponse res) {
	String name=req.getParameter("name");
	return name;
}
	
}

