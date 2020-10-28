package com.mege.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @는 상속도 받아줌 스프링에서
@Controller
public class PageController {

	// 2. 컨트롤러에서 받아주고
	// 리퀘스트가 들어오면 알아서 맞춰서 클래스 실행해
	@RequestMapping("page2.mega") // ("ㅁㄴㅇ")가 호출되면 자동 호출
	public void page2(String id, String pw) { // (Member VO)쓰면 알아서 다 받아 줌
		System.out.println("이 메서드가 자동 호출됨........");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		// 3. dao 객체써서 db 처리
		String result = "실패";
		if (id.equals("root") && pw.equals("1234")) {
			result = "성공";
		}
		// 4. 처리 결과를 가지고 jsp페이지로 간다.
	}
}
