package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 1.연결 요청만 담당하는 서버용 socket필요.
		// prototype(프로토타입) 방법 <-> singletone(싱글톤)
		// 필요할때마다 객체 생성 <-> 하나만 객체 생성 주소를 재사용
		ServerSocket server = new ServerSocket(9100); // 임의대로 답은 포트 번호를 집어넣어야 함.
		System.out.println("TCP 서버 시작됨.");
		System.out.println("틀라이언트의 요청을 기다리는 중...");
		int count = 0;
		while (true) {
			Socket socket = server.accept(); // 서버를 요청하는 socket
//			System.out.println("서버와의 연결 성공.");
			count++;
			System.out.println("연결된 클라이언트의 개수: " + count);
			PrintWriter out= new PrintWriter(socket.getOutputStream(),true); //받은 결과를 내보내줌.
            out.println("나는 한글이다.........");			
		}
	}
}

