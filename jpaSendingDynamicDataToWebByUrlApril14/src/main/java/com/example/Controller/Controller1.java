package com.example.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Controller1 {
	@RequestMapping("/add")
	/*public String add(HttpServletRequest req) {*/
		/*
		 * HttpSession session=req.getSession(); String
		 * coursename=req.getParameter("cname");
		 * System.out.println("the course name is :" + coursename);
		 * session.setAttribute("cname", coursename);
		 * System.out.println("this si Siva"); return "course.jsp"; return "course";
		 */

		//another way without using HttpServerRequest...........
		
	
	/*



	}*/
	
	
	
	//third way to send data without using httpSession
	
	
	
public ModelAndView add(@RequestParam("cname") String coursename) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("cname", coursename);
		 mv.setViewName("course");
		 return mv; 
		
	}

}
