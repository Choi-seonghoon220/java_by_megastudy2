public class Ex11 {
    public static void main(String[] args) {
        String st = "메가코딩컴퓨터학원";
        String t;

        t = st.substring(0,4);

        System.out.println(st.length());
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(1));
        System.out.println(t);
        System.out.println(st.substring(4));
        System.out.println(st.indexOf('코'));
        System.out.println(st.indexOf("컴퓨터"));
    }
}
