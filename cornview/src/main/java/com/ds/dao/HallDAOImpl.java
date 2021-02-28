package com.ds.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ds.dto.HallVO;

@Repository 
public class HallDAOImpl implements HallDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.ds.mapper.cornviewMapper";
	
	@Override
	public List<HallVO> selectHall() throws Exception {
		return sqlSession.selectList(Namespace+".selectHall");
	}
	
}
