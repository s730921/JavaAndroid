
public class Car {	//�θ� Ŭ����(���� Ŭ����)
	//�ʵ� ����
	protected int		Speed;
	protected int		WhellNum;
	protected String	CarName;
	
	//Default ������ ����
	public Car() {
		
	}
	
	//������ ����	
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
	
	//�޼ҵ� ����
	//�޼ҵ� �����ε� -> �������� �����ϱ� ���� �����
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
