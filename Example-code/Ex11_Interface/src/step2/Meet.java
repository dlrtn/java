package step2;

interface Greet {
	void greet();
}

interface Bye extends Greet {
	void bye();
}

class Morning implements Bye {

	public void bye() {
		System.out.println("안녕히 계세요.");
	}

	public void greet() {
		System.out.println("안녕하세요.");
	}
}

public class Meet {

	public static void main(String[] args) {
		Morning morning = new Morning();
		morning.greet();
		morning.bye();
	}

}
