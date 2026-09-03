package Jobsheet1.TugasPraktikum1;

public class Kendaraan {
    String merk, warna;

    public void bergerak(){
        System.out.println("Kendaraan sedang bergerak");
    }

    public void berhenti(){
        System.out.println("kendaraan sedang berhenti");
    }

    public void cetakInfo(){
        System.out.println("Merk Kendaraan : " + merk);
        System.out.println("Warna Kendaraan : " + warna);
    }
}
