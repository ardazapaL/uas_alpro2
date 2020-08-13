import java.util.Scanner;

// Lalu Panji Ihza Mahendra
// 17112402

public class alpro2_uas {

    static int total;
    /* bilangan prima */
    static void cetakAngka(int angka, int batas) {

        if (angka <= batas) {
            // batas
            if (angka == batas) {

                System.out.print(angka + " = ");
            } else {
            // cetak
                System.out.print(angka + " + ");
            }            
            total += angka;
            cetakAngka(++angka, batas);
        }
    }
    /* bilangan genap dari 2 */
    static void cetakAngkaGenap(int angka, int batas) {

        if (angka <= batas) {
            //batas
            if (angka == batas) {

                System.out.print(angka + " = ");
            } else {
            //cetak
                System.out.print(angka + " + ");
            }
            total += angka;
            angka = angka + 2;
            cetakAngkaGenap(angka, batas);
        }

    }

    /* faktorial */
    static long faktorial(long angka) {

        if (angka == 0){
            return 1;
        } else if (angka == 1){
            return 1;
        } else{
            return (angka * faktorial(angka-1));
        }
    }

    public static void main(String[] args) {

        //scanner
        Scanner scan = new Scanner(System.in);
        while (true) {

            //pilihan soal
            System.out.println("\nPILIH SOAL : ");
            System.out.println("1. Rekursif Bilangan Prima\n2. Rekursif Bilangan Genap\n3. Kombinasi\n4. Permutasi");
            System.out.print("Pilihan : ");
            int pilihanSoal = scan.nextInt();
            switch(pilihanSoal) {
    
                case 1 : 
                    System.out.println("\n====== REKURSIF BILANGAN PRIMA ======");
                    System.out.print("Nilai awal = "); int nilaiAwalPrima = scan.nextInt();
                    System.out.print("Nilai Batas = "); int nilaiBatasPrima = scan.nextInt();
                    //rekursif prima
                    cetakAngka(nilaiAwalPrima, nilaiBatasPrima);
                    System.out.println(total); //total
                    total = 0;

                    break;
    
                case 2 :
                    System.out.println("\n====== REKURSIF BILANGAN GENAP ======");
                    System.out.print("Nilai awal = "); int nilaiAwalGenap = scan.nextInt();
                    System.out.print("Nilai Batas = "); int nilaiBatasGenap = scan.nextInt();
                    //rekursif genap
                    cetakAngkaGenap(nilaiAwalGenap, nilaiBatasGenap);
                    System.out.println(total); //total
                    total = 0;
                    break;
                
                case 3 :
                    System.out.println("\n====== REKURSIF KOMBINASI ======");
                    System.out.print("Nilai n (Keseluruhan Objek) = "); long nilaiN = scan.nextLong();
                    System.out.print("Nilai r (Objek) = "); long nilaiR = scan.nextLong();
                    //rekursif kombinasi
                    long kombinasi = faktorial(nilaiN)/ (faktorial(nilaiN - nilaiR) * faktorial(nilaiR));
                    System.out.println("           n!");
                    System.out.println("nCr = -------------- = " + kombinasi);
                    System.out.println("      (n-r)! x r!"); 
                    break;
    
                case 4 :
                    System.out.println("\n====== REKURSIF PERMUTASI ======");
                    System.out.print("Nilai n (Keseluruhan Objek) = "); long nilaiN1 = scan.nextLong();
                    System.out.print("Nilai r (Objek) = "); long nilaiR1 = scan.nextLong();
                    //rekursif permutasi
                    long permutasi = faktorial(nilaiN1)/ faktorial(nilaiN1 - nilaiR1);
                    System.out.println("         n!");
                    System.out.println("nPr = --------- = " + permutasi);
                    System.out.println("       (n-r)!");
                    break;

                default :
                    System.out.println("MAAF! Masukkan Opsi Yang Tersedia!");
                    break;
            }
        }
        
    }
}