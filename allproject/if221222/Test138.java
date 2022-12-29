package if221222;

public class Test138 {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) { //80<=score<90일 경우
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) { //70<=score<80일 경우
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다");
			System.out.println("등급은 D입니다.");
		}
	}
}
//답 "점수가 70~79입니다.", "등급은 C입니다."

//if-else if-else문은 처음 if문의 조건식이 false일경우 다른 조건식의
//결과에 따라 실행블록을 선택할 수 있습니다.