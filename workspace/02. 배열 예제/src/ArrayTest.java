
public class ArrayTest {

	public static void main(String[] args) {
		//1차원 배열에 초기값
		int[] array = {10,20,30,40,50};
		
		//일반 for문
		/*for (int i=0; i<5; i++) {
			System.out.print(array[i] + " ");			
		}*/
		
		//확장된 for문(향상된 for문)
		for(int num : array) {
			System.out.print(num + " ");
		}
	}

}
