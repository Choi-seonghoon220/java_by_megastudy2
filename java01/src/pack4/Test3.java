package pack4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r, line, area;
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		
		r = sc.nextDouble();
		
		line = 2 * 3.14 * r;
		area = 3.14 * r * r;
		
		System.out.println(String.format("���ѷ� = %f\n������ = %f", line, area));
	}

}
