package test37_ramda_interface_ArrayList.sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		File file = new File("./data_file/ban_num_score.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		while (sc.hasNext()) {
			studentList.add(new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();
		
		studentList.sort(( a, b) -> {
			int res = Integer.compare(a.ban, b.ban);
			if( res==0 )
				res = Integer.compare(a.num,  b.num);
			return res;
		});
			
		int length = studentList.size();
		int tempBan = 0;
		Student temp;
		String tempString;
		double tempDouble;
		
		for (int i = 0; i < length; i++) {
			if (studentList.get(i).ban != tempBan) {
				System.out.println(studentList.get(i).ban + "¹Ý");
				System.out.println("   num    name    kor    eng    mat    tot    avg");
				System.out.println("-------------------------------------------------");
				tempBan = studentList.get(i).ban;
			}
			
//			for (int j = i + 1; j < length && studentList.get(i).ban == studentList.get(j).ban; j++) {
//				if (studentList.get(i).num > studentList.get(j).num) {
//					temp = studentList.get(i);
//					studentList.set(i, studentList.get(j));
//					studentList.set(j, temp);
//				}
//			}
			System.out.println(studentList.get(i) );
		}
	}
}

