package test29_compareTo;
//�񱳴� compareto
//�տ��� ũ�� ���, ������ 0, ������ ����

public class Ex1 {

	public static void main(String[] args) {
		String[] data = { "pear", "grape", "banana", "watermelon", "apple" };

		sort(data);

		for (String s : data) {
			System.out.print(s + " ");
		}
	}

	static void sort(String[] data) {
		int length = data.length;
        
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {

				if (data[i].compareTo(data[j]) > 0) {
					String temp = data[i];
				    data[i] = data[j];
				    data[j] = temp;
				}
			}

		}

	}

}
