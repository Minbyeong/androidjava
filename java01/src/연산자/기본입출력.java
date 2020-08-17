package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 창을 띄워서 입력을 받아보자
		// 창읠 띄워서 출력을 해보자
		// 자주 사용하는 것은 부품대문자를 그대로 쓴다
		// 특정한 일을 전담하는 부품을 만들어 특정한 처리를 할때 부품을 지정함

		String name = JOptionPane.showInputDialog("당신의 이름은?"); // jop만 적어놓으면 키보드로 입력받은 값을 단순히 cpu에 그냥 저장 -> 변수를 설정해서
																// ram에 마저 저장 해준다
		// 창 띄워주는 애
		System.out.println("당신의 이름은 " + name); // ram에 저장된 name 데이터를 cpu가 읽어 화면에 out(out값을 지정하지 않아서 기본값인 화면에 출력)
		String age = JOptionPane.showInputDialog("당신의 나이는?"); // 위 name 설정 때와 같은 접근 방식
		// 키보드로 입력한 데이터 타입은 무조건 String
		System.out.println("당신의 나이는 " + age); // 다시 ram에 저장된 age값을 cpu가 읽어와 화면에 출력
		// String으로 저장된 데이터를 int/string으로 쓸지는 내가 결정.
		// 계산의 유무에 따라서 계산 하는 경우는 int로 처리해야한다.
		// 숫자로 바꿔보자
		int age2 = Integer.parseInt(age);// 바꾼것을 계속 쓰려면 다시 저장(=)을 해야한다 //age의 값이 정수 임에도 불구하고 키보드로 입력한 값은 문자열로 취급 -> 문자열로
											// 받은 값을 숫자로 바꿔주기 위해 integer.parseint로 숫자로 바꿈 바꾸고 나면 cpu에 값을 잠시 저장한 상태 -> 앞에
											// 변수를 지정해줌으로 써 정수로 ram에 저장 -> 이미 age의 변수가 지정 되어있기 때문에 이름을 바꿔주어야 한다
		int lastAge = age2 - 1; // lastAge라는 변수는 age2에서 -1을 한 값이라고 선언 ->age2값은 이미 ram에 저장 되어있기 때문에 읽어 올 수 있음
		System.out.println("당신의 작년 나이는 " + lastAge);
	}

}
