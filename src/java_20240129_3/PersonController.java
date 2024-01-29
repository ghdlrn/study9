package java_20240129_3;

import java.util.Scanner;

import java_20240129_2.Cat;

public class PersonController {

	public static void main(String[] args) {
	
		/*인스턴스 메소드는 객체를 생성한다음 참조변수로 접근 가능
		 * Person p = new Person();
		 * p.showInfo();
		 * 
		 * 스태틱 메소드는 객체 생성하지 않고 바로 접근 가능
		 * 클래스명, 메소드명으로 홏풀 가능
		 */
		Person p = new Person();
		p.showInfo();
		//인스턴스 메서드는 객체를 생성한다음 참조변수로 접근 가능
		
		
		Person.staticshow(); //주로 사용
		//스태틱 메서드는 객체 생성하지 않고 바로 접근 가능
		// 클래스명, 메서드 명으로 호출 가능
		p.staticshow();  //사용자제...
	}

}
