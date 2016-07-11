package prob7;

public class Duck extends Bird {
	final String NAME="오리";
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"("+getName()+")"+"은날지 않습니다");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"("+getName()+")"+"은 소리냅니다");
	}
  public String toString(){
	  return NAME+"의 이름은"+getName()+"입니다";  
  }
	
	

//날다 fly, 
//울다 sing, 
//이름기록하기 setName, 
//문자열출력하기 toString 를 가지고 있습니다.

	


}
