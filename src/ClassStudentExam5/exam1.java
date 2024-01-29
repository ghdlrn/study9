package ClassStudentExam5;

public class exam1 {

	public static void main(String[] args) {
		
		Car s1 = new Car();
		
		s1.displayCarDetails();
		
		s1.setCar("그렌저", "현대", "2020", "흰색");
		
		System.out.println("-----------------------------");
		s1.displayCarDetails();

		System.out.println("-----------------------------");
		s1.setMake("기아");
		s1.setModel("k8");
		s1.displayCarDetails();
		
		

	}

}
