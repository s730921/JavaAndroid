
public interface RemoteControl {
	//��� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� ����
	void TurnOn();
	void TurnOff();
	void SetVolume(int Volume);

	//����Ʈ �޼ҵ� �߰� ����
	default void SetMute(boolean Mute) {
		if (Mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ� �߰� ����
	static void Changeattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
