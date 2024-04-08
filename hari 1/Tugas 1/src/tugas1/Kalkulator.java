package tugas1;

import java.util.Scanner;

public class Kalkulator {

    public static void main (String[]args){
        int angkaPertama, angkaKedua, hasil, fitur, tambahIterasi = 0, lagi;
        Scanner masuk = new Scanner(System.in);

        for(int i = 0; i < 1 + tambahIterasi; i++) {
            System.out.println("|--------------------|");
            System.out.println("| Program Kalkulator |");
            System.out.println("| 1. Penjumlahan     |");
            System.out.println("| 2. Pengurangan     |");
            System.out.println("| 3. Perkalian       |");
            System.out.println("| 4. Pembagian       |");
            System.out.println("| 5. Pangkat         |");
            System.out.println("|--------------------|");
            System.out.println("> Pilih fitur :");
            fitur = masuk.nextInt();

            if (fitur == 1) {
                System.out.println("Penjumlahan=");
                System.out.println("~ Masukkan angka pertama =");
                angkaPertama = masuk.nextInt();
                System.out.println("~ Masukkan angka kedua =");
                angkaKedua = masuk.nextInt();
                hasil = angkaPertama + angkaKedua;
                System.out.println("> Hasilnya = " + hasil);
            } else if (fitur == 2) {
                System.out.println("Pengurangan");
                System.out.println("~ Masukkan angka pertama =");
                angkaPertama = masuk.nextInt();
                System.out.println("~ Masukkan angka kedua =");
                angkaKedua = masuk.nextInt();
                hasil = angkaPertama - angkaKedua;
                System.out.println("> Hasilnya = " + hasil);
            } else if (fitur == 3) {
                System.out.println("Perkalian");
                System.out.println("~ Masukkan angka pertama =");
                angkaPertama = masuk.nextInt();
                System.out.println("~ Masukkan angka kedua =");
                angkaKedua = masuk.nextInt();
                hasil = angkaPertama * angkaKedua;
                System.out.println("> Hasilnya = " + hasil);
            } else if (fitur == 4) {
                System.out.println("Pembagian");
                System.out.println("~ Masukkan angka pertama =");
                angkaPertama = masuk.nextInt();
                System.out.println("~ Masukkan angka kedua =");
                angkaKedua = masuk.nextInt();
                hasil = angkaPertama / angkaKedua;
                System.out.println("> Hasilnya = " + hasil);
            } else if (fitur == 5) {
                System.out.println("Pangkat");
                System.out.println("~ Masukkan angka =");
                angkaPertama = masuk.nextInt();
                System.out.println("~ Masukkan pangkat =");
                angkaKedua = masuk.nextInt();
                hasil = (int) Math.pow(angkaPertama, angkaKedua);
                System.out.println("> Hasilnya = " + hasil);
            } else {
                System.out.println("Error");
            }

            System.out.println("~ Ketik 1 untuk ulang Program Kalkulator");
            System.out.println("  atau ketik angka lain untuk mengakhiri");
            lagi = masuk.nextInt();

            if (lagi == 1) {
                tambahIterasi += 1;
            } else {
                System.out.println("Terimakasih telah menggunakan program kami");
            }
        }
    }
}
