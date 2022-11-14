import java.util.Random;
import java.util.Scanner;
    public class jawabannotiga {
        int bus = 4;
        static int totalpenumpang = 250;
        public static String[] TopLevel = new String[90];
        public static String[] MiddleLevel = new String[70];
        public static String[] RegullarStaff = new String[50];
        public static String[] Staff = new String[40];
        public static void infopenumpang() {
            int totaltoplevel = 0;
            int sisakursi = 0;
            for (int index=0;index<TopLevel.length;index++){
                if (TopLevel[index] !=null){
                    totaltoplevel++;
                }
            }
            int totalmiddlelevel = 0;
            for (int index=0;index<MiddleLevel.length;index++){
                if (MiddleLevel[index] !=null){
                    totalmiddlelevel++;
                }
            }
            int totalregullarstaff = 0;
            for (int index=0;index<RegullarStaff.length;index++){
                if (RegullarStaff[index] !=null){
                    totalregullarstaff++;
                }
            }
            int totalstaff = 0;
            for (int index=0;index<Staff.length;index++){
                if (Staff[index] !=null){
                    totalstaff++;
                }
            }
            sisakursi = totalpenumpang - totaltoplevel - totalmiddlelevel - totalregullarstaff - totalstaff;
            System.out.println("Total penupang kelas Top Level : " + totaltoplevel + " | Total penupang kelas Middle Level : " + totalmiddlelevel + " | Total penupang kelas Regullar staff : " + totalregullarstaff + "Total penupang kelas staff");
            System.out.println("Jumlah Semua penumpang : " + totalpenumpang + "| total kursi : " + sisakursi);
            System.out.println();
        }
        public static  void chekindexarray(String[] myarray,String penumpang){
            int indexnow = 0;
            for (int index=0; index<myarray.length;index++){
                if (myarray[index] !=null){
                    indexnow = index+1;
                }
            }
            if (indexnow<myarray.length){
                myarray[indexnow] = penumpang;
            }
        }
        public static void datapenumpang(int C012222222222, String penumpang){
            switch (C012222222222){
                case 1:
                    chekindexarray(TopLevel,penumpang);
                    System.out.println("Anda masuk ke bus kelas Top Level");
                    infopenumpang();
                    break;
                case 2:
                    chekindexarray(MiddleLevel,penumpang);
                    System.out.println("Anda masuk ke bus kelas Middle Level");
                    infopenumpang();
                    break;
                case 3:
                    chekindexarray(RegullarStaff,penumpang);
                    System.out.println("Anda masuk ke bus kelas Regullar Staff");
                    infopenumpang();
                    break;
                case 4:
                    chekindexarray(Staff,penumpang);
                    System.out.println("Anda masuk ke bus kelas Staff");
                    infopenumpang();
                    break;
            }
        }
        public static void inputpenumpang(){
            Scanner inputdata = new Scanner(System.in);
            while (true){
                System.out.print("Nama Penumpang = ");
                String namapenumpang = inputdata.nextLine();
                if (namapenumpang.isBlank()){
                    System.out.println("Nama Penumpang wajib diisi");
                    inputpenumpang();
                }else{
                    Random hasilrandom = new Random();
                    int jenisrandom = hasilrandom.nextInt(3)+1;
                    datapenumpang(jenisrandom,namapenumpang);
                }
            }
        }
        public static void main (String[] args) {
            inputpenumpang();
            //
        }
    }
