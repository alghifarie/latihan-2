
# Penghitung Umur

Aplikasi **Penghitung Umur** adalah program Java sederhana yang menghitung umur seseorang berdasarkan tanggal lahir yang diinputkan. Program ini menggunakan kelas bantu `PenghitungUmurHelper` untuk melakukan perhitungan umur secara akurat.

## Fitur

- Menghitung umur berdasarkan tanggal lahir.
- Mendukung format tanggal yang fleksibel.
- Kode bersifat modular dengan kelas bantu untuk memudahkan pengembangan lebih lanjut.

## Struktur Proyek

```
PenghitungUmur/
├── PenghitungUmur.java          # Program utama untuk penghitungan umur
├── PenghitungUmurHelper.java    # Kelas pembantu untuk fungsi perhitungan
└── README.md                    # Dokumentasi proyek ini
```

## Cara Menjalankan Program

1. Pastikan Anda memiliki [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) terinstal di komputer Anda.
2. Unduh atau clone repository ini ke komputer Anda.
3. Buka terminal atau command prompt dan arahkan ke direktori proyek ini.
4. Jalankan perintah berikut untuk meng-compile kode:
   ```bash
   javac PenghitungUmur.java PenghitungUmurHelper.java
   ```
5. Setelah berhasil dikompilasi, jalankan program dengan perintah berikut:
   ```bash
   java PenghitungUmur
   ```

## Cara Menggunakan

- Setelah program dijalankan, pengguna akan diminta memasukkan tanggal lahir dalam format yang sesuai.
- Program akan menghitung umur berdasarkan tanggal yang diberikan dan menampilkan hasilnya.

## Lisensi

Proyek ini dilisensikan di bawah Lisensi MIT - lihat file LICENSE untuk informasi lebih lanjut.
