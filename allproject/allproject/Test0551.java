package allproject;

public class Test0551 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 10;
		
		System.out.println("1:"+v2);
		
		if(v1>10 ) {
			v2 = v1 - 10;
			System.out.println("2:"+v2);
		}
		
		System.out.println("3:"+v2);
		
		int v3 = v1 + v2 + 5;
		//v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
		System.out.println(">>>> "+v3);
	}
}
//이프문 종현이 과외 모르면 더 복습해보기 (이프는 조건이 맞을경우에만 실행!)