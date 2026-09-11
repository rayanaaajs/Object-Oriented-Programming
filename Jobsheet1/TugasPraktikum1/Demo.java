package jobsheet1.TugasPraktikum1;

public class Demo {
    public static void main(String[] args) {

        Motor motor = new Motor();
        Sepeda sepeda = new Sepeda();
        Handphone hp = new Handphone();
        KipasAngin kipas = new KipasAngin();

        motor.merk = "Honda";
        motor.warna = "Hitam";
        motor.jenisMesin = "4 tak";
        motor.cc = "110";
        System.out.println("");
        motor.cetakInfo();
        motor.menyalakanMesin();
        motor.bunyikanBel();
        motor.bergerak();
        motor.berhenti();

        sepeda.merk = "exotic";
        sepeda.warna = "oranye";
        sepeda.jenisSepeda = "MTB";
        sepeda.gigi = 3;
        System.out.println("\n");
        sepeda.cetakInfo();
        sepeda.aturGigi();
        sepeda.bunyikanBel();
        sepeda.bergerak();
        sepeda.berhenti();

        hp.merk = "Samsung";
        hp.sistemOperasi = "Android";
        System.out.println("");
        hp.cetakInfo();
        hp.nyalakan();
        hp.kirimPesan();

        kipas.merk = "Sanken";
        kipas.kecepatan = 3;
        System.out.println("");
        kipas.cetakInfo();
        kipas.hidupkan();
        kipas.ubahKecepatan();
    }
}



