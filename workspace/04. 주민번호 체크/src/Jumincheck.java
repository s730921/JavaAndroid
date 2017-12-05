import java.util.Calendar;
import java.util.Locale;
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
			
			//나이 추출
			Calendar cal = Calendar.getInstance(Locale.KOREA);
			int year = cal.get(Calendar.YEAR);	//현재 년도
			int yy = Integer.parseInt(JuminNo.substring(0, 2));	//"73" -> 73
			
			if((JuminNo.charAt(7) - 48) < 3) {
				yy = yy + 1900;
			} else {
				yy = yy + 2000;
			}
			
			int Age = year - yy + 1;	//본나이
			
			System.out.println("나이 : " + Age);
			
			//성별 추출
			//int Sex = (JuminNo.charAt(7) - 48);
			if ((JuminNo.charAt(7) - 48) % 2 == 0) {	//2,4면 여자
				System.out.println("성별 : 여자");
			} else {
				System.out.println("성별 : 남자");
			}
			
			//생년월일 추출 - 73/09/21
			System.out.println("생년월일 : " + yy + "/" + JuminNo.substring(2, 4) + "/" + JuminNo.substring(4, 6));
			
			//출신지역 추출 - 서울 (00~08)
			String LocaleCode[][] = {{"서울","00","08"},{"부산","09","12"},
					{"인천","13","15"},{"경기","16","28"},
					{"강원","26","34"},{"충북","35","39"},
					{"대전","40","40"},{"충남","41","43"},
					{"충남","45","47"},{"세종","44","44"},
					{"세종","96","96"},{"전북","55","64"},
					{"광주","65","66"},{"대구","67","70"},
					{"경북","71","80"},{"경남","81","84"},
					{"울산","82","85"},{"제주","91","95"}
			};
			
			String LocaleString = JuminNo.substring(8, 10);
			
			int Locale = Integer.parseInt(LocaleString);
			
			String BirthPlace = null;
			
			for(int j = 0; j < 18; j++) {
				if (Locale >= Integer.parseInt(LocaleCode[j][1]) &&
						Locale <= Integer.parseInt(LocaleCode[j][2])) {
					BirthPlace = LocaleCode[j][0];
				}
			}
			
			System.out.println("출신지역 : " + BirthPlace);
						
		} else {
			System.out.println("주민번호 틀림!!");
		}
	}

}
