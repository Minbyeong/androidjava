package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("test")
	public String movie(String title, String price, Model model) {
		System.out.println("받은 값 확인용: " + title + price);
		int price1 = Integer.parseInt(price);
		if( price1 >= 10000) {
			price1 -= 1000;
		}
		model.addAttribute("title", title);
		model.addAttribute("price", price1);
		
		return "like";
	}
}
