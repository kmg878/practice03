package prob5;
//여기만 수정 하면 된다 다른곳을 건드리면 안됌
public class MyBase extends Base{

	@Override
	public void service(String state) {
		if(state.equals( "오후" )){
			System.out.println("오후 오후");
		}else if(state.equals("낮")){
			System.out.println("낮에는 열심히 일한다");
		}else
			System.out.println("밤에는 잔다");
	}
	
}
