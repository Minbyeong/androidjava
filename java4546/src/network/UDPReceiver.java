package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		//받는 애부터 시작.
		DatagramSocket socket = new DatagramSocket(7100); //ip를 안쓰면 그냥 내 아이피가 들어감.
		System.out.println("받는 쪽 소켓 시작.");
		System.out.println("받을 준비 끝.");
		//빈 패킷 필요.
		byte[] data = new byte[256]; //받아서.
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//빈 패킷에 넣어주고.
		socket.receive(packet);
		System.out.println("받은 데이터: " + new String(data));
		socket.close();
	}
}
