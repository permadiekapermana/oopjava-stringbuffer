public class AppendLen {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        // menambah nilai StringBuffer mulai dari char array ke 0 - ke 5
		sb.append(" Of Java", 0, 5);
        System.out.println(sb + "\n");
        // new sb
        StringBuffer sb2 = new StringBuffer("Hello World");
        // menambah nilai StringBuffer mulai dari char array ke 0 - ke 7
		sb2.append(" Of Java", 0, 8);
		System.out.println(sb2);
    }
}
