package overriding;

public class Fruit {
	String name;
	String taste;
	String size;
	
	public void eat() {
		this.name = "Fruit";
		this.taste = "Varied by type";
		this.size = "Depends on variety";
		System.out.println("This is "+ name + " and its taste is "+ taste + ". Their size "+ size);
	}
}
