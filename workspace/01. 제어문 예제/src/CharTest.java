
public class CharTest {

	public static void main(String[] args) {
		char x = 'A';	//'A'는 ASCII 코드값이 65 이다.
		
		for (int i=0; i<26; i++) {
			System.out.print(x++);
		}
		System.out.println();	//줄바꿈
		
		char y = 'a';	//'a'는 ASCII 코드값이 97 이다.
		
		for(int i=0; i<26; i++) {
			System.out.print(y++);
		}
		
	}

}
