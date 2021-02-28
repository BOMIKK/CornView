package com.ds.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.dao.HallDAO;
import com.ds.dto.HallVO;

@Service
public class HallServiceImpl implements HallService{
	
	@Autowired
	private HallDAO dao;

	@Override
	public List<HallVO> selectHall() throws Exception {
		
		System.out.println("서비스 단계");
		
		return dao.selectHall();
	}
	
}
