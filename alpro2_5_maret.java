import java.util.Scanner;

public class alpro2_5_maret {


    static Scanner masukan = new Scanner(System.in);


    public static void main(final String[] args) {
        
        System.out.print("\nPanjang array : ");

        int panjang_array = masukan.nextInt();

        int nilai[] = new int[panjang_array];

        // loop (for) biasa 
        /*
        for (int i = 0; i <= nilai.length; i++) {

            System.out.println(nilai[i]);


        }*/

        for (int i = 0; i < nilai.length; i++) {

            System.out.print("Nilai array index ke - " + i + " : ");
            nilai[i] = masukan.nextInt();

        }
        
        //counter

        int counter = 0;

        // loop (for) enhance
        for (int item:nilai) {

            // System.out.print(item + " ");

            // if (item != nilai[panjang_array-1]) {

            //     System.out.print(item + ", ");
            // } else {

            //     System.out.println(item);
            // }

            if (counter < panjang_array-1) {

                System.out.print(item + " - ");
            } else {
                
                System.out.println(item);
            }

            counter++;
        }
    }
}