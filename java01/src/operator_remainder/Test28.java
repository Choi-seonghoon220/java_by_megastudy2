package operator_remainder;

public class Test28 {

	public static void main(String[] args) {
		String names = "ȫ�浿   �̰Ǳ�\t  ����  �ּ���   ";
		String st = "";
		String[] arr;
		
		arr = names.split("\\s+");
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			st = st + arr[i] + "��, ";
		}
		System.out.println(st.substring(0, st.length() - 2));
	}
}
