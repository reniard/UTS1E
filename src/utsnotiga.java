import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class utsnotiga {
    int jumlahvaksin = 3; //pfizer, sinopharm, moderna
    static int totalpenerimavaksin = 180;
    public static String[] pfizer = new String[50];
    public static String[] sinopharm = new String[60];
    public static String[] moderna = new String[70];

    public static void infopasienvaksin() {
        int totalpfizer = 0;
        int totalsisakuota = 0;
        for (int index=0;index<pfizer.length;index++){
            if (pfizer[index] !=null){
                totalpfizer++;
            }
        }
        int totalsinopharm = 0;
        for (int index=0;index<sinopharm.length;index++){
            if (sinopharm[index] !=null){
                totalsinopharm++;
            }
        }
        int totalmoderna = 0;
        for (int index=0;index<moderna.length;index++){
            if (moderna[index] !=null){
                totalmoderna++;
            }
        }
        totalsisakuota = totalpenerimavaksin - totalpfizer - totalsinopharm - totalmoderna;
        System.out.println("Total pasien pfizer : " + totalpfizer + " | Total pasien sinopharm : " + totalsinopharm + " | Total pasien moderna : " + totalmoderna);
        System.out.println("Jumlah seluruh vaksin : " + totalpenerimavaksin + "| total sisa kuota : " + totalsisakuota);
        System.out.println();
    }
    public static  void chekindexarray(String[] myarray,String pasien){
        int indexnow = 0;
        for (int index=0; index<myarray.length;index++){
            if (myarray[index] !=null){
                indexnow = index+1;
            }
        }
        if (indexnow<myarray.length){
            myarray[indexnow] = pasien;
        }
    }
    public static void simpanpasien(int angkaRandom, String pasien){
        switch (angkaRandom){
            case 1:
                chekindexarray(pfizer,pasien);
                System.out.println("anda mendapat vaksin pfzier");
                infopasienvaksin();
                break;
            case 2:
                chekindexarray(sinopharm,pasien);
                System.out.println("anda mendapat vaksin sinopharm");
                infopasienvaksin();
                break;
            case 3:
                chekindexarray(moderna,pasien);
                System.out.println("anda mendapat vaksin moderna");
                infopasienvaksin();
                break;
        }
    }
    public static void inputpasien(){
        Scanner inputdata = new Scanner(System.in);
        while (true){
            System.out.print("nama pasien = ");
            String namapasien = inputdata.nextLine();
            if (namapasien.isBlank()){
                System.out.println("nama pasien wajib diisi");
                inputpasien();
            }else{
                Random hasilrandom = new Random();
                int jenisrandom = hasilrandom.nextInt(3)+1;
                simpanpasien(jenisrandom,namapasien);
            }
        }
    }
    public static void main (String[] args) {
        inputpasien();
        //
    }
}
