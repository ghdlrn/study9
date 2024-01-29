package ClassStudentExam2;

/* 문제2 은행 계좌 클래스 만들기
 * 클래스 이름 : BankAcccount
 * 속성 : accountNumber(계좌번호), accountHolder(소유자), balance(잔액)
 * 기능:
 * deposit(amount) : 입금 메소드
 * withdraw(amount) : 출금 메소드
 * displayBalance() : 잔액을 출력하는 메소드
 * 초기화 : 생성자 이용
 */


public class BankAccount {

	private String accountNumber;
	private String accountHolder;
	private int balance;
	
	BankAccount(){} //디폴트 생성자
	BankAccount(String n1, String n2, int n3) {  //인자값 3개 받는 것
		accountNumber = n1;
		accountHolder = n2;
		balance = n3;
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원이 입금 되었습니다");
		System.out.println("잔액은 " + balance + "원 입니다.");
	}
	
	void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount + "원이 출금 되었습니다");
		System.out.println("잔액은 " + balance + "원 입니다.");
	}
	
	void displayBalnce() {
		System.out.println("잔액은 " + balance + "원 입니다.");
	}

}
