package com.ds.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HallController {
	@RequestMapping(value="/hall/gc" ,method = RequestMethod.GET)
	public ModelAndView gc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/gc");
		return mav;
	}
	@RequestMapping(value="/hall/jamsil" ,method = RequestMethod.GET)
	public ModelAndView jamsil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/jamsil");
		return mav;
	}
	@RequestMapping(value="/hall/kspo" ,method = RequestMethod.GET)
	public ModelAndView kspo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/");
		return mav;
	}

}
