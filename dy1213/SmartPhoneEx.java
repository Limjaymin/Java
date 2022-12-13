package dy1213;

import java.util.ArrayList;

public class SmartPhoneEx {

	public static void main(String[] args) { // 메인함수는 하나다.
		// TODO Auto-generated method stub
		//ArrayList<SmartPhone> 에 객체를 넣습니다.
		//삼성전자제품만 출력하시오.
		//애플제품만 출력하시오.
		//가격이 100만원 이상인 제품의 제품명과 가격을 출력하시오.
		//만들어진 객체수를 출력하시오.
		//갤럭시s20, 삼성전자(100), 300000, 안드로이드(1), 256
		//샤오미레드미, 샤오미(300), 260000, 안드로이드(1), 128
		//겔럭시s22, 삼성전자, 700000, 안드로이드, 256
		//겔럭시s21+, 삼성전자, 5500000, 안드로이드, 256
		//아이폰14, 애플, 1600000, ios, 128
		//아이폰13, 애플, 1000000, ios, 128
		System.out.println("========본인학번 이름(20221738,임종민)=========");
		ArrayList<SmartPhone> smList = new ArrayList<>();
		SmartPhone s1 = new SmartPhone("겔럭시s20", 100 , 300000 , 1 , 256);
		smList.add(s1);
		SmartPhone s2 = new SmartPhone("샤오미레드미", 300, 260000, 1, 128);
		smList.add(s2);
		SmartPhone s3 = new SmartPhone("겔럭시s22", 100, 700000, 1, 256);
		smList.add(s3);
		SmartPhone s4 = new SmartPhone("아이폰14", 200, 1600000, 2, 128);
		smList.add(s4);
		System.out.println(" 만들어진 객체 수 =" + smList.size() + "," + Phone.count);
		
		//삼성전자제품만 출력하시오.
		System.out.println("========삼성전자 제품======");
		for (int i = 0; i < smList.size(); i++) {
			SmartPhone smart = smList.get(i);
			if (smart.getMaker() == Define.SAMSUNG)
				System.out.println(smart.getName() + " , " + smart.getMaker() + " , "+ smList.get(i).getMemSize());
		}
		//애플제품만 출력하세요
		System.out.println("========애플제품========");
		for(int i = 0; i < smList.size(); i++) {
			SmartPhone smart = smList.get(i);
			if (smart.getMaker() == Define.APPLE)
				System.out.println(smart.getName() + " , " + smart.getMaker() + " , "+ smart.getPrice());
		}
		
		//가격이 100만원 이상인 제품의 제품명과 가격을 출력하시오.
		System.out.println("========가격 100만원 이상 제품========");
		for(int i = 0; i < smList.size(); i++) {
			if (smList.get(i).getPrice() >= 1000000)
				System.out.println(smList.get(i).getName() + " , " + smList.get(i).getMaker() + " , " + smList.get(i).getPrice());
		}		
	}
}


// 결과까지 캡쳐해서 총 6개의 파일 보내기.
// Define, Phone, PhoneInterface , SmartPhone, SmartPhoneEx , 캡쳐본 , 추가로 .java파일인지 확인하기.
