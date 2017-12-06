import java.util.Collections;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		String arr[] = {"김진명","최인호","조정래","박경리","이외수"};
		
		Vector<String> Vec = new Vector<String>(4,3);
		
		System.out.println("벡터에 저장된 요소의 개수는 : " + Vec.size());
		System.out.println("벡터의 용량은 : " + Vec.capacity() + "\n");
		
		for(int i = 0; i < arr.length; i++) {
			Vec.add(arr[i]);	//객체에 데이터 삽입
		}
		
		System.out.println(Vec);
		System.out.println();	//줄바꿈	
		System.out.println("벡터에 저장된 요소의 개수는 : " + Vec.size());
		System.out.println("벡터의 용량은 : " + Vec.capacity() + "\n");
		
		System.out.println(Vec.get(1));
		
		System.out.println("[인덱스 2인 위치에 객체 삽입하기]");
		Vec.add(2, "박지성");		//객체의 특정위치에 데이터 삽입
		System.out.println(Vec);
		System.out.println();
		
		System.out.println("[인덱스 2인 위치에 객체 변경하기]");
		Vec.set(2, "손흥민");		//객체의 특정위치 데이터 변경
		System.out.println(Vec);
		System.out.println();
		
		System.out.println("[인덱스 2인 위치에 객체 삭제하기]");
		Vec.remove(2);			//객체의 특정위치 데이터 삭제
		System.out.println(Vec);
		System.out.println();
		
		Collections.sort(Vec);
		System.out.println(Vec);

	}
}
