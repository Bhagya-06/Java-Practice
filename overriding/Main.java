package overriding;

public class Main {

	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		f.eat();
		Apple a = new Apple();
		a.eat();
		Orange o = new Orange();
		o.eat();

	}

}
