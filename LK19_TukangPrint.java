import java.util.*;
public class LK19_TukangPrint{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        int elemenArray;
        
        System.out.print("Pilih jenis array 1D atau 2D : ");
        int pilihan = input.nextInt();

        switch(pilihan){
            case 1:
                System.out.print("Masukkan panjang array: ");
                int n = input.nextInt();
                int [] arr = new int [n];

                System.out.println("Masukkan elemen array: ");
                for (int i = 0; i < arr.length; i++){
                    elemenArray = input.nextInt();
                    arr[i] = elemenArray;
                }

                System.out.println("Array Awal:");
                for (int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
                System.out.println("Array terbalik:");
                for (int i = n-1; n >= 0; i--){
                    System.out.print(arr[i] + " ");
                }
                break;
            case 2:
                System.out.println("Masukkan jumlah baris: ");
                int baris = input.nextInt();
                System.out.println("Masukkan jumlah kolom: ");
                int kolom = input.nextInt();

                int [][] matriks = new int [baris][kolom];
                System.out.println("Masukkan elemen array: ");
                for (int i = 0; i < baris; i++){
                    for (int j = 0; j < kolom; j++){
                        matriks [i][j] = input.nextInt();
                    }
                }

                System.out.println("Array awal:");
                for (int i = 0; i < baris; i++){
                    for (int j = 0; j < kolom; j++){
                        System.out.print(matriks[i][j] + " ");
                    }
                    System.out.println();
                }
                
                System.out.println();
                System.out.println("Array Terbalik:");
                for (int i = baris-1; i >= 0; i--){
                    for (int j = kolom-1; j >= 0; j--){
                        System.out.print(matriks[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}