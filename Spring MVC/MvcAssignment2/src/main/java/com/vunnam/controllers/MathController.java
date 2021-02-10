package com.vunnam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vunnam.dataClasses.SimpleInterest;

@Controller
public class MathController {
	
	@RequestMapping("/simpleInterest.html")
	public ModelAndView intrestController(@ModelAttribute("simpleInterest1") SimpleInterest simpleInterest1) {
		ModelAndView mv = new ModelAndView("calculateSI");
		mv.addObject("ans", simpleInterest1.getInterest());
		return mv;
	}

}
