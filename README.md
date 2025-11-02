# Sistem Pemesanan Tiket Konser

Simulasi Sistem Pemesanan Tiket Konser Berbasis Java dengan Konsep OOP

## Anggota Kelompok


| No | Nama Lengkap            | NIM        | 
|----|-------------------------|------------|
| 1  | Rifqi Reis Ramadhan     | G1A025003  | 
| 2  | Fayola Deeba Fathinah   | G1A025028  |
| 3  | Sri Wahyuni             | G1A025047  | 


---

## Dashboard / Tampilan Program

Program ini berbasis console, menampilkan denah tempat duduk, status kursi (O = tersedia, X = sudah dipesan), dan opsi pemesanan tiket. Program dapat dikembangkan ke GUI menggunakan Java Swing atau JavaFX.

---

## Daftar Isi

* Overview Sistem
* Konsep dan Implementasi OOP
* Struktur Program & Kelas
* Instalasi dan Setup
* Penggunaan Program

---

## Overview Sistem

Cerita Sistem:
Program ini dibuat sebagai simulasi manajemen pemesanan tiket konser. Sistem ini memungkinkan pengguna untuk melihat denah tempat duduk, memilih kursi, dan menghitung total harga tiket berdasarkan zona tempat duduk (VIP, Regular, Tribune). Setiap kursi memiliki status `tersedia` atau `dipesan`.

Sistem menekankan **konsep OOP** dengan penerapan enkapsulasi, array dua dimensi, objek Kursi, serta interaksi antarobjek DenahTempatDuduk dan Tiket. Implementasi ini membantu mahasiswa memahami logika pemrograman berorientasi objek, array, loop, dan manajemen state objek.

---

## Konsep dan Implementasi OOP

### 1. Enkapsulasi dan Konstruktor

* Atribut `private` digunakan untuk menyembunyikan data internal objek, misalnya kode kursi, zona, harga, dan status pemesanan.
* Konstruktor digunakan untuk menginisialisasi objek Kursi dengan nilai awal yang aman.
* Atribut `public` tidak wajib menggunakan konstruktor, karena akses langsung diperbolehkan, namun ini tidak sesuai prinsip enkapsulasi.

### 2. Hubungan Antar-Objek

* **DenahTempatDuduk** berisi array dua dimensi `Kursi[][] layout` untuk merepresentasikan baris dan kolom kursi.
* **Kursi** merepresentasikan unit tempat duduk dengan atribut kode, zona, harga, dan status pemesanan.
* **MainKonser** sebagai driver program, bertugas menginisialisasi objek, menampilkan denah, dan menangani pemesanan.

### 3. Logika Array & Looping

* Array 2D: Baris (`horizontal`) dan kolom (`vertikal`) diakses menggunakan nested loop.
* Setiap iterasi baris dan kolom mengisi objek Kursi ke layout.
* Status kursi berubah dari tersedia (`O`) menjadi dipesan (`X`) ketika pemesanan berhasil.

### 4. Konsep Return Value

* Method `pesanKursi()` mengembalikan boolean atau objek Tiket sebagai nilai akhir.
* Nilai yang dikembalikan berfungsi seperti `f(x)` pada fungsi matematika, sedangkan perhitungan sementara di dalam method seperti variabel `angkaBeda` hanya digunakan sebagai langkah internal.

---

## Struktur Program & Kelas

```
TiketKonser/
│
├── README.md                  # Dokumentasi program
├── src/
│   ├── MainKonser.java        # Driver program utama
│   ├── DenahTempatDuduk.java  # Kelas denah tempat duduk (layout kursi)
│   ├── Kursi.java             # Kelas kursi (atribut & method)
│   └── Tiket.java             # Kelas Tiket (opsional, menyimpan data pemesanan)
└── assets/
    └── diagram_alur.png       # Flowchart alur pemesanan
```

---

## Instalasi dan Setup

### 1. Persiapan Project

* Pastikan Java JDK terinstal (minimal versi 17)
* Clone atau download project:

```bash
git clone [repository-url]
cd TiketKonser
```

### 2. Compile & Run

```bash
# Compile semua file Java
javac src/*.java -d bin

# Jalankan program
java -cp bin MainKonser
```

---

## Penggunaan Program

1. Program menampilkan denah kursi (O = tersedia, X = dipesan)
2. Pengguna memilih kursi berdasarkan kode atau koordinat
3. Program mengecek ketersediaan kursi:

   * Jika tersedia → pesanan berhasil
   * Jika sudah dipesan → tampilkan pesan error
4. Total harga dihitung otomatis berdasarkan zona:

   * VIP = 500.000
   * Regular = 300.000
   * Tribune = 150.000
5. Program menampilkan tiket beserta ringkasan pemesanan

---

## Pengembangan Sistem Lanjutan

1. **GUI/Visualisasi**: Implementasi Java Swing / JavaFX untuk tampilan interaktif
2. **Multi-user & Database**: Simpan status kursi di MySQL atau SQLite agar pemesanan bersifat persisten
3. **Integrasi Tiket Digital**: Generate QR code untuk tiap pemesanan
4. **Online Booking Simulation**: Integrasi server-client untuk simulasi pemesanan real-time

---
