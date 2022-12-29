package allproject221222;

public class Test121 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f; //false
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
	}
}
//1번은 더블이 실수지만 1.0으로 정수처리가 되어서 참으로 나온거 같음
//2번은 왜 거짓이냐면 더블은 0.1만 나오지만 플롯은 0.100000001490이런식으로 나오기 때문이다