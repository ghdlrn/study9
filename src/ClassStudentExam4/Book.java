package ClassStudentExam4;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private int price;
	
	Book() {
		this("제목없음", "저자없음", "출판사없음", 0);
	} 
	Book(String n1, String n2, int n4 ){
		this(n1, n2, "출판사없음", n4);
	} 
	Book(String n1, String n2, String n3, int n4) {  //인자값 3개 받는 것
		title = n1;
		author = n2;
		publisher = n3;
		price = n4;
	}
	
	void displayBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
	}

}
