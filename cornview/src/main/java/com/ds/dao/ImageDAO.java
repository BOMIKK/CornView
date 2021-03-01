package com.ds.dao;

import java.util.List;

import com.ds.dto.ImageVO;

public interface ImageDAO {
	
	public List<ImageVO> selectHallImage(int hallID) throws Exception;
	public List<ImageVO> selectHallImageArea(ImageVO imagevo) throws Exception;


}
