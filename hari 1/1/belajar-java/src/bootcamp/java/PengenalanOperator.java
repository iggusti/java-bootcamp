package bootcamp.java;

public class PengenalanOperator {

    public static void main(String[] args) {
        // Contoh Operator Aritmatika
        float bilanganPertama = 10;
        float bilanganKedua = 15;

        // Penjumlahan
        float hasilPenjumlahan = bilanganPertama + bilanganKedua;
        System.out.println("Hasil Penjumlahan " + bilanganPertama + " + " + bilanganKedua + " = " + hasilPenjumlahan);

        // Pengurangan
        float hasilPengurangan = bilanganKedua - bilanganPertama;
        System.out.println("Hasil Pengurangan " + bilanganKedua + " - " + bilanganPertama + " = " + hasilPengurangan);

        // Perkalian
        float hasilPerkalian = bilanganPertama * bilanganKedua;
        System.out.println("Hasil Perkalian " + bilanganPertama + " * " + bilanganKedua + " = " + hasilPerkalian);

        // Pembagian
        float hasilPembagian = bilanganKedua / bilanganPertama;
        System.out.println("Hasil Pembagian " + bilanganKedua + " / " + bilanganPertama + " = " + hasilPembagian);

    }
}

