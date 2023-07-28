package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	
	public void ex1() {
		
		// Animal a1 = new Animal();
		// Cannot instantiate the type Animal (객체화 할 수 없음)
		
		// 클래스 : 객체의 속성, 기능을 정의한 것(일종의 설계도)
		// 추상 클래스 : 미완성 메서드를 포함한 클래스(미완성 설계도)
		// -> 미완성 설계도로는 객체를 만들 수 없다! --> 오류발생
		
		// 해결 방법 : Animal을 상속받아 미완성 부분을 구현한 
		// 				클래스를 이용해 객체 생성
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setType("척추동물");
		p1.setEatType("잡식");
		
		// 오버라이딩한 메서드 호출
		p1.eat();
		p1.breath();
		System.out.println(p1.toString() );
		
		
		Fish f1 = new Fish();
		
		f1.setType("무척추동물");
		f1.setEatType("잡식");
		System.out.println(f1.toString());
		
		
		
		
		
	}

}
