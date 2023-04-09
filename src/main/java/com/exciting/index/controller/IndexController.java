package com.exciting.index.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.exciting.dto.AmusementAimageDTO;
import com.exciting.dto.AmusementDTO;
import com.exciting.dto.PromotionDTO;
import com.exciting.index.service.AmusementService;
import com.exciting.index.service.PromotionService;
import com.exciting.index.service.SelectedService;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Controller
@Data
@Log4j2
public class IndexController {
	
	@Autowired
	AmusementService amusementService;
	@Autowired
	PromotionService promotionService; 
	@Autowired
	SelectedService selectedService; 
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
//		합친 후 memberid의 값은 아래 코드로 바꿈
//		HttpSession session = request.getSession();
//		String member_id = (String) session.getAttribute("member_id");
		String member_id = "hong1";
		if(!(member_id.equals("")) || member_id != null) {
			
		}
		
		List<AmusementAimageDTO> koreaData = amusementService.selectListAmuseInfoKorea();
		List<AmusementAimageDTO> foreignData = amusementService.selectListAmuseInfoForeign();
		List<PromotionDTO> promotionData =  promotionService.selectList();
		mav.setViewName("index");
		mav.addObject("koreaData", koreaData);
		mav.addObject("foreignData", foreignData);
		mav.addObject("promotionData", promotionData);
		mav.addObject("member_id", member_id);
		return mav;
	}
	
}
