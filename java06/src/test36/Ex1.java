package test36;

public class Ex1 {

	public static void main(String[] args) {
		int[] ban = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };
		int[] num = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		
		int length = ban.length;
		int temp = 0;
		
		System.out.println("      ¹İ    ¹øÈ£");
		System.out.println("  -------");
		
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (ban[i] > ban[j] || (ban[i] == ban[j] && num[i] > num[j])) {
					temp = ban[i];
					ban[i] = ban[j];
					ban[j] = temp;
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.printf("%4d %4d\n", ban[i], num[i]);
			
		}

	}

}
