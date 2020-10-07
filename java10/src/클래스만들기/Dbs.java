package 클래스만들기;

public class Dbs {

	public int id;
	public String tilte;
	public String content;
	public String writer;

	public void 글을쓰다() {
		System.out.println("글을 쓰다");
	}

	public void 글을삭제하다() {
		System.out.println("글을 삭제하다");
	}

	public void 글을읽다() {
		System.out.println("글을 읽다");
	}

	public void 글을수정하다() {
		System.out.println("글을 수정하다");
	}

	@Override
	public String toString() {
		return "Dbs [id=" + id + ", tilte=" + tilte + ", content=" + content + ", writer=" + writer + "]";
	}

}
