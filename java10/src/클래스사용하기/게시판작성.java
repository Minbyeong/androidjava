package 클래스사용하기;

import 클래스만들기.Dbs;

public class 게시판작성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dbs con1 = new Dbs();
		con1.id = 1;
		con1.tilte = "java";
		con1.content = "fun java";
		con1.writer = "park";
		System.out.println(con1);

		Dbs con2 = new Dbs();
		con2.id = 2;
		con2.tilte = "jsp";
		con2.content = "fun jsp";
		con2.writer = "kim";
		System.out.println(con2);

		System.out.print("con1에 ");
		con1.글을쓰다();
		System.out.print("con2에 ");
		con1.글을삭제하다();
	}

}
