package com.shanbei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.common.utils.DistanceUtil;
import com.shanbei.domain.Info;
import com.shanbei.mapper.InfoMapper;
import com.shanbei.service.InfoService;
import com.shanbei.vo.InfoVO;
@Service
public class InfoServiceImpl implements InfoService {
@Autowired
private InfoMapper mapper;
	@Override 
	public int insert(List<Info> list) {
		// TODO Auto-generated method stub
		return mapper.insert(list);
	}
	@Override
	public List<Info> selects(InfoVO infoVO) {
		// TODO Auto-generated method stub
		List<Info> info2 = new ArrayList<Info>();
		List<Info> list = mapper.selects();
		if (null!=infoVO && null!=infoVO.getJd() && null!=infoVO.getWd()) {
			for (Info info : list) {
				Double j2 = info.getJd();
				Double w2 = info.getWd();
				
				double d = DistanceUtil.getDistance(infoVO.getJd(), infoVO.getWd(), j2, w2);
				if (d>=infoVO.getStart()&& d<=infoVO.getEnd()) {
					info.setDistance(d);
					info2.add(info);
				}
			}
			return info2;
		}
		
		return list;
	}


}
