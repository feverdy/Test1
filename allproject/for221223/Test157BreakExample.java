package for221223;

public class Test157BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
//1~6사이에 숫자가 나오되 6이 나오면 종료가 되는 코드