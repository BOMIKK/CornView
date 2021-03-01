package com.ds.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.dto.ImageVO;

@Repository
public class ImageDAOImpl implements ImageDAO {
	
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<ImageVO> selectHallImage(int hallID) throws Exception {
		
		return sqlSession.selectList("mapper.imageMapper.selectHallImage",hallID);
	}

	@Override
	public List<ImageVO> selectHallImageArea(ImageVO imagevo) throws Exception {

		return sqlSession.selectList("mapper.imageMapper.selectHallImageArea",imagevo);
	}
	

}
