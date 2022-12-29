package if221223;

public class Test144SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
		  System.out.println("700만원");
		  break;
		case "과장":
		  System.out.println("500만원");
		  break;
		default:
		  System.out.println("300만원");
		}
	}
}
//포지션을 지정해놓고 case에 맞춰 "금액"을 출력이라고함!
//포지션이 "과장"이기 때문에 "500"만원이 출력된거 같음