package controller;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class TestClass {

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		try{
			while(sc.hasNext()) { 
				String depth = sc.nextLine();
				if("0".equals(depth)){
					System.out.println("프로그램 종료!!");
					break;
				}
				 
				if(0 != Integer.parseInt(depth)%2){
					printStar(depth);
				}else {
					System.out.println("홀수만 입력하세요");
				}
				 
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void printStar(String depth){
		int level = Integer.parseInt(depth);
		
		for(int i=0; i<level; i++){
			printStar((level-1)-i, (i*2)+1);
		}
	}
	
	public static void printStar(int whiteSpace, int star){
		for(int i=0; i<whiteSpace; i++){
			System.out.print(" ");
		}
		
		for(int i=0; i<star; i++){
			System.out.print("*");
		}
		
		System.out.println();
	}
}
