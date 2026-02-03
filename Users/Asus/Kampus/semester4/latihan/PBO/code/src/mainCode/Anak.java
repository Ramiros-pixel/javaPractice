package mainCode;

public class Anak {
    int Nik;
    String nama;
    Ayah ayahku;
    
    public Anak(){
        
    }
    
    public Anak(int Nik, String nama, String lahir, String alamat){
        this.Nik = Nik;
        this.nama = nama;

    }

    public int getNik(){
        return Nik;
    }

    public String getNama(){
        return nama;
    } 


    public void setNik(int Nik){
        this.Nik = Nik;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAyah(Ayah ayahku){
        this.ayahku = ayahku;
    }
    
    public Ayah getAyah(){
        return ayahku;
    }


    
}
