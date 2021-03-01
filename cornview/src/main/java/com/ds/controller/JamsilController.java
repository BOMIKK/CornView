package com.ds.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ds.dto.ImageVO;
import com.ds.service.ImageService;

@Controller
public class JamsilController {
	
	@Autowired
	ImageService service;
	
	final int HALL_ID = 1;
	
	@RequestMapping(value="/jamsil" ,method = RequestMethod.GET) //잠실 이미지
	public ModelAndView jamsilGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_area("");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
        ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/jamsil");
		return mav;
	}
	

}
