package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsService service;

	@RequestMapping("insert.do")
	public void insert(BbsVO bbsVO, HttpSession session) {
		// 입력값으로 VO를 설정하는 경우
		// 1) 객체생성: prototype방법
		// 2) input name 속성과 동일한 set메서드를 자동으로 호출
		// 3) 변수이름을 클래스 이름의 첫글자를 소문자로 지정하는 경우,
		// 자동으로 VO의 model속성으로 지정
		// views의 아래 jsp파일에서 model 속성값을 꺼내 쓸 수 있다.
		System.out.println(bbsVO.getNo());
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getWriter());
		System.out.println(bbsVO.getContent());

		// 객체생성 방법으로 싱글톤과 프로토타입을 사용
		// 여기서 사용한 모델을 다른데서 사용하려면 세션으로 잡아줘야 함

		// model은 한번의 request랑 response를 하고 사라진다.
		// 여러번의 request마다 특정한 값을 유지하고 사용하고 싶으면
		// session으로 설정해야 한다.
		// session과 모델의 이름을 다르게 설정해야함
		session.setAttribute("bbsVO2", bbsVO);
	}

	@RequestMapping("update.do")
	public void update(Model model) {
		// db처리가 들어가야 하는 경우
		// 반드시 controller를 거쳐야한다.
		// db검색해서 가지고 온다
		// 검색한 결과를 views에 있는 update.jsp로 넘겨야 함.
		model.addAttribute("result", "나는 검색 결과임...");

		// 모델은 views까지만 가고 디짐.
		// webapp로는 못감.
	}

	@RequestMapping("delete.do")
	public void delete() {
		// db처리하고
		// views로 넘어간다.
		System.out.println("여기 도착했나...");
	}

}
