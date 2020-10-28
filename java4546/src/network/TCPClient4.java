package network;

import java.net.Socket;

public class TCPClient4 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) { // 얼추 16000정도 찍으면 터짐s
			Socket socket = new Socket("localhost", 9100);
			System.out.println("client" + i + " 서버와 연결됨.");
			
		}
	}
}
