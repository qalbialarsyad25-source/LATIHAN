import java.util.*;
public class LK20_KontakPengguna {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        String again;

        do{
            String [] nama = new String [5];
            String [][] data = new String [5][5];

            System.out.print("Masukkan jumlah kontak: ");
            int kontak = input.nextInt();
            input.nextLine();

            for (int i = 0; i < kontak; i++){
                System.out.println("Kontak ke-"+(i+1));
                System.out.print("Nama       : ");
                nama[i] = input.nextLine();
                System.out.print("Nomor Hp   : ");
                data[i][0] = input.nextLine();
                System.out.print("Email      : ");
                data [i][1] = input.nextLine();
            }

            System.out.println("===================================================");
            System.out.printf("%-15s %-20s %-10s %n","Nama","Nomor HP","Email");
            System.out.println("===================================================");
            for (int i = 0; i < kontak; i++){
                System.out.printf("%-15s %-20s %-10s %n",nama[i].trim(),data[i][0].trim(),data[i][1].trim());
            }

        System.out.println();
        System.out.print("Apakah anda ingin melakukan pendataan lagi?");
        again = input.nextLine();
        } while(again.equalsIgnoreCase("Yes")||again.equalsIgnoreCase("ya"));
            System.out.println("Terima kasih telah menggunakan program");
            input.close();
    }
}
