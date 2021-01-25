public class Insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        // menambahkan string pada index ke-
        sb.insert(12, " I'm Here.");
        System.out.println(sb);

        sb.insert(6, "the ");
        System.out.println(sb);
    }
}
