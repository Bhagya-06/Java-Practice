package overriding;

public class Orange extends Fruit {

	public void eat() {
		this.name = "Orange";
		this.taste = "Tangy and juicy";
		this.size = "is Medium";
		System.out.println("This is "+ name + " and its taste is "+ taste + ". Their size "+ size);
	}
}
