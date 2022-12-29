package for221223;

public class Test159ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
