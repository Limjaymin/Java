package dy1011;

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어,영어,수학,미술,체육 점수를 입력하세요.(0~100), 배열에 저장하고 (점수 저장, 과목배열 초기값)
		int intArray[] = new int[5];
 		int sum=0;
		// scanner 사용.
		Scanner scanner = new Scanner(System.in);
		String names[] = {"국어점수", "영어점수", "수학점수", "미술점수", "체육점수"};
		
		System.out.print("(국어,영어,수학,미술,체육 점수를 입력하세요) >>"); 
		for(int i=0; i<intArray.length;i++) {
			 intArray[i] = scanner.nextInt();
			 sum += intArray[i];
		}
		
		
		for(int j=0; j<names.length; j++) {
			System.out.println(names[j]+" : " + intArray[j]);
		}
		
		System.out.println("합계는" + sum);
		System.out.print("평균운" + (double)sum/intArray.length);
		scanner.close();
	
	}

}
