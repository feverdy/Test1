package homework;

import java.util.Scanner;

public class Calculator {

	public static int P(int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}
	public static int gobchang(int a, int b) {
		return a*b;
	}
	public static int nanugi(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in); 
		
        System.out.println("부호, 정수, 정수 차레대로 입력하세요.");
         
         
        String str = sc.nextLine(); // [+, -, /, *]
        //System.out.println("입력하신 부호는 [" + str + "] 입니다.");
         
        int number1 = sc.nextInt();
        //System.out.println("입력하신 첫번째 정수는 [" + number1 + "] 입니다.");
         
        int number2 = sc.nextInt();
        //System.out.println("입력하신 두번째 정수는 [" + number2 + "] 입니다.");
		
        int result=0;
        
        if("+".equals(str)) {
        	System.out.println("덧셈연산을 합니다.");
        	result= P(number1, number2);
        	System.out.println("덧셈결과:" + result);
        }
        if("-".equals(str)) {
        	System.out.println("뺄셈연산을 합니다.");
        	result= minus(number1, number2);
        	System.out.println("뺄셈결과:" + result);
        }
        if("*".equals(str)) {
        	System.out.println("곱셈연산을 합니다.");
        	result= gobchang(number1, number2);
        	System.out.println("곱셈결과:" + result);
        }
        if("/".equals(str)) {
        	System.out.println("나눗셈연산을 합니다.");
        	result= nanugi(number1, number2);
        	System.out.println("나눗셈결과:" + result);
        }
	}
}
