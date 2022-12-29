package homework;

public class Homework000ReversStar {
	public static void main(String[] args) {
		for (int i=1;i<5;i++) {
			System.out.println("i:"+i);
			
			for(int j=4; j>0; j--) {
				System.out.println("j:"+j);
				
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}