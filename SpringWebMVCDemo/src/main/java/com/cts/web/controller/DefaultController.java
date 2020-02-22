package com.cts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	@RequestMapping({"","/","/home"})
	public ModelAndView defaultGetRequestHandler() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		
		mv.addObject("pageTile", "Home Page-welcome All");
		mv.addObject("developer",new String[] {"vinu","abhi","rash"});
		return mv;
		

}
}
