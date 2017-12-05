
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl RC = null;
		
		RC = new Television();
		RC.TurnOn();
		RC.SetVolume(13);
		RC.SetMute(true);
		
		RemoteControl.Changeattery();
		RC.TurnOff();

	}

}
