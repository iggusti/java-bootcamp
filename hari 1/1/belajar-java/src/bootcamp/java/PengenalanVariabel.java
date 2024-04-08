package bootcamp.java;

public class PengenalanVariabel {
    public static void main(String[] args) {

        // Deklarasi Variabel String
        String greetings = "Selamat Datang Saudara";
        String namaDepan = "Ilham";
        String namaBelakang = "Gusti";

        // Deklarasi Variabel Integer
        int bilanganPertama = 10;
        int bilanganKedua = 20;

        String allStatement = greetings + " " + namaDepan +  " " + namaBelakang;
        System.out.println(allStatement.toUpperCase());
        System.out.println("Value Bilangan Pertama = " + bilanganPertama);
    }
}