
class Book {
	String title;
	
	void printBook() {
		System.out.println("제  목 : " + title);
	}
}

class Novel extends Book {
	String writer;
	
	void printNov() {
		printBook();
		System.out.println("저  자 : " + writer);
	}
}

class Magazine extends Book {
	int day;
	
	void printMag() {
		printBook();
		System.out.println("발매일 : " + day + "일");
	}
}

public class Bookshelf {

	public static void main(String[] args) {
		Novel nov = new Novel();
		nov.title = "홍길동전";
		nov.writer = "허균";
		
		Magazine mag = new Magazine();
		mag.title = "월간 자바";
		mag.day = 20;
		
		nov.printNov();
		System.out.println();
		mag.printMag();
	}

}
