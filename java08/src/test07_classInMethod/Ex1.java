package test07_classInMethod;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		add(10);
	}
	static void add(int max) {
		class Add{
		    int add(int num) {
		    	if (num == 1) {
					return 1;
				}
	            int h=num+add(num-1);
				System.out.print(num);
				if( num<max )
				   System.out.print("+");
				
				return h;
		    }
		}
		
		Add add_obj = new Add();
		System.out.println("=" + add_obj.add(max) );
	}
	
}
