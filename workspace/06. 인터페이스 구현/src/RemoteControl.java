
public interface RemoteControl {
	//상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 선언
	void TurnOn();
	void TurnOff();
	void SetVolume(int Volume);

	//디폴트 메소드 추가 가능
	default void SetMute(boolean Mute) {
		if (Mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 추가 가능
	static void Changeattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
