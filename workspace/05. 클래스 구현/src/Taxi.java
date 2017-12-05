
public class Taxi extends Car {	//자식 클래스(하위 클래스)

	//메소드 구현
	//메소드 오버라이딩 -> 다형성을 구현하위 위한 방법론
	public void SpeedUp(int Velocity) {
		Speed = Speed + Velocity;
		
		if(Speed > 110) {
			Speed = 100;
		}
	}
	
	public static void main(String[] args) {
		Taxi MyTaxi = new Taxi();
		
		MyTaxi.SpeedUp(150);
		System.out.println("Taxi Speed is " + MyTaxi.Speed + "km");

	}

}
