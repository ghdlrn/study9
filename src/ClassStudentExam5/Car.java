package ClassStudentExam5;

	/* 자동차클래스 만들기
	 * 클래스 이름: Car
	 * 속성: make(제조사), model(모델), year(제조년도), color(색상)
	 * 기능:
	 * startEngine(): 엔진을 켜는 메소드
	 * stopEngine(): 엔진을 끄는 메소드
	 * displayCarDetails(): 자동차의 모든 정보를 출력하는 메소드
	 * 초기화 : setter()이용
	 */
public class Car {

	private String make;
	private String model;
	private String year;
	private String color;
	
	void setMake(String n1) {
		make = n1;
	}
	void setModel(String n2) {
		model = n2;
	}

	
	void setCar(String n1, String n2, String n3, String n4) {  //인자값 3개 받는 것
		make = n1;
		model = n2;
		year = n3;
		color = n4;
	}
	
	
	void displayCarDetails() {
		System.out.println("제조사 : " + make);
		System.out.println("모델 : " + model);
		System.out.println("제조년도 : " + year);
		System.out.println("색상 : " + color);
	}

}
