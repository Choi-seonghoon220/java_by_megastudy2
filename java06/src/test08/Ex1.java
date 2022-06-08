package test08;

public class Ex1 {

	public static void main(String[] args) {
		String[] name = { "kim", "mun", "lee", "park", "hong" };
		int[] kor = { 100, 50, 60, 70, 80 };	// 국어점수
		int[] eng = { 70, 60, 50, 100, 100 };	// 영어점수
		int[] mat = { 40, 50, 50, 70, 100 };	// 수학점수
		
		view(name, kor, eng, mat);
	}
	static void view(String[] name, int[] kor, int[] eng, int[] mat) {
		int length = name.length;
		int[] tot = new int[length];
		double[] avg = new double[length];
		
		for (int i = 0; i < length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
		}
		
		System.out.println("   이름        국어        영어       수학        총점         평균");
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < length; i++) {
			System.out.printf(" %-5s %3d %5d %5d %5d %7.2f\n", name[i], kor[i], eng[i], mat[i], tot[i], avg[i]);
		}
	}
}
