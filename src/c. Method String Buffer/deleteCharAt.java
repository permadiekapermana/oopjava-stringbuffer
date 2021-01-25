public class deleteCharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        // hapus char index ke 5
        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}
