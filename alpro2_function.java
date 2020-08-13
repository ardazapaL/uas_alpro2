import java.util.Scanner;

// Lalu Panji Ihza Mahendra
// 17112402

class alpro2_function {

    static double x = 19, y = 8;
    static public void avg() {

        double hasil;
        hasil = x / y;

        System.out.printf("%.2f\n", hasil);
    }

    static public double avg(double total, double jumlah) {

        double rata = total / jumlah;

        return rata;
    }

    public static void main(String[] args) {
        
        //scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Rata-rata tanpa parameter = ");
        avg();
        // override fungsi
        System.out.print("Total Nilai = ");
        double total = scan.nextInt();

        System.out.print("Banyak Nilai = ");
        double banyak = scan.nextInt();

        double res = avg(total, banyak);

        System.out.printf("Rata-rata dengan paramater adalah %.2f" ,res);
    }
}