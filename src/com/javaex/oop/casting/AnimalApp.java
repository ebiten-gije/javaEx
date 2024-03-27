package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("멍멍이");
		//	업캐스팅: 부모타입으로 자손 객체를 참조하는 것(자동으로 됨)
		//	참조 타입에 설계된 것만 사용할 수 있다
		dog1.eat();
		dog1.walk();
//		dog1.balk(); 
		//	Animal 설계도에 있는 것만 사용 가능
		
		Dog dog2 = new Dog("초코");
		dog2.bark();
		
		//	다운캐스팅: 명시적으로 타입을 지정해주어야;;
		//	dog1 bark를 향해...
		((Dog)(dog1)).bark();	//	Animal -> Dog 로 캐스팅 후 실행
		
		{
			Dog pet = new Dog("koro");
			pet.eat();
			pet.walk();
			pet.bark();
			
			pet = null;
			
//			pet = new Cat("네코");	//	부모가 아닌 클래스에서는 참조 불가
		}
		
		{
			Animal pet = new Dog("inu");
			pet.eat();
			pet.walk();
//			pet.bark();
			//	현재 어떤 클래스의 인스턴스인지 확인 필요
			if (pet instanceof Dog) {
				((Dog)pet).bark();
			} else if (pet instanceof Cat){
				((Cat)pet).meow();
			}
			pet = null;
			
			pet = new Cat("neko");
			if (pet instanceof Dog) {
				((Dog)pet).bark();
			} else if (pet instanceof Cat){
				((Cat)pet).meow();
			}
		}
		
		Cat a = new Cat("나비");
		Dog b = new Dog("바둑이");
		
		
	
		a.eat();
		a.meow();

		b.walk();
		b.bark();
	}

}
