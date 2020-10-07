package 크롤링;

import java.io.FileWriter;

public class 네이버증권UI {

	public static void main(String[] args) {
		String[] code = { "238090", "293490", "005930", "009830", "047820" };
//		String[] name = { "앤디포스", "카카오게임즈", "삼성전자", "한화솔루션", "초록뱀" };

		네이버증권크롤링2 naver = new 네이버증권크롤링2();
		for (int i = 0; i < code.length; i++) {
			String[] result = naver.crawl(code[i]);
			try {
				FileWriter file = new FileWriter(result[0] + ".txt");
				for (int j = 0; j < result.length; j++) {
					file.write(result[j] + "\n");
				}
//				file.write(result[0] + "\n"); // 이름
//				file.write(result[1] + "\n"); // code
//				file.write(result[2] + "\n"); // 현재가
//				file.write(result[3] + "\n"); // 최고가
//				file.write(result[4] + "\n"); // 최저가
				file.close();
			} catch (Exception e) {
				System.out.println("파일저장 중 에러 발생.");
			}
		} // for
	} // main
} // class
