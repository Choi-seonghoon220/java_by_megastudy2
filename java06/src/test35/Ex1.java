package test35;

public class Ex1 {

	public static void main(String[] args) {
		Student[] arr = {
				new Student(1, "�Ǳ�", 90),
				new Student(1, "����", 100),
				new Student(1, "����", 30),
				new Student(1, "��ȣ", 50),

				new Student(2, "����", 80),
				new Student(2, "ö��", 60),
				new Student(2, "��ö", 100),
				new Student(2, "�泪", 90),
				new Student(2, "�ٺ�", 80),
				
				new Student(3, "����", 80),
				new Student(3, "�ҿ�", 100),
				new Student(3, "����", 40),
		};
		view(arr);
	}
	static void view(Student[] arr) {
		int length = arr.length;
		int[] rank = new int[length];
		int temp = Integer.MIN_VALUE;
		int idx = 0;
		
		for (int i = 0; i < length; i++) {
			if (arr[i].ban != temp) {
				System.out.println(arr[i].ban + "��");
				System.out.println("�̸�       ����      ����");
				System.out.println("---------------");
				temp = arr[i].ban;
				idx = i;
			}
			
			int r = 1;
			for (int j = idx; j < length && arr[i].ban == arr[j].ban; j++) {
				if (arr[i].score < arr[j].score) {
					r++;
				}
			}
			rank[i] = r;
			
			System.out.printf("%-4s %5d %4d\n", arr[i].name, arr[i].score, rank[i]);
		}
	}
}
