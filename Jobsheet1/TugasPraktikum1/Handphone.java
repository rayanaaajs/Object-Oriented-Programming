package Jobsheet1.TugasPraktikum1;

public class Handphone {
    String merk, sistemOperasi;

    public void nyalakan(){
        System.out.println("Hp dinyalakan");
    }

    public void kirimPesan(){
        System.out.println("handphone digunakan untuk mengirim pesan");
    }

    public void cetakInfo(){
        System.out.println("== INFORMASI HANDPHONE ==");
        System.out.println("Merk" + merk);
        System.out.println("Sistem Operasi" + sistemOperasi);
    }

}
