package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");
		try {
			Document doc = con.get();
			Elements list = doc.select("h2 a");
			String name = list.get(0).text();
			System.out.println("회사이름: " + name);

			Elements list2 = doc.select("span.code");
			String code = list2.get(0).text();
			System.out.println("회사 코드: " + code);

			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text(); // 현재가
			String dif = list4.get(1).text(); // 차이
			String percent = list4.get(2).text(); // 증감비율
			System.out.println("현재가: " + now);
			System.out.println("어제와의 차이: " + dif);
			System.out.println("증감비율: " + percent);

			Elements list5 = doc.select("td em span.blind");
			String up = list5.get(1).text(); // 고가
			String down = list5.get(5).text(); // 저가
			System.out.println("오늘 고가: "+up);
			System.out.println("오늘 저가: "+down);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
