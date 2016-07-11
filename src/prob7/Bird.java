package prob7;

public abstract class Bird {
	private String name ;
	private int lengs;
	private int length; 
	

	public abstract void fly();
	public abstract void sing();
	public abstract String toString();
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	
	

//날다 fly, 
//울다 sing, 
//이름기록하기 setName, 
//문자열출력하기 toString 를 가지고 있습니다.


}
