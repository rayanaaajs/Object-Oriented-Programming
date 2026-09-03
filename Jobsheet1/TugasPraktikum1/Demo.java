package Jobsheet1.TugasPraktikum1;

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
        

        sepeda.merk = "exotic";
        sepeda.warna = "oranye";
        sepeda.jenisSepeda = "MTB";
        sepeda.gigi = 3;

        hp.merk = "Samsung";
        hp.sistemOperasi = "Android";

        kipas.merk = "";
        kipas.kecepatan = 4;



    }
}
