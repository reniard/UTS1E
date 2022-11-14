import java.util.Scanner;
//
public class utsnomer3 {
        static int jumlahTopLevel = 0;
        static int jumlahMIddleLevel = 0;
        static int jumlahRegularStaff = 0;
        static int jumlahStaff = 0;
        static boolean success = false;
    private static utsnomer3 cek;

    public static void main(String[] args) {
            String[] infobus = {"01-top level", "02-middle level", "03-reguller staff","04-staff"};
            for (int i = 0;i<200;i++) {
                nik();
                System.out.println("=============================");
                System.out.println("SELAMAT DATANG DI BUS KFC");
                System.out.println("=============================");

            }
        }
    static void cekNIKKaryawan(String nik) {
        //pengecekan pertama dicek apakah nik yang dimasukkan sesuai dengan 10 Digit NIK Karyawan
        if (nik.length() <= 10) {
            //jika NIK kurang dari sama dengan 10 Digit artinya benar, dan akan dilakukan pengecekan selanjutnya seperti dibawah ini
            //akan dicek apakah nik mengandung huruf c01, jika iya jumlah penumpang di Bus TopLevel akan bertambah 1
            //jika tidak akan pergi ke pengkondisian kedua
            if (nik.contains("C01")) {
                success = true;
                jumlahTopLevel++;
            } else if (nik.contains("J02")) { //ini pengkondisian kedua akan dicek apakah NIK mengandung huruf J02, jika iya jumlah akan bertambah
                success = true; //jika tidak akan pergi ke pengkondisian ketiga
                jumlahMIddleLevel++;
            } else if (nik.contains("N03")) { //ini pengkondisian ketiga akan dicek apakah nik mengandung huruf N03, jika iya jumlah akan bertambah
                success = true; //jika tidak akan pergi ke pengkondisian terakhir
                jumlahRegularStaff++;
            } else if (nik.contains("P04")) { //ini pengkondisian terakhir
                jumlahStaff++;
            } else {
                //ini yang akan dijalankan ketika semua kondisi diatas salah
                success = false;
                System.out.println("Gagal, NIK registrasi Anda tidak sesuair! Silahkan coba lagi");
            }
        } else {
            //ini yang akan dijalankan ketika nik lebih dari 10 digit
            success = false;
        }
    }

    static void nik() {
        Scanner inputRegistrasi = new Scanner(System.in);
        System.out.println("Masukkan NIK untuk registrasi: ");
        String nik = inputRegistrasi.nextLine();
        cekNIKKaryawan(nik);
        if (success) {
            printResult();
        }
    }

    static void printResult() {
        System.out.println("Jumlah karyawan di Bus 01-TopLevel = " + jumlahTopLevel);
        System.out.println("Jumlah karyawan di Bus 02-MiddleLevel = " + jumlahMIddleLevel);
        System.out.println("Jumlah karyawan di Bus 03-RegularStaff = " + jumlahRegularStaff);
        System.out.println("Jumlah karyawan di Bus 04-Staff = " + jumlahStaff);
        System.out.println();
    }

    public static void main(String[] args) {
        while (true) {
            cek.nik();
        }
    }
}