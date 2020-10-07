package 컬렉션;

import java.util.HashMap;

public class 문제2번고객관리시스템 {

	public static void main(String[] args) {
		HashMap member = new HashMap();
		member.put(100, "김데이");
		member.put(200, "김사전");
		member.put(300, "김구조");
		member.put(400, "김자료");
		System.out.println(member);
		
		System.out.println("200번 고객은 탈퇴, 300번 고객은 개명(김충성)");
		member.remove(200);
		member.put(300, "김충성");
		System.out.println(member);
	}
}
