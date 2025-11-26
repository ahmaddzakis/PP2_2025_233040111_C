package id.ac.unpas.pp2_c_233040111.modul3.latihanGemini;

public class ProgramProduk {
    public static void main(String[] args) {
        // Panggil Objek
        Produk elektronik = new Produk("Laptop Lenovo", 14000000, 200);

        // Panggil method setter dan getter
        elektronik.getInfoProduk();
        System.out.println("Stok Awal: " + elektronik.getStok());
        System.out.println("----------------");

        elektronik.setStok(50);
        elektronik.setStok(-20);

        System.out.println("----------------");
        System.out.println("Stok Akhir: " +  elektronik.getStok());
    }
}
