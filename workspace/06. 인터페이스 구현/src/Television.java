
public class Television implements RemoteControl {	//구현 객체 클래스

	//필드 선언
	private int Volume;
	
	@Override
	public void TurnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void TurnOff() {
		System.out.println("TV를 끕니다.");
		
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
		System.out.println("현재 TV 볼륨은 " + this.Volume);
	}

}
