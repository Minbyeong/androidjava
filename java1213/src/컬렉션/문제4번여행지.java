package 컬렉션;

import java.util.HashSet;

public class 문제4번여행지 {

	public static void main(String[] args) {
		HashSet country = new HashSet();
		country.add("유럽");
		country.add("일본");
		country.add("필리핀");
		country.add("캐나다");
		country.add("미국");
		System.out.println("가본 여행지: "+country);
		
		country.add("일본");
		country.add("중국");
		country.add("유럽");
		System.out.println("가본 여행지2(중복제거): "+country);
	}
}
