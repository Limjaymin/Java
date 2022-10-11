package dy1011;

public class Ex3_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray [] = {4, 55, 32, 28, 35, 2, 99, 13,43,65};
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}
		System.out.println();
		System.out.println("합계= " + sum + "평균 =" + (double)sum/intArray.length);
	}
}

// equals
// 자바를 잘한다? 자신이 필요한 걸 선택할줄 알아야한다.
