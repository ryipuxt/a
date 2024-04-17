package basic.ch03;

/**
 * 
 * 논리 연산자 관계 연산자와 혼합하여 많이 사용 된다. 연산의 결과는 true, false 로 반환 된다.
 * 
 */
public class Operation6 {

	public static void main(String[] args) {

		// 논리 연산자는 3가지 종류가 있다.
		// 논리곱 > && (엠퍼센트, 엠퍼센트)
		// 논리합 > || (버티컬 바, 버티컬 바)
		// 부정 > !

		int num1 = 10;
		int num2 = 20;

		// 1. 논리곱 &&
		// T && T
		// 논리곱은 전부 true 이면 true 반환, 하나라도 거짓이면 false 반환한다.
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println("flag1 : " + flag1);

		// T && F
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);

		System.out.println("------------------------");

		// 2. 논리 합
		// T T || F
		// 둘중 하나라도 true 이면 연산의 결과는 무조건 true 이다.
		boolean flag3 = (num1 > 0) || (num2 < 0);
		System.out.println(flag3);

		System.out.println("------------------------");

		// 3. 부정
		System.out.println("부정 논리 연산자 사용 : " + !flag3);
		// 연산의 결과가 어떤지 확인해봐야지 > 로깅 한다.

		System.out.println("flag 3: " + flag3);

	} // end of main

} // end of class
