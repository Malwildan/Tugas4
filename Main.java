package com.mb1.Tugas4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- APLIKASI PEMINJAMAN BUKU ---");
        
        System.out.print("Masukkan NIM Mahasiswa  : ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n--- Input Data Buku ---");
            System.out.print("Masukkan No ISBN : ");
            String isbn = scanner.nextLine();

            System.out.print("Masukkan Judul   : ");
            String judul = scanner.nextLine();

            Buku bukuBaru = new Buku(isbn, judul);

            mahasiswa.pinjam(bukuBaru);

            System.out.print("Tambah buku lagi? (y/n): ");
            String jawab = scanner.nextLine();
            if (!jawab.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        mahasiswa.tampilkanData();
        
        scanner.close();
    }
}
