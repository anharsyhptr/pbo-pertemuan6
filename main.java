import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<programnew> s = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Integer pilih = 0;

        System.out.println("=============================");
        System.out.println("SELAMAT DATANG DI TOKO ANHAR ");
        System.out.println("=============================");
        System.out.println("1.Peminjaman Buku");
        System.out.println("2.Pembelian Buku");
        System.out.println("3.Keluar");
        System.out.println("==============================");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();

        if (pilih == 1) {
            s = sewa(s);
        } else if (pilih == 2) {
            s = beli(s);
        }
        while (pilih != 3)
            ;
    }

    private static ArrayList<programnew> sewa(ArrayList<programnew> s) {
        Scanner sc = new Scanner(System.in);
        String nama, almt, tlp;
        Integer n, p;

        System.out.println("=========================================");
        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("Alamat : ");
        almt = sc.nextLine();

        System.out.print("No Telpon : ");
        tlp = sc.nextLine();

        System.out.println("Buku yang tersedia di toko saat ini : ");
        System.out.println("1. Laskar Pelangi");
        System.out.println("2. Cinta Brontosaurus");
        System.out.println("3. Dear Nathan");

        System.out.print("Nama buku: ");
        p = sc.nextInt();

        System.out.println("waktu yang tersedia sewa : 7,30 hari");
        System.out.print("Lama penyewaan : ");
        n = sc.nextInt();

        System.out.println("=========================================");
        System.out.println("=            Hasil Pemesanan            =");
        System.out.println("=========================================");

        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + almt);
        System.out.println("No Telfon : " + tlp);
        System.out.print("Buku yang disewa : ");
        if (p == 1) {
            System.out.println("1. Laskar Pelangi");
        } else if (p == 2) {
            System.out.println("2. Cinta Brontosaurus");
        } else if (p == 3) {
            System.out.println("3. Dear Nathan");
        }
        System.out.println("Lama yang akan disewa : " + n + " Hari.");

        System.out.println("========================================================");
        System.out.println("=              Terimakasih sudah memesan.              =");
        System.out.println("------------Silahkan pembayaran melalui kasir-----------");
        System.out.println("========================================================");
        return s;
    }

    private static ArrayList<programnew> beli(ArrayList<programnew> s) {
        Scanner sc = new Scanner(System.in);
        String nama, almt, tlp;
        Integer p;

        System.out.println("=========================================");
        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("Alamat : ");
        almt = sc.nextLine();

        System.out.print("No Telfon : ");
        tlp = sc.nextLine();

        System.out.println("Buku yang tersedia di toko saat ini : ");
        System.out.println("1. Laskar Pelangi");
        System.out.println("2. Cinta Brontosaurus");
        System.out.println("3. Dear Nathan");

        System.out.print("Jenis buku yang akan di Beli : ");
        p = sc.nextInt();

        System.out.println("=========================================");
        System.out.println("=            Hasil Pemesanan            =");
        System.out.println("=========================================");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + almt);
        System.out.println("No Telfon : " + tlp);
        System.out.print("Buku yang dibeli : ");
        if (p == 1) {
            System.out.println("1. Laskar Pelangi");
        } else if (p == 2) {
            System.out.println("2. Cinta Brontosaurus");
        } else if (p == 3) {
            System.out.println("3. Dear Nathan");
        }
        System.out.println("========================================================");
        System.out.println("=              Terimakasih sudah memesan.              =");
        System.out.println("= Silahkan anda ke kasir untuk melanjutkan pembayaran. =");
        System.out.println("========================================================");
        return s;
    }
}