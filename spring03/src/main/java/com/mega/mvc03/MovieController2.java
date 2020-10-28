package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController2 {

	// 알아서 찾아서 넣어
	@Autowired
	CalPrice service;

	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		model.addAttribute("reply", reply);
	}
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model model) {
		System.out.println("받은 값 확인용: " + title + price);

		price = service.CalPrice(price);
		model.addAttribute("title", title);
		model.addAttribute("price", price);

		return "like";
	}
}
