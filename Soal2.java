import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        double totalNilai = 0; 

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            
            totalNilai += nilai; 

            System.out.print("Input nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang != 't' && ulang != 'T');

        System.out.println("===================");
        System.out.println("Total semua nilai: " + totalNilai);
        input.close();
    }
}