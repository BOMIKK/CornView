package com.ds.dao;

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
	public List<ImageVO> selectHallImage() throws Exception {
		
		return sqlSession.selectList("mapper.imageMapper.selectHallImage");
	}
	

}
