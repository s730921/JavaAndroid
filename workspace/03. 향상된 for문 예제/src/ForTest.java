
public class ForTest {

	public static void main(String[] args) {
		
		String name[] = {"����ȣ","������","����ö"};
		
		//�Ϲ� For��
		/*for (int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}*/
		
		//���� For��
		for (String namevalue : name) {
			System.out.print(namevalue + " ");
		}

	}

}
