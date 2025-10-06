import java.util.*;
public class LK16_Password {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Username : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Password : ");
        String sandi = input.nextLine();

        if (nama.equals("qalbi") && sandi.equals("al")){
            for (int i = 0; i <= 100; i++){
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }
        } else if (!nama.equals("qalbi") && !sandi.equals("al")){
            for (int i = 0; i + 1 <= 100; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else if (nama.equals("qalbi") || !sandi.equals("al")){
            System.out.println("Password salah");
        } else if (!nama.equals("qalbi") || sandi.equals("al")){
            System.out.println("Username salah");
        }

        input.close();
    }
}
