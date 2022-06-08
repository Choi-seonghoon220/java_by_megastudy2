package test35;

public class Ex1 {

	public static void main(String[] args) {
		Student[] arr = {
				new Student(1, "건길", 90),
				new Student(1, "형석", 100),
				new Student(1, "정우", 30),
				new Student(1, "민호", 50),

				new Student(2, "성범", 80),
				new Student(2, "철민", 60),
				new Student(2, "상철", 100),
				new Student(2, "경나", 90),
				new Student(2, "다빈", 80),
				
				new Student(3, "현아", 80),
				new Student(3, "소영", 100),
				new Student(3, "진숙", 40),
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
				System.out.println(arr[i].ban + "반");
				System.out.println("이름       점수      석차");
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
