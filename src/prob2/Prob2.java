package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력해 주세요");
		int getNum =scanner.nextInt();
		int array[]={50000,10000,5000,1000,500,100,50,10,5,1};
		int count=0;
		
		for(int i=0;i<array.length;i++){
			count=getNum/array[i];
			getNum=getNum%array[i];
		System.out.println(array[i]+"권의 개수는"+count);
		}
	}
}

