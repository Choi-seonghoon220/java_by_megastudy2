package ex03;

import java.io.File;

public class Ex3 {

	public static void main(String[] args) {
		File file = new File("e:\\자바 수업자료");
		
		File[] arr = file.listFiles();
		int size = 0;
		
		for (File f : arr) {
			if (f.isFile()) {
				System.out.println(f.getPath());
				size += f.length();
			}
		}
		System.out.printf("size = %.2fMB", size/ Math.pow(2,  20));
	}
}
