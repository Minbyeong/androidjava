package network;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 메신저A extends JFrame{
	
	private JTextField input;
	private JTextArea list;
	
	public 메신저A() {
		setTitle("메신저A");
		setSize(300, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		list = new JTextArea();
		list.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		list.setBackground(Color.ORANGE);
		list.setBounds(0, 0, 300, 539);
		getContentPane().add(list);
		
		input = new JTextField();
		input.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		input.setBackground(Color.LIGHT_GRAY);
		input.setBounds(0, 536, 300, 42);
		getContentPane().add(input);
		input.setColumns(10);
		list.setEditable(false);
		
		input.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				list.append("나>> " + data + "\n");
				input.setText("");
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data2 = data.getBytes(); 
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					
					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 6000);
					
					socket.send(packet);
					socket.close();
				} catch (IOException e1) {
					System.out.println("오류오류오류ㅗㅎ류오륭로유로율오ㅠ로유로유ㅗ유로유로유로ㅠ!!~!!!");
				}
			}
		});
		
		setVisible(true);
	}
	
	public void process() {
		while (true) {
			try {
				DatagramSocket socket = new DatagramSocket(5000); //ip를 안쓰면 그냥 내 아이피가 들어감.
				
				byte[] data = new byte[256]; //받아서.
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				
				System.out.println("받은 데이터: " + new String(data));
				list.append("상대>> " + new String(data) + "\n");
				socket.close();
			} catch (IOException e) {
				System.out.println("오류오류오류오류오류오류오류오류!!!!!!!!!!!");
			}
		}
	}
	
	public static void main(String[] args) {
		메신저A m = new 메신저A();
		m.process();
	}
}
