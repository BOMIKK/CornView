package com.ds.dao;

import java.util.List;

import com.ds.dto.HallVO;

public interface HallDAO {
	public List<HallVO> selectHall() throws Exception;
}
