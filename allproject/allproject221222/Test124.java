package allproject221222;

public class Test124 {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result=" + result); //답 10
		result -=5;
		System.out.println("result=" + result); //답 5
		result *=3;
		System.out.println("result=" + result); //답 15
		result /=5;
		System.out.println("result=" + result); //답 3
		result %=3;
		System.out.println("result=" + result); //답 0(왜 0이 되는거지?)
	}
}
