package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 일반 자바 파일: POJO파일 (plain old java project)
// controller 기능을 가진 클래스로 만들고 싶으면, 상속
// @controller 어노테이션을 쓰면, 내부적으로 벌어지는 일
// 1) 상속
// 2) 핸들러맵퍼에 키:값을 등록, 키) 요청되는 주소, 값) 객체의 주소

@Controller
public class CarController {

	// 컴트롤러에서 view까지 넘어가기 위한 항목:
	// 1. view페이지 작성, 2. model의 속성값
	@RequestMapping("car.do")
	public String car(String color, Model model) {
		System.out.println("컨트롤러에서 받은 색은 " + color);
		model.addAttribute("color", color);
		return "img";
	}
}
