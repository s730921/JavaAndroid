import java.util.Scanner;

public class Jumincheck {

	public static void main(String[] args) {
		int sum = 0;
		int temp, result;
		
		String JuminNo;
		int weight[] = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		
		System.out.print("주민번호 입력 : ");
		Scanner in = new Scanner(System.in);
		JuminNo = in.next();
		
		for(int i=0; i<13; i++) {
			if (JuminNo.charAt(i) == '-') continue;
				sum = sum + (JuminNo.charAt(i)-48) * weight[i];
		}
		temp = 11 - (sum % 11);
		
		//System.out.println("temp = " + temp);
		
		result = temp % 10;
		
		if (result == JuminNo.charAt(13) - 48) {
			System.out.println("주민번호 정상임!!");
		} else {
			System.out.println("주민번호 틀림!!");
		}
	}

}
