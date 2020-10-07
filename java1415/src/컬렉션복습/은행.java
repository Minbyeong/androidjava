package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		// 동적 메모리 할당 => 객체 생성시마다 객체별로 멤버변수가 복사가 되어 변수가 생성(메모리가 할당).
		계좌 account1 = new 계좌("홍길동", "정기적금", 1000);
		// 참조형이고, 참조형은 주소가 들어가고, toString 으로 주소 대신 제대로 찍히게 미리 설정해놔서
		// 그냥 sout 해서 account1 바로 찍으면 됨.
//		System.out.println(account1);
		계좌 account2 = new 계좌("김길동", "정기예금", 2000);
//		System.out.println(account2);
//		계좌 account3 = new 계좌(); 
		// 기본 생성자를 막아버리니까 아예 안찍힌다고 밑줄 표시가 남.
		// 기본생성자는 클래스 내에 다른 생성자가 하나도 없어야만 자동 생성이기 때문에,
		// 안에 무조건 값이 들어가는 생성자를 만들고 싶으면 자동생성을 막아주면 됨.
		계좌 account3 = new 계좌("후에엥", "후엥적금", 3000);
		계좌 account4 = new 계좌("으흘컥", "후엥예금", 4000);
		계좌 account5 = new 계좌("으헝헝", "후에에적금", 5000);
		
		ArrayList<계좌> list = new ArrayList<계좌>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		
		파일로저장2 file = new 파일로저장2();
		file.save(list);
		
	}
}
