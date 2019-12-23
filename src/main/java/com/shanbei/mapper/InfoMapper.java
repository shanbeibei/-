package com.shanbei.mapper;

import java.util.List;

import com.shanbei.domain.Info;

public interface InfoMapper {
	int insert (List<Info> list);
	
	List<Info> selects();
}
