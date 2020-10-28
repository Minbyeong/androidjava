package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) { // 얼추 16000정도 찍으면 터짐s
			Socket socket = new Socket("localhost", 9100); //호스트의 이름과 그 주소값으로 접속하겠다.
			System.out.println("client" + i + " 서버와 연결됨.");
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//계속해서 넘겨주는 것보다 버퍼드리더를 사용하여 어느 정도의 양을 받아서 한번에 넘겨주는 것이 효율이 좋다.
			//그 어느정도의 양을 클라이언트 한명단위로 끊어주기 위해서 getinputstream.
			//reader라는 이름을 가진 애는 2바이트씩 처리, stream은 1바이트씩 처리, 따라서 중간에 전환을 해주는 inputstreamreader를 사용하여 중간처리과정을 치고 넣어줌. 
			String data = input.readLine(); // 처리가 끝나면 input에 담긴 한줄씩을 data에 담아서
			System.out.println("받은 데이터 : " + data); //출력
		}
	}
}