package constructor;

public class Main4 {

	public static void main(String[] args) {
		Score a, b, c, d;
		
		a = new Score("�迵��", 90);
		b = new Score("������", 100);
		a = new Score("������", 80);
		
		c = b;
		b = null;
		
		a.print();
//		b.print();	// ���൵�� ����
		c.print();
//		d.print();	// ����
	}

}
