package allproject221222;

public class Test126 {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
//85점은 B등급입니다.