package bootcamp.java;

public class PengenalanArray {
    public static void main(String[] args) {

        String[] kendaraan = {"Ford", "BMW", "Lambo", "Peugot", "Ferrari"};

        for (int iterator = 0; iterator < kendaraan.length; iterator++) {
            System.out.println(kendaraan[iterator]);
        }

        int iterator = 0;
        while (iterator < kendaraan.length) {
            System.out.println(kendaraan[iterator]);
            iterator++;
        }

        // Ekstrak Value With For-Each
        for (String valueArray: kendaraan) {
            System.out.println(valueArray);
        }
    }
}
