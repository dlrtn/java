package step2;

class Book {
	String title;	// 책 제목
	int price;		// 책 가격
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	// 복제 생성자
	Book(Book copy) {
		title = copy.title;
		price = copy.price;
	}
	
	void print() {
		System.out.println("제    목 : " + title);
		System.out.println("가    격 : " + price);
	}
}

public class MyBook {

	public static void main(String[] args) {
		//Book book1 = new Book();
		Book book1 = new Book("자바 클래스 기초", 10000);
		book1.print();
		
		Book book2 = new Book(book1);
		book2.title = "자바 디자인 패턴";
		book2.print();
	}
}

//생성자를 통해 같은 객체를 받아 객체의 정보를 할당하는 경우
//복제 생성자라고 부른다.
