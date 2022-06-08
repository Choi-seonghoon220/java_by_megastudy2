package test14_OXif로마지막건안들어가게도가능;

public class Data {
	void view(int...numArr) {
		int tot = 0;
		String result = "";
		
		for (int i = 0; i < numArr.length; i++) {
			result = result + numArr[i] + "+";
			tot += numArr[i];
		}
		System.out.println(result.substring(0, result.lastIndexOf('+')) + "=" + tot);
	}
	void view(String...nameArr) {
		String result = "";
		for (int i = 0; i < nameArr.length; i++) {
			result = result + nameArr[i] + ", ";
		}
		System.out.println(result.substring(0,result.lastIndexOf(',')));
	}
}
