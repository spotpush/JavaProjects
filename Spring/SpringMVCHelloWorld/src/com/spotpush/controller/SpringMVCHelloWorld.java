package com.spotpush.controller;
/**
 * This is a Controller Bean (SpringMVCHelloWorld)
 * When spring scans the package @Controller will tell spring this is a 
 * controller bean for processing requests and @RequestMapping tells spring
 * this controller bean process all requests beginning with /welcome.  The path (/welcome)
 * includes /welcome/* and /welcome.html 
 * @author com.spotpush
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCHelloWorld {

	/**
	 * method helloWorld returns a ModelAndView object which tries to resolve
	 * to a view named 'Welcome'
	 * @return
	 */
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********* Hello World, Spring MVC Tutorial</h3> This"
				+ "message is coming from com.spopushHelloWorld.java *****</div><br><br>"; 
		//"welcome" is case sensitive and refers to \WEB-INF\jsp\welcome.jsp
		return new ModelAndView("welcome", "message", message);
	}
	
	
}
