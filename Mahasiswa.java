package com.mb1.Tugas4;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim;
    private String nama;
    private List<Buku> daftarBuku;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void pinjam(Buku buku) {
        this.daftarBuku.add(buku);
    }

    public void tampilkanData() {
        System.out.println("\n======================================================");
        System.out.println("Nim  : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-25s | %-50s |\n", "No", "Isbn", "Judul");
        System.out.println("----------------------------------------------------------------------------------------");

        if (daftarBuku.isEmpty()) {
            System.out.printf("| %-2s | %-25s | %-50s |\n", "-", "Tidak ada buku", "-");
        } else {
            for (int i = 0; i < daftarBuku.size(); i++) {
                Buku b = daftarBuku.get(i);
                System.out.printf("| %-2d | %-25s | %-50s |\n", (i + 1), b.getIsbn(), b.getJudul());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
