package homework;

public class Homework001 {
	public static void main(String[] args) {
		for (int m=2; m<=9; m+=2) {
			System.out.println("*** " + m +"단 ***") ;
			
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
	
	//1 == 1 true
    //2 < 4  true
    //4 > 0  true
    //1 != 2 true
}