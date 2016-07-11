package prob7;

public class Sparrow extends Bird {
	final String NAME="참새";

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"("+getName()+")"+"은날 수 있습니다");
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"("+getName()+")"+"소리내 웁니다");
	}
	 public String toString(){
			
		 return NAME+"의 이름은"+getName()+"입니다";  
	  }
	
	

}
