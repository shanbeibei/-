package com.shanbei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shanbei.domain.Info;
import com.shanbei.service.InfoService;
import com.shanbei.vo.InfoVO;

@Controller
public class InfoController {
@Autowired
private InfoService service;

	@RequestMapping("selects")
	public String selects(Model model,InfoVO infoVO) {
		List<Info> infos = service.selects(infoVO);
		model.addAttribute("infos",infos);
		model.addAttribute("infoVO", infoVO);
		return "infos";
	}
}
