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
public class HallController {
	//jamsil 1
	//gc 2
	//kspo3
	
	@Autowired
	ImageService service;
	
	@RequestMapping(value="/hall/jamsil" ,method = RequestMethod.GET) //잠실 이미지
	public ModelAndView jamsil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ImageVO> imageList = service.selectHallImage(1);
		ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/jamsil");
		return mav;
	}
	
	@RequestMapping(value="/hall/gc" ,method = RequestMethod.GET) //고척 이미지
	public ModelAndView gc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ImageVO> imageList = service.selectHallImage(2);
		ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/gc");
		
		return mav;
	}

	@RequestMapping(value="/hall/kspo" ,method = RequestMethod.GET) //체조 이미지
	public ModelAndView kspo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ImageVO> imageList = service.selectHallImage(3);
		ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/kspo");
		return mav;
	}
	
	@RequestMapping(value="/hall/rowNo_detail" ,method = RequestMethod.GET)
	public ModelAndView rowNo_detail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/rowNo_detail");
		return mav;
	}
	
	

}
