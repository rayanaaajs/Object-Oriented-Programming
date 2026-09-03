package Jobsheet1.TugasPraktikum1;

public class KipasAngin {
    String merk;
    int kecepatan;

    public void hidupkan(){
        System.out.println("Kipas angin dihidupkan.");
    }

    public void ubahKecepatan(){
        System.out.println("kecepatan kipas diubah menjadi " + kecepatan);
    }

    public void cetakInfo(){
        System.out.println("== INFORMASI KIPAS ANGIN ==");
        System.out.println("merk : " + merk);
        System.out.println("kecepatan : " + kecepatan);
    }
}
