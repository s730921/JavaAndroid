
public class Taxi extends Car {	//�ڽ� Ŭ����(���� Ŭ����)

	//�޼ҵ� ����
	//�޼ҵ� �������̵� -> �������� �������� ���� �����
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
