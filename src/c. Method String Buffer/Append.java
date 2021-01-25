public class Append {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        // menambah String pada belakang variabel, sama seperti operator + pada string
        sb.append(" World!");
        // cetak value sb
        System.out.println(sb);
    }
}
