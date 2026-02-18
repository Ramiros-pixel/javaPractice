package mainCode;
import java.util.*;

public class Ayah {
    String nama;
    List<Anak> listAnak;

    public Ayah(){
        
    }
    public Ayah(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public List<Anak> getListAnak(){
        return listAnak;
    }

    public void setListAnak(List<Anak> listAnak){
        this.listAnak = listAnak;
    }
    
}
