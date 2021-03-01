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
public class GcController {
	
	@Autowired
	ImageService service;
	final int HALL_ID = 2;
	
	@RequestMapping(value="/gc1" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc1(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part1");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		System.out.print(imageList.get(0).getImage_part());
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc1");
		return mav;
	}
	@RequestMapping(value="/gc2" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc2(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part2");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc2");
		return mav;
	}
	@RequestMapping(value="/gc31" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc31(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part3");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc31");
		return mav;
	}
	@RequestMapping(value="/gc32" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc32(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part4");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc32");
		return mav;
	}
	@RequestMapping(value="/gc41" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc41(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part5");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc41");
		return mav;
	}
	@RequestMapping(value="/gc42" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc42(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part6");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc42");
		return mav;
	}
	@RequestMapping(value="/gc5" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc5(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part7");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc5");
		return mav;
	}
	@RequestMapping(value="/gc7" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc6(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part8");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc7");
		return mav;
	}
	@RequestMapping(value="/gc6" ,method = RequestMethod.GET) //∞Ì√¥ ¿ÃπÃ¡ˆ
	public ModelAndView gc7(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(HALL_ID);
		imagevo.setImage_part("part9");
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageList", imageList);
		mav.setViewName("/gc6");
		return mav;
	}
	

}
