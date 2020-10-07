package db연결;

public class BbsVO {
	private int no;
	private String title;
	private String content;
	private String writer;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override //오버라이드, 재정
	public String toString() {
		return "bag[no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
