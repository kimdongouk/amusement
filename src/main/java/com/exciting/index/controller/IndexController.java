package com.exciting.index.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Controller
@Data
@Log4j2
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "index";
	}
	
}
