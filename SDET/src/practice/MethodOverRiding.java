package practice;

/*Methods Over Loading:
 * 1) with in single class and Multiple Class (Inheritance)
 * 2) Definition should be changed
 * 
 * Method Over Riding:
 * 1) Only in Multiple classes(Inheritance)
 * 2) Definition should not be changed
 */


class Animal{
	void eat() {
		System.out.println("Animal======= Eat method");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog========Eat Method");
	}	
}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat========Eat Method");
	}
	void eat(int a) {
		System.out.println(a);
	}
}


public class MethodOverRiding {
	public static void main(String[] args) {
		Dog d = new Dog();
				d.eat();
		Cat c = new Cat();
		c.eat();
		c.eat(10);
	}	
}
