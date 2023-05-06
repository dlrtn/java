package step1;

public class ProceduralProgramming {

	public static void main(String[] args) {
		// 첫 번째 기능
		int num1 = 0;
		for (int i=0; i<10000; i++) {
			num1 = num1 + i;
		}
		System.out.println("num1 : " + num1);

		System.out.println("-----------------------");
		
		// 두 번째 기능
		int num2 = 0;
		for (int i=0; i<100; i++) {
			num2 = num2 + i;
		}
		System.out.println("num2 : " + num2);
	}

}
