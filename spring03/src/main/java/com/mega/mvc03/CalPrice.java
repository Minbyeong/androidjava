package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//싱글톤으로 만들어 줄래
@Service
public class CalPrice {

	@Autowired
	MemberDAO service;
	
	public int CalPrice(int a) {
		if (a >= 10000) {
			a -= 1000;
		}
		return a;
	}
}
