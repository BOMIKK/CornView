package com.ds.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.dto.HallVO;

@Repository 
public class HallDAOImpl implements HallDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<HallVO> selectHall() throws Exception {
		
		System.out.println("sql세션 단계");
		return sqlSession.selectList("mapper.cornviewMapper.selectHall");
	}
	
}
