package test02;

public class Test {

	public static void main(String[] args) {
		Score score = new Score();
		
		score.setData("�ּ���", 50, 60, 70);
		score.view();
		System.out.println("��� = " + score.getAvg());
		score.setKor(100);
		score.view();
		System.out.println("��� = " + score.getAvg());
	}

}
