package test34;

public class Ex1 {

	public static void main(String[] args) {
		int[] ban = { 1, 1, 1, 1, 1, 
						2, 2, 2, 2, 2, 
						3, 3, 3, 3, 3 };
		int[] num = { 1, 2, 3, 4, 5, 
						1, 2, 3, 4, 5,
						1, 2, 3, 4, 5 };
		int[] score = { 90, 50, 60, 80, 80,
						50, 50, 60, 70, 80,
						40, 50, 60, 60, 90 };

		int[] rankArr = new int[15];
		
//		
//		for (int i = 0; i < 3; i++) {
//			int rank = 1;
//			for (int j = i * 5; j < i * 5 + 3; j++) {
//				for (int k = i * 5 + 1; k < i * 5 + 4; k++) {
//					if (score[k] > score[i]) {
//						rank++;
//					}
//				}
//			}
//			
//		}
		
		int temp=-9999;
		int idx=0;
		
		for (int i = 0; i < 15; i++) {
			if(ban[i] != temp) {
				System.out.println(ban[i] + "반");
				System.out.println("    번호     점수     석차");
			    temp = ban[i];
			    idx=i;
			}
			
			int r=1;
			for( int j=idx;  j<15 && ban[i]==ban[j]; j++ ) {
				  if(score[j] > score[i]) {
					     r++;
				  }
			}
			rankArr[i] = r;
			
			System.out.printf("%4d %4d %4d\n", num[i], score[i], rankArr[i] );
		}
	}

}
