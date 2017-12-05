
public class Television implements RemoteControl {	//���� ��ü Ŭ����

	//�ʵ� ����
	private int Volume;
	
	@Override
	public void TurnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void TurnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void SetVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		} else if(Volume < RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		} else {
			this.Volume = Volume;
		}
		System.out.println("���� TV ������ " + this.Volume);
	}

}
