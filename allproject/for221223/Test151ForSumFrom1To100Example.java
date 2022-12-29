package for221223;

public class Test151ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;  //--------------합계변수
								//      |
		for(int i=1; i<=100; i++) {//   |
			sum += i;				//  |
		}							//  |
									//  |
		System.out.println("1~100 합 : " +sum);
	}
}
