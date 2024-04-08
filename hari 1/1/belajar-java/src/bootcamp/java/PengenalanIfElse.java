package bootcamp.java;

public class PengenalanIfElse {
    public static void main(String[] args) {
        boolean buttonSatu = false;
        boolean buttonDua = false;
        int hasilPenjumlahan = 2 + 5;

        // If Saja
        if (buttonSatu == true) {
            System.out.println("Lampu Satu Menyala");
        }

        // If - Else
        if (hasilPenjumlahan == 9) {
            System.out.println("Lampu Satu Menyala");
        } else {
            System.out.println("Kondisi Tidak Terpenuhi");
        }

        // If - ElseIf - Else
        if (hasilPenjumlahan == 7) {
            System.out.println("Hasil Penjumlahan = 7");
        } else if (hasilPenjumlahan == 8) {
            System.out.println("Hasil Penjumlahan = 8");
        } else {
            System.out.println("Ternyata Hasil Penjumlahan = " + hasilPenjumlahan);
        }

        // Nested If
        if (hasilPenjumlahan == 7) {
            if (buttonSatu == true) {
                System.out.println("Lampu Satu Menyala");
            }
        } else {
            System.out.println("Lampu Padam");
        }

        //

        if ((hasilPenjumlahan == 7) && (buttonSatu == true)) {
            System.out.println("Lampu Satu Menyala");
        } else {
        System.out.println("Lampu Padam");
        }
    }
}
