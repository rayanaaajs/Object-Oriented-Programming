package jobsheet1.TugasPraktikum1;

public class Motor extends Kendaraan {
    String cc, jenisMesin;

    public void menyalakanMesin(){
        System.out.println("Mesin motor dinyalakan");
    }

    public void bunyikanBel(){
        System.out.println("bel motor dibunyikan");
    }

    public void cetakInfo(){
        System.out.println("== INFORMASI MOTOR ==");
        System.out.println("Merk : " + merk);
        System.out.println("warna : " + warna);
        System.out.println("cc : " + cc);
        System.out.println("jenisMesin : " + jenisMesin);
    }
}
