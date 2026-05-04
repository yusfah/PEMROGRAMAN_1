import java.util.Scanner;
public class cekkelulusan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int total_pertemuan = 21;
        System.out.print("masukkan jumblah kehadiran :");
        int hadir = input.nextInt();

        double presentase = (hadir/(double)total_pertemuan) * 100;

        if (presentase > 75) {
            System.out.println("status: LULUS");
            System.out.print("presentase: %.2f%%\n" , presentase);

        if (hadir % 2 == 0) {
            System.out.println("keterangan : genap");
        } else {
            System.out.println("keterangan : ganjil");
        } 

        } else {
            System.out.println("Status : tidak lulus");
            System.out.printf("presentase: 2f%%\\n", presentase);
            System.out.println("minimal kehadiran untuk lulus adalah> 75% (minimal 16 pertemuan).");
        }
    
    }
}