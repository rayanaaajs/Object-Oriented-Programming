package Jobsheet1.TugasPraktikum1;

public class Sepeda extends Kendaraan {
    String jenisSepeda;
    int gigi;

    public void aturGigi(){
        System.out.println("Gigi sepeda diatur ke " + gigi);
    }

    public void bunyikanBel(){
        System.out.println("bel sepeda dibunyikan");
    }

    public void cetakInfo(){
        System.out.println("== INFORMASI SEPEDA");
        System.out.println("Merk" + merk );
        System.out.println("Warna" + warna );
        System.out.println("Jenis Sepeda " + jenisSepeda );
        System.out.println("Gigi " + gigi );
    }
}
