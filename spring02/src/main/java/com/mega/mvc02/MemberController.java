package com.mega.mvc02;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("insert.do")
	public void joincheck(String pw1, String pw2) {
		System.out.println("메서드 자동 호출 확인...");
		String result = "가입 실패, 비밀번호 재확인 필요";
		if(pw1.equals(pw2)) {
			result = "가입성공!";
		}
		System.out.println(result);
	}
}
