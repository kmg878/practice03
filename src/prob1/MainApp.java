package prob1;

public class MainApp {
	public static void main(String[] args) {
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int count=0;
		int sum=0;
		
		for(int i=0;i<data.length;i++){
			if(data[i]%3==0){
				count++;
				sum=sum+data[i];
			}
		}
		System.out.println("개수->"+count);
		System.out.println("합 ->"+sum);
	}
}