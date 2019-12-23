package com.shanbei.service;

import java.util.List;

import com.shanbei.domain.Info;
import com.shanbei.vo.InfoVO;

public interface InfoService {
	int insert (List<Info> list); 
	
	List<Info> selects(InfoVO infoVO);
}
