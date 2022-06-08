package pack10;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st, kind;
		
		System.out.print("동물이름 : ");
		st = sc.next();
		
		kind = "기타";
		
		if (st.equals("사자") || st.equals("호랑이"))
		{
			kind = "고양이과";
		}
		if (st.equals("독수리") || st.equals("부엉이"))
		{
			kind = "조류과";
		}
		if (st.equals("늑대") ||  st.equals("여우"))
		{
			kind = "개과";
		}
		
		System.out.println(kind);
	}

}
