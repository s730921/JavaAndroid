
public class Car {	//부모 클래스(상위 클래스)
	//필드 선언
	protected int		Speed;
	protected int		WhellNum;
	protected String	CarName;
	
	//Default 생성자 구현
	public Car() {
		
	}
	
	//생성자 구현	
	public Car(String Name) {
		CarName = Name;		
	}
	
	public Car(int Velocity) {
		Speed = Velocity;
	}
	
	public Car(String Name, int Velocity) {
		CarName = Name;
		Speed = Velocity;
	}
	
	//메소드 구현
	//메소드 오버로딩 -> 다형성을 구현하기 위한 방법론
	public void SpeedUp() {
		Speed = Speed + 1;
	}
	
	public void SpeedUp(int Velocity) {
		Speed = Speed + Velocity;
	}
	
	public void SpeedDown() {
		Speed = Speed - 1;
	}
	
	public void Stop() {
		Speed = 0;
	}
}
