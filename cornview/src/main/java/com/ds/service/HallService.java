package com.ds.service;

import java.util.List;

import com.ds.dto.HallVO;

public interface HallService {
	public List<HallVO> selectHall() throws Exception;
}
