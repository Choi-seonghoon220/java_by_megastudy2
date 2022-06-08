package test39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
	ArrayList<String[]> list = new ArrayList<>();
	
	public Data (String txt) throws FileNotFoundException  {
		
		File file = new File("./data_file/" + txt);
		
		Scanner sc = null;
		sc = new Scanner(file);
		
		String line;
		
		while(sc.hasNext()) {
			line = sc.nextLine();
			this.list.add( line.split(",") );
		}
		sc.close();
	}

	public String[] find(String temp) {
		String[] result = null;
		
		for (String[] arr : this.list) {
			if (arr[0].equals(temp)) {
				return arr;
			}
		}
		return result;
		
	}
}
