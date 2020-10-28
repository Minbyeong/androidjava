package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinCheck {

	@Autowired
	IdCheck service;
	
	@RequestMapping("join.do")
	public String join(String id, Model model) {
		String values[] = service.IdCheck(id);
		model.addAttribute("result", values[0]);
		return values[1];
	}
}
