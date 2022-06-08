package ex02;

import java.io.File;

public class Ex1 {

	public static void main(String[] args) {
		File file = new File("C:\\");
		
		File[] arr = file.listFiles();
		
		for (File f : arr) {
			if (f.isDirectory())
				System.out.println(f.getPath());
		}
	}

}
