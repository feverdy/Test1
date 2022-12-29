package homework;

public class AA {
	
	public static void A() {
		System.out.println("A 메소드 실행!!");
	}
	
	public static int B(int a1, int a2) {
		System.out.println("전달받은 a1 :" + a1 +", 전달받은 a2:" +a2);
		return a1+a2;
	}
	
	public static int C(int c1, int c2) {
		System.out.println("C 메소드실행: "+ c1*c2);
		return c1*c2;
	}
	
	public static void main(String[] arg) {
		System.out.println("메인함수 실행");
		
	
		A();
		
		int ab = B(1,2);
		System.out.println(ab);
		
		int cc = B(3,4);
		System.out.println(cc);
		
		int ii= C(3,4);
		System.out.println(ii);
	}
}
