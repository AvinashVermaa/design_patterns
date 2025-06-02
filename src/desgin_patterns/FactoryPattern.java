package desgin_patterns;

//Creates objects without exposing instantiation logic.

interface Shape {
	public void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing Circle::");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Drawing Square::");
	}
}

class Oval implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Oval::");
	}
}

public class FactoryPattern {

	public static Shape getShape(String type) {
		return switch (type) {
		case "Circle" -> new Circle();
		case "Square" -> new Square();
		case "Oval" -> new Oval();
		default -> null;
		};
	}
	
	public static void main(String[] args) {
		Shape shape = FactoryPattern.getShape("Circle");
		shape.draw();
	}
}
