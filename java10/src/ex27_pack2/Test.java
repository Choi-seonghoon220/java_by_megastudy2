package ex27_pack2;

import ex27_pack1.Info;

public class Test {

	public static void main(String[] args) {
		int a = Info.x;
//		int b = Info.y;
		
		Info.mB();
//		Info.mC();
		
		Info obj = new Info();
		
		obj.x = 20;
		obj.y = 30;
		
		obj.mB();
		obj.mC();
		
	}

}
