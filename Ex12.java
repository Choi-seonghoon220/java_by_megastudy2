public class Ex12 {
    public static void main(String[] args) {
        String st = "ȫ�浿";
        boolean a, b, c;

        a = st.equals("ȫ�浿");
        b = st.startsWith("ȫ");
        c = st.endsWith("��");

        System.out.println(a + " " + b + " " + c);
    }

}
