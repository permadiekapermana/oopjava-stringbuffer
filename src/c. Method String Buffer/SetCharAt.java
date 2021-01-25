public class SetCharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        // set char index ke 4 menjadi i
        sb.setCharAt(4, 'i');
        System.out.println(sb);
    }
}
