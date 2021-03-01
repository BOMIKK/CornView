package com.ds.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ds.service.HallService;
import com.ds.service.ImageService;
import com.ds.dto.HallVO;
import com.ds.dto.ImageVO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private HallService hallService;
	
	@Autowired
	ImageService service;
	
	@Autowired
	private ImageService imageService;
	HallVO hallVo;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome ho me! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/venue", method = RequestMethod.GET)
	public ModelAndView venue(Locale locale, Model model) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(2);
		imagevo.setImage_part("part1");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		System.out.print(imageList.get(0).getImage_part());
		System.out.print(imageList.get(0).getImage_name());
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList",imageList);
		mav.setViewName("/venue_detail");
		return mav;
	}
	
	
	

	@RequestMapping(value="/" ,method = RequestMethod.GET)
	public ModelAndView Main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		
		List<HallVO> hallList=hallService.selectHall();
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("hallList", hallList);
		
		mav.setViewName("/main");
		
		return mav;
	}
	
    
	
	@RequestMapping(value = "/rowNo", method = RequestMethod.GET)
	public ModelAndView rowNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		//List<ImageVO> imgList=imageService.selectHallImage();
		
		ModelAndView mav = new ModelAndView();
		//mav.addObject("imgList", imgList);
		
		mav.setViewName("/rowNo_detail");
		
		return mav;
	}
	
	
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String viewName = uri.substring(begin, end);
		if (viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		if (viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
		}
		return viewName;
	}
	
	
	
	
}
