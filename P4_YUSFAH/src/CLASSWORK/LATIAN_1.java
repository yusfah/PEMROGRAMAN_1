package CLASSWORK;
import java.util.Scanner;

    public class LATIAN_1{ 
        public static void main(String[] args){
            float presesnsi, Tugas, nTugas, UTS, nUTS, UAS, nUAS, realisasi, kehadiran;
            float total;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukin realisasi mata kuliahannya: ");
        realisasi = input.nextFloat();

        System.out.print("Masukin kehadiran kamu: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukin Nilai tugas kamu: ");
        nTugas = input.nextFloat();

        System.out.print("Masukin Nilai UTS kamu: ");
        nUTS = input.nextFloat();

        System.out.print("Masukin Nilai UAS kamu: ");
        nUAS = input.nextFloat();

        
        presesnsi = (kehadiran / realisasi) * 10;
        Tugas = nTugas * 0.20f;
        UTS = nUTS * 0.30f;
        UAS = nUAS * 0.40f;
        total = presesnsi + Tugas + UTS + UAS;

        System.out.println("================================");
        System.out.println("KEHADIRAN | TUGAS | UTS | UAS");
        System.out.println("==============================");
        System.out.println("   " + kehadiran + "   | " + Tugas + "  | " + UTS + " |  " + UAS);
        System.out.println("             TOTAL            ");
        System.out.println("            " + total + "        ");



        }
    }