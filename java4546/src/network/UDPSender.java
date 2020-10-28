package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		String str = "i am a android programmer!";
		byte[] data = str.getBytes(); 
		//data는 바이트 단위로 만들어지기 때문에 바이트 배열 사용.
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		//127.0.0.1이라는 가상 ip를 쓰면 localhost ip가 들어감.
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		socket.send(packet); //보내주고.
		socket.close(); //끝내.
	}
}
