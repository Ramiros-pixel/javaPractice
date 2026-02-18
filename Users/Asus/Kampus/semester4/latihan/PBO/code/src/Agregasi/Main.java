package Agregasi;

public class Main {

    public static void main(String[] args) {
    Guru guru1 = new Guru("Budi");
    Guru guru2 = new Guru("Siti");
    Guru guru3 = new Guru("Andi");
    
    Sekolah sekolah = new Sekolah(" SMA 1 Jakarta");
    sekolah.addGuru(guru1);
    sekolah.addGuru(guru2);
    sekolah.addGuru(guru3);
    sekolah.Sekolahan();
    }
}
