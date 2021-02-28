package com.ds.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ds.dao.HallDAO;
import com.ds.dto.HallVO;

@Service
public class HallServiceImpl implements HallService{
	
	@Inject
	private HallDAO dao;

	@Override
	public List<HallVO> selectHall() throws Exception {
		return dao.selectHall();
	}
	
}
