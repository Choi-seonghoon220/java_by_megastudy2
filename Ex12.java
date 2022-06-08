public class Ex12 {
    public static void main(String[] args) {
        String st = "È«±æµ¿";
        boolean a, b, c;

        a = st.equals("È«±æµ¿");
        b = st.startsWith("È«");
        c = st.endsWith("µ¿");

        System.out.println(a + " " + b + " " + c);
    }

}
