package test04;

public class Test {

	public static void main(String[] args) {
		Calculator cal = new Calculator(100, 50);
		System.out.println("plus = " + cal.getPlus());
		System.out.println("subtract = " + cal.getSubtract());
		System.out.println("multiply = " + cal.getMultiply());
	}

}
