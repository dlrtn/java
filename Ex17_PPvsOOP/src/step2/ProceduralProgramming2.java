package step2;

public class ProceduralProgramming2 {

	public static void main(String[] args) {
		// 첫 번째 기능
		wash();
		System.out.println("-----------------------");
		
		// 두 번째 기능
		cook();
	}

	// 세탁하기
	public static void wash() {
		int num1 = 0;
		for (int i=0; i<100000; i++) {
			num1 = num1 + i;
		}
		System.out.println("num1 : " + num1);
	}

	// 밥하기
	public static void cook() {
		int num2 = 0;
		for (int i=0; i<100; i++) {
			num2 = num2 + i;
		}
		System.out.println("num2 : " + num2);
	}
}
