package allproject221222;

public class Test119 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4= " + result4);
	}
}

//피연산자 1(좌측)과 피연산자 2(우측)가 있다는 가정하에
// ==는 두 피연산자의 값이 같은지 검사, !=두 피연산자의 값이 다른지를 검사
//>는 피연산자 1이 큰지 검사, >=는 피연산자 1이 크거나 같은지 검사
//<는 피연산자 2가 큰지 검사, <=는 피연산자 2가 크거나 같은지 검사
//피연산자가 char타입이면(알파벳or한글) 유니코드값으로 검사