package ClassStudentExam2;

public class exam1 {

	public static void main(String[] args) {
		
		BankAccount s1 = new BankAccount("1122-3344-5566-7788","java", 10000);
		
		s1.displayBalnce();
		s1.deposit(5000);
		s1.withdraw(8000);
		
		
	}

}
