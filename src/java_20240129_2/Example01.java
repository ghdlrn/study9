package java_20240129_2;

import java.util.Scanner;

import java_20240129_2.Cat;

public class Example01 {

	public static void main(String[] args) {
	
		//Cat란 클래스를 통해서 c1이란 참조변수가 참조하는 객체를 생성함
		Cat c1 = new Cat( "페르시안고양이", "흰색"); 
		// new Cat()은 Cat()이란 생성자를 통해서 객체를 생성한다.
		
		c1.eat();
	
		Cat c2 = new Cat("코리아", "검정");   
		
		c2.eat();
		
		c2.setBreed("러시안블루");
		c2.eat();
	}

}
