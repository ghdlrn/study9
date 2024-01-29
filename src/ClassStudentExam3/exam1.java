package ClassStudentExam3;

public class exam1 {

	public static void main(String[] args) {
		
		Book s1 = new Book("이것이 자바다","java", "java2", 10000);
		
		s1.displayBookInfo();
		
		Book s2 = new Book();
		
		s2.displayBookInfo();
		
		Book s3 = new Book("이것이 자바다","java", 10000);
		
		s3.displayBookInfo();
	}

}
