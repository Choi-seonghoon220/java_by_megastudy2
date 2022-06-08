package ex2_3;

import java.util.ArrayList;
import java.util.function.Supplier;


public class Main {

	public static void main(String[] args) {
		Supplier<ArrayList<Integer>> func = () -> new ArrayList<>();
		ArrayList<Integer> list = func.get();
		
		Supplier<ArrayList<Integer>> test = ArrayList<Integer>::new;
	}

}
