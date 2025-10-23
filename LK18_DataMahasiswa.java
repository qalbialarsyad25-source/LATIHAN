import java.util.*;

public class LK18_DataMahasiswa{
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        ArrayList<String> NAMA = new ArrayList<>();
        ArrayList<String> NIMM = new ArrayList<>();
        ArrayList<Double> IPKK = new ArrayList<>();
        ArrayList<Double> UTSS = new ArrayList<>();
        ArrayList<Double> UASS = new ArrayList<>();
        ArrayList<Double> NILAI = new ArrayList<>();
        ArrayList<String> GRADE = new ArrayList<>();
        ArrayList<String> STATUS = new ArrayList<>();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int mahasiswa = input.nextInt();

        for(int i = 1; i <= mahasiswa; i++){
            System.out.println("Mahasiswa ke-"+i);
            System.out.print("Nama : ");
            input.nextLine();
            String nama = input.nextLine();
            NAMA.add(nama);
            System.out.print("NIM : ");
            String NIM = input.nextLine();
            NIMM.add(NIM);
            System.out.print("IPK : ");
            double IPK = input.nextDouble();
            IPKK.add(IPK);
            System.out.print("UTS : ");
            double UTS = input.nextDouble();
            UTSS.add(UTS);
            System.out.print("UAS : ");
            double UAS = input.nextDouble();
            UASS.add(UAS);

            double nilaiakhir = (UTS * 0.4) + (UAS * 0.6);
            NILAI.add(nilaiakhir);

            if (nilaiakhir >= 85){
                String grade = "A";
                GRADE.add(grade);
            } else if (nilaiakhir >= 70){
                String grade = "B";
                GRADE.add(grade);
            } else if (nilaiakhir >= 60){
                String grade = "C";
                GRADE.add(grade);
            } else if (nilaiakhir < 60){
                String grade = "D";
                GRADE.add(grade);
            } else{
                String grade = "E";
                GRADE.add(grade);
            }

        }

        for (int i = 0; i < mahasiswa; i++){
        if (GRADE.get(i) != "E" && IPKK.get(i) >= 2.75){
                String status = "Lulus";
                STATUS.add(status);
            } else {
                String status = "Tidak Lulus";
                STATUS.add(status);
            }
        }

        System.out.println("==============================================================================================");
        System.out.printf("%-20s %-15s %-10s %-13s %-10s %-10s %n","Nama","NIM","IPK","NilaiAkhir","Grade","Status");
        System.out.println("==============================================================================================");
        for (int i = 0; i < mahasiswa; i++){
            System.out.printf("%-20s %-15s %-10s %-13s %-10s %-10s %n",NAMA.get(i),NIMM.get(i),IPKK.get(i),NILAI.get(i),GRADE.get(i),STATUS.get(i));
        }

        System.out.print("Ingin mencari mahasiswa berdasarkan nama? (Ya/tidak) : ");
        input.nextLine();
        String cari = input.nextLine();
        if (cari.equalsIgnoreCase("Ya") || cari.equalsIgnoreCase("Yes")){
            System.out.print("Masukkan nama mahasiswa : ");
            String mencari = input.nextLine().trim().toLowerCase();

            boolean ditemukan = false;
            for (int i = 0; i < mahasiswa; i++){
                if (NAMA.get(i).trim().toLowerCase().equals(mencari)){
                    System.out.println("==============================================================================================");
                    System.out.printf("%-20s %-15s %-10s %-13s %-10s %-10s %n","Nama","NIM","IPK","NilaiAkhir","Grade","Status");
                    System.out.println("==============================================================================================");
                    System.out.printf("%-20s %-15s %-10s %-13s %-10s %-10s %n",NAMA.get(i),NIMM.get(i),IPKK.get(i),NILAI.get(i),GRADE.get(i),STATUS.get(i));
                    ditemukan = true;
                    break;
                } 
            }

            if (!ditemukan){
                System.out.println("Data mahasiswa tidak ditemukan pada server");
            }
        }
        input.close();
    }
}