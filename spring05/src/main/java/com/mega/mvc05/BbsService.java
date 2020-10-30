package com.mega.mvc05;

// autowired로 자동을 넣어주려면 코드를 열 수 있어야 함
// 그게 안되서 context파일로 지정해주는 거
public class BbsService {

	BbsDAO dao; // 전역변수

	// 전역변수의 주소(값)를 넣는 방법
	// 1. 파라메터 있는 생성자를 사용해라.
	// 2. set메서드를 만들어라.
//	public BbsService(BbsDAO dao) {
//		this.dao = dao;
//	}

	public void setDao(BbsDAO dao) {
		this.dao = dao;
	}

}
