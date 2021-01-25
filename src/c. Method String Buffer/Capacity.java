public class Capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // cetak StringBuffer
        System.out.println(sb);
        // mengecek jumlah kapasitas String Buffer
        System.out.println(sb.capacity()+ "\n");
        // kalau kosong isi defaultnya 16 kalau ada isi int isinya sesuai nilai int


        StringBuffer sb2 = new StringBuffer("Hello World");
        // cetak string buffer
        System.out.println(sb2);
        // mengecek jumlah kapastias String Buffer (16 + 11)
        System.out.println(sb2.capacity());
    }
}
