import java.util.*;
public class LK21_PerkalianMtariks {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int total;

        System.out.print("Masukkan jumlah baris matriks A : ");
        int barisA = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A : ");
        int kolomA = input.nextInt();
        int [][] A = new int[barisA][kolomA];
        System.out.print("Masukkan jumlah baris matriks B : ");
        int barisB = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B : ");
        int kolomB = input.nextInt();
        int [][] B = new int[barisB][kolomB];

         int [][] hasil = new int[barisA][kolomB];

        if (kolomA == barisB){
            System.out.println();
            System.out.println("Masukkan elemen matriks A : ");
            for (int i = 0; i < barisA; i++){
                for (int j = 0; j < kolomA; j++){
                    A[i][j] = input.nextInt();
                }
            }

            System.out.println("Masukkan elemen matriks B : ");
            for (int i = 0; i < barisB; i++){
                for (int j = 0; j < kolomB; j++){
                    B[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < barisA; i++){
                for (int j = 0; j < kolomB; j++){
                    total = 0;
                    for (int k = 0; k < kolomA; k++){
                        total += A[i][k] * B[k][j];
                    }
                    hasil[i][j] = total;
                }
            }

            System.out.println();
            System.out.println("Maka perkalain matriks A x B adalah :");
            for (int i = 0; i < barisA; i++){
                for (int j = 0; j < kolomB; j++){
                    System.out.print(hasil[i][j]+" ");
                }
                System.out.println();
            }

        } else if (barisA <= 0 || kolomA <= 0 || barisB <= 0 || kolomB <= 0){
            System.out.println("ukuran baris dan kolom harus lebih dari 0!");
        } else {
            System.out.println("Perkalian tidak dapat dilakukan");
            System.out.println("Jumlah kolom A harus sama dengan jumlah baris B");
        }

        input.close();
    }
}
