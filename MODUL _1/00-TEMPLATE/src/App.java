// membuat class sebagai tamplate
class Mahasiswa{
    // membuat ciri-ciri atau atribut objek 
    String Nama;
    String Nim; 
    String Prodi;
    String IPK;
    int umur;
}


public class App {
    public static void main(String[] args) throws Exception {

        // intansiasi atau membuat objek 
        Mahasiswa mhs_1 = new Mahasiswa();

        // pengisian data objek 
        mhs_1. Nama = "ujang";
        mhs_1. Nim = "123456";
        mhs_1. Prodi ="PTI";
        mhs_1. IPK  = "3.2"; 
        mhs_1. umur = 23;

        // cetak data ujang
        System.out.println("Nama Mahasiswa : "+ mhs_1.Nama);
        System.out.println("Nim Mahasiswa : "+ mhs_1.Nim);
        System.out.println("Prodi Mahasiswa : "+ mhs_1.Prodi);
        System.out.println("IPK Mahasiswa : "+ mhs_1.IPK);
        System.out.println("umur Mahasiswa : "+ mhs_1.umur);
    }
}