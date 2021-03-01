package com.ds.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.dao.ImageDAO;
import com.ds.dto.ImageVO;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	ImageDAO dao;
	
	@Override
	public List<ImageVO> selectHallImage(int hallID) throws Exception {
		return dao.selectHallImage(hallID);
	}
	

}
