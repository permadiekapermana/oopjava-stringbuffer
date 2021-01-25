public class delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        // menghaspus char index ke 5 - 12
        System.out.println(sb.delete(5, 12));
        System.out.println(sb);
    }
}
