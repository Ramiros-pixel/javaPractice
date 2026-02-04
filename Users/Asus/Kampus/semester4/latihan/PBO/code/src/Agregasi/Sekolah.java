package Agregasi;

import java.util.*;
public class Sekolah {
    String namaSekolah;
    ArrayList <Guru> daftarGuru;

    public Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
        this.daftarGuru = new ArrayList<>();

    }

    public void addGuru(Guru guru){
        daftarGuru.add(guru);
    }

    public void Sekolahan(){
        System.out.println("Sekolah"+ namaSekolah +" :");
        for(Guru guru : daftarGuru){
            System.out.println("- " + guru.getNamaGuru());
        }

    }


}
