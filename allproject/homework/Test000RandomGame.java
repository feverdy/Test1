package homework;

public class Test000RandomGame {
	public static void main(String[] args) throws Exception{
		
		int num =(int) (Math.random()*50)+1;
		
			if(num!=44) {
			System.out.println("틀렸습니다.");	
		}else if(num==44){
		System.out.println("축하합니다!");
		}
	}
}
