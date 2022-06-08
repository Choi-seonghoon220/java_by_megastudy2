package pack6;

public class Ex6 {

	public static void main(String[] args) {
		String st = "100 200 300";
		String[] arr;
		int a, b, c;
		
		arr = st.split("");	//st.split("\\s+"));
		
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		c = Integer.parseInt(arr[2]);
		
		System.out.println(arr[0] + arr[1] + arr[2]);
		System.out.println(a + b + c);
	}
}
