package mainCode;

import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Anak uan = new Anak();
        Anak usro = new Anak();


        uan.setNama("Uan");
        uan.setNik(123456789);       
        usro.setNama("Usro");
        usro.setNik(4255254);

        Ayah bapak = new Ayah();
        bapak.setNama("Oon");

        List<Anak> listAnakorang = new ArrayList<>();
        listAnakorang.add(uan);
        listAnakorang.add(usro);

        bapak.setListAnak(listAnakorang);

        uan.setAyah(bapak);
        usro.setAyah(bapak);

        System.out.println("Nama ayah: " + bapak.getNama());
        System.out.println("Daftar anak: ");
        for(Anak anak : listAnakorang){
            System.out.println("-"+ anak.getNama() + " (Nik: "+ anak.getNik()+")");
        }





    }
}
