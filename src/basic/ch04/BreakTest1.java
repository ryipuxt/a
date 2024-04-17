package basic.ch04;

public class BreakTest1 {

	public static void main(String[] args) {

		// 중간에 멈추는 break 문
		// 소수 7이면 반복문을 멈추어라
		for (int i = 1; i < 11; i++) {
			if ((i % 7) == 0) {
				break; // 중간에 멈추고 반복문 하나를 빠져나옴
				// return; 실행의 제어권을 반납한다.
			}
			System.out.println("i의 값 : " + i);
		}

	}

}
