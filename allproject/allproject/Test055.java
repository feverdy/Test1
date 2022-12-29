package allproject;

public class Test055 {
	public static void main(String[] args) {
		int var1;				//메소드 블록에서 선언
		
		if(   ) {
			int var2;			//if블록에서 선언
			//var1과 var2 사용 가능
		}
		for(   ) {
			int var3;			//for블록에서 선언
			//var1과 var3 사용 가능
			//var2는 사용 못함
		}
		//var1 사용 가능
		//var2와 var3는 사용 못함
	}
}
