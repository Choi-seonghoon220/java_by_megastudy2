package test26;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { "�����", "�̰Ǳ�", "���ȯ", "������", "�賲��", "ȫ�浿" };
		
		String[] arr_kim, arr_lee;
		Names obj;
		
		obj = new Names(arr);
		
		arr_kim = obj.getNames("��");
		arr_lee = obj.getNames("��");
		
		view(arr_kim);
		view(arr_lee);
	}
	
	static void view(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
