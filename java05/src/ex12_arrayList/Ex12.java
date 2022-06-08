package ex12_arrayList;

import java.util.ArrayList;

public class Ex12 {

	public static void main(String[] args) {
		ArrayList<String> strList;
		
		strList = new ArrayList<String>();
		
		strList.add("¼ÕÁ¤¿ì");
		strList.add("±èÇö¼®");
		strList.add("È«±æµ¿");
		
//		for (int i = 0; i < strList.size(); i++) {
//			System.out.print(strList.get(i) + " ");
//		}
		for( String v : strList ) {
			System.out.print( v+" ");
		}
	}

}
