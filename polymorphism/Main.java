package polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		s.erase();
		s = new Circle();
		s.draw();
		s.erase();
		s = new Triangle();
		s.draw();
		s.erase();
		s = new Square();
		s.draw();
		s.erase();
	}

}
