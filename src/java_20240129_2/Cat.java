package java_20240129_2;

public class Cat {
		//멤버 변수
		private String breed;
		private String color;
		
		/*
		 * 멤버 변수 값을 대입 및 변경은
		 * 생성자를 이용 또는 setter을 이용해서 값을 변경이나 초기화한다.
		 * 추갸ㅏ..setter. getter
		 * setter는 변수값을 변경핳 때 사용
		 * getter는 변수값을 읽어올 때 사용
		 */
		
		void setBreed(String s) {
			breed = s;
		}
		void setColor(String c) {
			color = c;
		}
		
		//생성자-반환타입x
		Cat(String s1, String s2) {
			breed = s1;
			color = s2;
		}

		Cat() {
			
		}
		
		//void(반환타입) eat(함수명) ()(매개변수)
		//멤버 메소드
		void eat() {
			System.out.println(breed);
			System.out.println(color);
		}
		void scratch() {
			
			
		}
		void meow() {
			
			
		}

		
}
