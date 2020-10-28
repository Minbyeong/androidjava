package com.mega.mvc03;

import org.springframework.stereotype.Service;

@Service
public class IdCheck {

	public String[] IdCheck(String a) {
		String[] x = { "root", "admin", "apple", "melon", "mint" };
		String result="사용가능";
		String page = "ok";
		for (int i = 0; i < x.length; i++) {
			if(a.equals(x[i])) {
				result = "사용불가능";
				page = "no";
				break;
			}
		}		
		String[] y = {result, page};
		return y;
	}
}
