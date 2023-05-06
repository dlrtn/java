package step3;

// 세탁기
class Washer {
	// 세탁하기
	public void wash() {
		int num1 = 0;
		for (int i=0; i<100000; i++) {
			num1 = num1 + i;
		}
		System.out.println("num1 : " + num1);
	}
}

// 전기 밥솥
class ElectricCooker {
	// 밥하기
	public void cook() {
		int num2 = 0;
		for (int i=0; i<100; i++) {
			num2 = num2 + i;
		}
		System.out.println("num2 : " + num2);
	}
}

public class IsThisOOP {

	public static void main(String[] args) {
		Washer class1 = new Washer();
		ElectricCooker class2 = new ElectricCooker();

		class1.wash();
		System.out.println("-----------------------");
		class2.cook();
	}

}
