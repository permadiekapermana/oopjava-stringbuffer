public class EnsureCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // ukuran awal stringBuffer
        System.out.println(sb.capacity());
        // menambah ukuran string buffer
		sb.ensureCapacity(17);
		System.out.println(sb.capacity());
    }
}
