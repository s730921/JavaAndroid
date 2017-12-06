import java.util.Collections;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		String arr[] = {"������","����ȣ","������","�ڰ渮","�ܼ̿�"};
		
		Vector<String> Vec = new Vector<String>(4,3);
		
		System.out.println("���Ϳ� ����� ����� ������ : " + Vec.size());
		System.out.println("������ �뷮�� : " + Vec.capacity() + "\n");
		
		for(int i = 0; i < arr.length; i++) {
			Vec.add(arr[i]);	//��ü�� ������ ����
		}
		
		System.out.println(Vec);
		System.out.println();	//�ٹٲ�	
		System.out.println("���Ϳ� ����� ����� ������ : " + Vec.size());
		System.out.println("������ �뷮�� : " + Vec.capacity() + "\n");
		
		System.out.println(Vec.get(1));
		
		System.out.println("[�ε��� 2�� ��ġ�� ��ü �����ϱ�]");
		Vec.add(2, "������");		//��ü�� Ư����ġ�� ������ ����
		System.out.println(Vec);
		System.out.println();
		
		System.out.println("[�ε��� 2�� ��ġ�� ��ü �����ϱ�]");
		Vec.set(2, "�����");		//��ü�� Ư����ġ ������ ����
		System.out.println(Vec);
		System.out.println();
		
		System.out.println("[�ε��� 2�� ��ġ�� ��ü �����ϱ�]");
		Vec.remove(2);			//��ü�� Ư����ġ ������ ����
		System.out.println(Vec);
		System.out.println();
		
		Collections.sort(Vec);
		System.out.println(Vec);

	}
}
