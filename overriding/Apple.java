package overriding;

public class Apple extends Fruit {
	
	public void eat() {
		this.name = "Apple";
		this.taste = "Sweet and crisp";
		this.size = "is Big";
		System.out.println("This is "+ name + " and its taste is "+ taste + ". Their size "+ size);
	}
}
