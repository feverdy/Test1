package if221222;

public class Test136 {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90) //if문의 score 조건이 안맞아  점수는 안나옴
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다."); //12라인의 if문 중괄호가 없어 13라인까지만 영향을줌
	}
}
//답 "점수가 90보다 큽니다", "등급은 A입니다.", 틀림"등급은 B입니다"
//if문의 조건식이 true면 if문 블록실행!, 조건식이 false면 else블록이 실행!![매우중요!]