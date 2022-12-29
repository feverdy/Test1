package if221223;

public class Test1430NoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		case 11:
			System.out.println("외근을 나갑니다.");
		}
	}
}
//break 가 없어서 8시가 나오면 출근, 회의, 업무, 외근 이 다 출력되고
//10시가 나오면 업무, 외근만 출력된다.!