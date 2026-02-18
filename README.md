# Java Keyword & Modifier Reference (Tabel Perbandingan)

Panduan cepat untuk memahami keyword dan modifier penting di Java.

| Keyword / Modifier      | Digunakan Untuk                                    | Contoh Penggunaan                                   | Catatan                                                                 |
|-------------------------|----------------------------------------------------|----------------------------------------------------|------------------------------------------------------------------------|
| `class`                 | Mendefinisikan kelas                               | `public class Mobil {}`                            | Blueprint objek, bisa punya atribut & method                           |
| `public`                | Modifier akses (bisa diakses dari mana saja)      | `public int tahun;`                                | Cocok untuk class, method, atau variabel yang ingin diakses global     |
| `private`               | Modifier akses (hanya diakses di kelas yang sama)| `private String merk;`                             | Aman untuk data sensitif, tidak bisa diakses dari luar                 |
| `protected`             | Akses di package sama / subclass                  | `protected int kecepatan;`                         | Cocok untuk inheritance                                                |
| default (tanpa keyword) | Akses di package yang sama                         | `int roda;`                                        | Hanya bisa diakses di package yang sama                                 |
| `void`                  | Method tidak mengembalikan nilai                  | `public void hidupkanMesin() {}`                  | Jika ingin mengembalikan nilai → ganti dengan tipe data (int, String) |
| `static`                | Milik kelas, bukan objek                           | `public static int jumlahRoda = 4;`              | Bisa dipanggil tanpa membuat objek                                     |
| `public static void`    | Biasanya untuk method `main` (entry point)        | `public static void main(String[] args) {}`      | Kombinasi keyword umum untuk method awal program                       |
| `this`                  | Referensi ke objek saat ini                        | `this.merk = merk;`                               | Digunakan di constructor atau method                                    |
| `super`                 | Referensi ke parent class                           | `super(nama, tahun);`                              | Dipakai untuk memanggil constructor atau method parent                  |

---

## Contoh Lengkap

```java
public class Mobil {
    private String merk;
    private int tahun;

    // Constructor
    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Method non-static
    public void info() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }

    // Method static
    public static void infoUmum() {
        System.out.println("Mobil biasanya punya 4 roda");
    }

    // Main method
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota", 2020);
        m.info();           // memanggil method non-static
        Mobil.infoUmum();   // memanggil method static
    }
}
