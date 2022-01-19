package step4;

// 세탁기
class Washer extends Thread {
	// 세탁하기
	public void run() {
		int num1 = 0;
		for (int i=0; i<100000; i++) {
			num1 = num1 + i;
		}
		System.out.println("num1 : " + num1);
	}
}

// 전기 밥솥
class ElectricCooker extends Thread {
	// 밥하기
	public void run() {
		int num2 = 0;
		for (int i=0; i<100; i++) {
			num2 = num2 + i;
		}
		System.out.println("num2 : " + num2);
	}
}

public class IsThisOOP2 {

	public static void main(String[] args) {
		Washer class1 = new Washer();
		ElectricCooker class2 = new ElectricCooker();

		class1.start();
		System.out.println("-----------------------");
		class2.start();
	}

}
