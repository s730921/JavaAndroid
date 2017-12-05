import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Jumincheck {

	public static void main(String[] args) {
		int sum = 0;
		int temp, result;
		
		String JuminNo;
		int weight[] = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		
		System.out.print("�ֹι�ȣ �Է� : ");
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
			System.out.println("�ֹι�ȣ ������!!");
			
			//���� ����
			Calendar cal = Calendar.getInstance(Locale.KOREA);
			int year = cal.get(Calendar.YEAR);	//���� �⵵
			int yy = Integer.parseInt(JuminNo.substring(0, 2));	//"73" -> 73
			
			if((JuminNo.charAt(7) - 48) < 3) {
				yy = yy + 1900;
			} else {
				yy = yy + 2000;
			}
			
			int Age = year - yy + 1;	//������
			
			System.out.println("���� : " + Age);
			
			//���� ����
			//int Sex = (JuminNo.charAt(7) - 48);
			if ((JuminNo.charAt(7) - 48) % 2 == 0) {	//2,4�� ����
				System.out.println("���� : ����");
			} else {
				System.out.println("���� : ����");
			}
			
			//������� ���� - 73/09/21
			System.out.println("������� : " + yy + "/" + JuminNo.substring(2, 4) + "/" + JuminNo.substring(4, 6));
			
			//������� ���� - ���� (00~08)
			String LocaleCode[][] = {{"����","00","08"},{"�λ�","09","12"},
					{"��õ","13","15"},{"���","16","28"},
					{"����","26","34"},{"���","35","39"},
					{"����","40","40"},{"�泲","41","43"},
					{"�泲","45","47"},{"����","44","44"},
					{"����","96","96"},{"����","55","64"},
					{"����","65","66"},{"�뱸","67","70"},
					{"���","71","80"},{"�泲","81","84"},
					{"���","82","85"},{"����","91","95"}
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
			
			System.out.println("������� : " + BirthPlace);
						
		} else {
			System.out.println("�ֹι�ȣ Ʋ��!!");
		}
	}

}
