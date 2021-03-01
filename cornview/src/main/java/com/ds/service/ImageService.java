package com.ds.service;

import java.util.List;

import com.ds.dto.ImageVO;

public interface ImageService {
	
	public List<ImageVO> selectHallImage(int hallID) throws Exception;
	

}
