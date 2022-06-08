package ex06;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Shape();
		shape.setWidth(5);;
		shape.setHeight(20);
		
		System.out.println("Area = " + shape.getArea());
	}

}
