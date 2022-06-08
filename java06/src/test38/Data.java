package test38;

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

	public ArrayList<String[]> getData(String sex) {
		ArrayList<String[]> result = new ArrayList<>();
		
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i)[1].equals(sex)) {
				result.add(this.list.get(i));
			}
		}
		
		result.sort((a, b) -> a[0].compareTo(b[0]));
		
		return result;
	}
}
