package allproject;

public class Test068 {
	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14; -컴파일 에러(Type mismatch)
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: "+ var2);
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		System.out.println("var5: "+ var5);
		//더블타입인var5가 플롯타입인var4보다 2배이상 정밀한 값으로출력
		//e사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: "+ var6);
		System.out.println("var7: "+ var7);
		System.out.println("var8: "+ var8);
	}
}
