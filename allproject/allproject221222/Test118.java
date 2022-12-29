package allproject221222;

public class Test118 {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		//1번답. str1=JDK6.0으로 저장\str2=str1+"특징"이라는문자열이 더해짐
		//2번답. 문자열과 숫자가 혼합된+연산식은 왼쪽에서부터 오른쪽으로 진행이됨
		//따라서 "JDK"+3이 먼저 연산되어 "JDK3"이라는 문자열이 되고 이걸 다시 3.0과 연산하여
		//JDK33.0이 출력
		//3번답. 3+3.0이 먼저 연산되어 6.0이라는 실수값(소수)이 되고 이것을문자열인
		//"JDK"와 연산하여 6.0JDK라고 출력
		//어떤것이 먼 저 연산되느냐에 따라 값이 다르게 출력되니 주의하기!
	}
}