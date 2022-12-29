package for221223;

public class Test153ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m +"단 ***") ;
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
