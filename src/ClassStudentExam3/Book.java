package ClassStudentExam3;

/* 문제3 도서 클래스 만들기
 * 클래스 이름 : Book
 * 속성 : title(제목), author(저자), publisher(출판사), price(가격)
 * 기능:
 * displayBookInfo() : 도서의 모든 정보를 출력하는 메소드
 */


public class Book {

	private String title;
	private String author;
	private String publisher;
	private int price;
	
	Book(){
		title = "제목없음";
		author = "저자없음";
		publisher = "출판사 없음";
		price = 0;
	} 
	Book(String n1, String n2, int n4) {  
		title = n1;
		author = n2;
		publisher = "한빛미디어";
		price = n4;
	}
	Book(String n1, String n2, String n3, int n4) {  
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
