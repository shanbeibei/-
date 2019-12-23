package com.shanbei.service.impl;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.common.utils.StreamUtil;
import com.shanbei.domain.Info;
import com.shanbei.service.InfoService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class InfoServiceImplTest {
@Autowired
private InfoService service;
	@Test
	public void testInsert() throws IOException {
		
		InputStream inputStream = this.getClass().getResourceAsStream("/data.txt");
		List<String> list = StreamUtil.read(inputStream);
		List<Info> list2 = new ArrayList<Info>();
		for (String str : list) {
			String[] split = str.split(",");
			Info info = new Info();
			info.setCardno(split[0]);
			info.setCreated(split[1]);
			info.setJd(Double.valueOf(split[2]));
			info.setWd(Double.valueOf(split[3]));
			
			list2.add(info);
		}
		service.insert(list2);
		
	}

}
