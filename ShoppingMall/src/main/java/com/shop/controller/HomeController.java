package com.shop.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String home(Locale locale, Model model, HttpServletRequest req) {
		String ipAddress = req.getRemoteAddr();
		log.info("HomeController Start - ＃{MappingValue = (\"/\")}＃ -- ip : " + ipAddress);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		log.info("HomeController End - ＃{MappingValue = (\"/\")}＃ -- ip : " + ipAddress);
		return "home";
	}
	
}
