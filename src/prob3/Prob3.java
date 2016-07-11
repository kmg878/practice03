package prob3;

import java.lang.reflect.Array;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		
		int length =str.length();
		char[] c= new char[length];
		for(int i=0;i<length;i++){
			c[i]=str.charAt(length-i-1);
		}
		return c;
	
		
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]);
		
	}
}
