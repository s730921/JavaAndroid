
public class ForTest {

	public static void main(String[] args) {
		
		String name[] = {"박태호","조정래","오수철"};
		
		//일반 For문
		/*for (int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}*/
		
		//향상된 For문
		for (String namevalue : name) {
			System.out.print(namevalue + " ");
		}

	}

}
