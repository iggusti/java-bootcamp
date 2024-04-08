package bootcamp.java;

public class PengenalanForLoop {
    public static void main(String[] args) {

        for (int iterator = 1; iterator <= 10; iterator++){
            if(iterator == 5) {
                continue;
            }
            System.out.println("Saya Dari Telkom " + iterator);
        }
    }
}
