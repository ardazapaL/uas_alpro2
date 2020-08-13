import java.util.Scanner;

class alpro2_12_maret {

    static int input;
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        /* COMMIT KEDUA */
        
        System.out.print("Masukkan Baris : ");
        input = scan.nextInt();

        System.out.println();
        
        // soal pertama

        for (int i = 0; i <= input; i++) {

            for (int j = 0; j < i; j++) {

                /* 
                AA
                BBB
                AAAA
                BBBBB
                */
                
                if (i % 2 == 0) {

                    System.out.print("B");
                } else {

                    System.out.print("A");
                }

                // System.out.print("*");
            }
            System.out.println();
        } 

        // soal kedua

        for (int i = 0; i <= input; i++) {

            for (int j = 0; j < i; j++) {

                /*
                B 
                AB
                BAB
                ABAB
                */
                
                if (i % 2 == 0 && j % 2 == 0) {

                    System.out.print("A");
                } else if (i % 2 == 0 && j % 2 != 0) {

                    System.out.print("B");
                } else if (i % 2 != 0 && j % 2 == 0) {

                    System.out.print("B");
                } else if (i % 2 != 0 && j % 2 != 0) {

                    System.out.print("A");
                }

                // System.out.print("*");
            }
            System.out.println();
        }

        /* 
            *
           **
          ***
         ****
        */
        for (int i = 0; i <= input; i++) {

            for (int j = input; j >= i+1; j--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            System.out.println();
        }

        /* 
            *
           ***
          *****
        */

        for (int i = 0; i <= input-1; i++) {

            for (int j = input-1; j >= i + 1; j--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            for (int l = 0; l <= i; l++) {

                System.out.print("*");
            }
            System.out.println();
        }

        //int arr[][] = { {3,2}, {1,3}, {2,3}};

        // System.out.println(arr.length);
        // System.out.println(arr[].length);
        
        /* for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
        } */

        System.out.println();

        // panjang array
        System.out.print("Masukkan panjang array : ");
        int panjang_array = scan.nextInt();
        
        // baris array
        System.out.print("Masukkan banyak elemen dimensi kedua : ");
        int baris_array = scan.nextInt();

        int dua_arr[][] = new int[panjang_array][baris_array];

        int duas_arr[][] = new int[panjang_array][baris_array];


        System.out.println("\n====== MATRIK PERTAMA ======");

        for (int i = 0; i < dua_arr.length; i++) {
        
            for (int j = 0; j < dua_arr[i].length; j++) {

                
                do {
                    
                    System.out.print("Nilai array [" + i + "][" + j + "] : ");
                    // System.out.println("Please enter a number");
                    while (!scan.hasNextInt()) {

                        System.out.print("That's not a number!\nMasukkan nilai kembali : ");
                        scan.next();
                    }

                    dua_arr[i][j] = scan.nextInt();
                } while (dua_arr[i][j] < 0);
                
            }
        }

        System.out.println();

       /*  for (int i = 0; i < dua_arr.length; i++) {

            for (int j = 0; j < dua_arr[i].length; j++) {

                System.out.print(dua_arr[i][j] + " ");
            }
        } */

        for (int[] inner : dua_arr) {

            for (int data : inner) {

                System.out.print(data + " ");

                if (dua_arr[0][1] == data) {

                    System.out.println();
                }
            }
        }

        System.out.println("\n\n====== MATRIK KEDUA ======");

        for (int i = 0; i < duas_arr.length; i++) {
        
            for (int j = 0; j < duas_arr[i].length; j++) {

                
                do {
                    
                    System.out.print("Nilai array 2 [" + i + "][" + j + "] : ");
                    // System.out.println("Please enter a number");
                    while (!scan.hasNextInt()) {

                        System.out.print("That's not a number!\nMasukkan nilai kembali : ");
                        scan.next();
                    }

                    duas_arr[i][j] = scan.nextInt();
                } while (duas_arr[i][j] < 0);
                
            }
        }

        System.out.println();

       /*  for (int i = 0; i < dua_arr.length; i++) {

            for (int j = 0; j < dua_arr[i].length; j++) {

                System.out.print(dua_arr[i][j] + " ");
            }
        } */

        for (int[] inner : duas_arr) {

            for (int data : inner) {

                System.out.print(data + " ");

                if (duas_arr[0][1] == data) {

                    System.out.println();
                }
            }
        }

        System.out.println("\n\n====== PENJUMLAHAN MATRIK ======");
        
        int result_add[][] = new int [2][2];
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 2; j++) {
                
                result_add[i][j] = dua_arr[i][j] + duas_arr [i][j];
            }
        }
        
        
        int counter = 0;


        for (int[] hasil : result_add) {

            for (int data : hasil) {

                if (counter == 2) {

                    System.out.println();
                }

                System.out.print(data + " ");
                counter++;
            }
            
        }
        



    }
}