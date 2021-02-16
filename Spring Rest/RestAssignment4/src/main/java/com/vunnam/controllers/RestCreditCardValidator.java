package com.vunnam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vunnam.model.CreditCard;
import com.vunnam.services.ServiceCreditCheck;

@RestController
public class RestCreditCardValidator {
	
	@Autowired
	ServiceCreditCheck service;
	
	@RequestMapping(value="/validate", method=RequestMethod.PUT)
	public CreditCard validate(@RequestParam("credit_card") String card) {
		CreditCard cc = service.validate(card);
		return cc;
	}
	
	@RequestMapping("/check")
	public String checking() {
		String rs = service.check();
		return rs;
	}
}
