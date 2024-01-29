package java_20240129;

public class Cat {
		//멤버 변수
		String breed;
		String color;
		
		int age;
		
		//생성자-반환타입x
		Cat() {
			System.out.println("디폴트 생성자");
		}

		void setAge(int n) {
			
			if(age>0 && age<=150)
				age = n;
			else
				System.out.println("나이는 0~150 사이");
			
		}
		
		
		//void(반환타입) eat(함수명) ()(매개변수)
		//멤버 메소드
		void eat() {
			System.out.println("나이는 : " + age);
			System.out.println("츄르를 먹는다");
			System.out.println("칼라는 " + color + "이다.");
		}
		void scratch() {
			
			
		}
		void meow() {
			
			
		}

		
}
