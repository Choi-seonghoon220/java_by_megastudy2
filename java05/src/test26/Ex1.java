package test26;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { "±è°ü¼º", "ÀÌ°Ç±æ", "±è¸íÈ¯", "ÀÌÁ¤ÈÄ", "±è³²½Ä", "È«±æµ¿" };
		
		String[] arr_kim, arr_lee;
		Names obj;
		
		obj = new Names(arr);
		
		arr_kim = obj.getNames("±è");
		arr_lee = obj.getNames("ÀÌ");
		
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
