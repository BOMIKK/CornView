package com.ds.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ModelAndView jamsilGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ImageVO> imageList = service.selectHallImage(1);
		ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/jamsil");
		return mav;
	}
    @RequestMapping(value = "/hall/jamsil", method = RequestMethod.POST)
    public ModelAndView jamsilPost(HttpServletRequest httpServletRequest) throws Exception {
    	String area = httpServletRequest.getParameter("area");
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(1);
		imagevo.setImage_part(area);
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
        ModelAndView mav = new ModelAndView();
        return mav; 
    }
	
	@RequestMapping(value="/hall/gc" ,method = RequestMethod.GET) //고척 이미지
	public ModelAndView gcGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ImageVO> imageList = service.selectHallImage(2);
		ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/gc");
		
		return mav;
	}
	
	@ResponseBody
    @RequestMapping(value = "/hall/gc", method = RequestMethod.POST)
    public void gcPost(HttpServletRequest httpServletRequest,Model model) throws Exception {
    	String area = httpServletRequest.getParameter("area");
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(2);
		imagevo.setImage_part(area);
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
        model.addAllAttributes(imageList);
    }

	@RequestMapping(value="/hall/kspo" ,method = RequestMethod.GET) //체조 이미지
	public ModelAndView kspoGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ImageVO> imageList = service.selectHallImage(3);
		ModelAndView mav = new ModelAndView();
		mav.addObject(imageList);
		mav.setViewName("/kspo");
		return mav;
	}
	
    @RequestMapping(value = "/hall/kspo", method = RequestMethod.POST)
    public ModelAndView kspoPost(HttpServletRequest httpServletRequest) throws Exception {
    	String area = httpServletRequest.getParameter("area");
    	ImageVO imagevo = new ImageVO();
		imagevo.setHall_id(3);
		imagevo.setImage_part(area);
		List<ImageVO> imageList = service.selectHallImageArea(imagevo);
        ModelAndView mav = new ModelAndView();
        return mav; 
    }
    
	@RequestMapping(value="/hall/rowNo_detail" ,method = RequestMethod.GET)
	public ModelAndView rowNo_detail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/rowNo_detail");
		return mav;
	}
	

	
}
