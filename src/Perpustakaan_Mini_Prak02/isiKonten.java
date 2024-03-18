package Perpustakaan_Mini_Prak02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class isiKonten {
    static short pilih;
    static Scanner in = new Scanner(System.in);

    private String Kategori = "-";
    private String judul = "-";
    private String penulis = "-";
    private String sinopsis = "-";
    private int jumlahKata;
    private double hargaBuku = 0;

    private int royalti10;
    private int royaltiBebas;
    static short royaltiIngin;
    static short indikator;
    static boolean cek;

    public isiKonten(double harga, String judul, String penulis, String kategori, String sinopsis) {
        this.hargaBuku = harga;
        this.judul = judul;
        this.penulis = penulis;
        this.Kategori = kategori;
        this.sinopsis = sinopsis;
    }

    public void menu() {
        System.out.println("Kategori");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama"
                + "\n5. Psikologi\n6. Politik\n7. Fiksi\n8. Tampilkan Buku"
                + "  dari file txt\n9. Simpan Data Buku pada argumen objek ke file txt");

        System.out.print("Masukan pilihan anda : ");
        pilih = in.nextShort();
        if (pilih != 9) {
            System.out.print("Royalti yang diinginkan : ");
            royaltiIngin = in.nextShort();

            System.out.println("=============================");
            System.out.println("");
        }
        if (pilih == 9) {
            menuSimpanFile();
        }
    }

    // Constructor
    public isiKonten() {
        this.Kategori = "-";
        this.judul = "-";
        this.penulis = "-";
        this.sinopsis = "-";
        this.hargaBuku = 0;
    }

    public isiKonten(double e, String a, String b, String c) {
        this.judul = a;
        this.penulis = b;
        this.sinopsis = c;
        this.hargaBuku = e;

        if (pilih != 8 && pilih != 9 && cek == false) {
            display(pilih);
        }

    }

    public void display(short a) {
        Kategori = kategori(a);
        hitungRoyalti(hargaBuku);
        setSinopsis(sinopsis);
        System.out.print("Kategori    : " + getKategori());
        System.out.println("");
        System.out.println("Nama buku   : " + getJudul());
        System.out.println("Penulis     : " + getPenulis());
        System.out.println("Sinopsis    : " + getSinopsis());
        System.out.printf("Harga Buku  : Rp.%.0f\n", getHargaBuku());
        System.out.println("Jumlah kata : " + getJumlahKata());
        System.out.println("Royalti 10% adalah : Rp."+getRoyalti10());
        System.out.println("Royalti " + getRoyaltiIngin() + "% adalah : Rp." + getRoyaltiBebas());
        System.out.println("");
    }

    private int setSinopsis(String a) {
        short b = 0;
        if (a.length() != 0) {
            String[] e = a.split(" ");
            for (String temp : e) {
                b += 1;
            }
        }
        jumlahKata = b;
        return jumlahKata;
    }

    private String kategori(short a) {
        switch (a) {
            case 1:
                Kategori = "Teknologi";
                break;
            case 2:
                Kategori = "Filsafat";
                break;
            case 3:
                Kategori = "Sejarah";
                break;
            case 4:
                Kategori = "Agama";
                break;
            case 5:
                Kategori = "Psikolog";
                break;
            case 6:
                Kategori = "Politik";
                break;
            case 7:
                Kategori = "Fiksi";
                break;
            case 8:
                Kategori = "Random";
                break;
            default:
                System.out.println("Tidak Valid");
                System.exit(0);
                break;
        }

        return Kategori;
    }

    private int hitungRoyalti(double a) {
        return royalti10 = (int)a * 10 / 100;
    }

    private int hitungRoyaltiBebas(double a, double b) {
        return royaltiBebas = (int)a * (int)b / 100;
    }

    public int getRoyaltiIngin() {
        return royaltiIngin;
    }

    public double getHargaBuku() {
        return hargaBuku;
    }

    public int getJumlahKata() {
        return setSinopsis(sinopsis);
    }

    public int getRoyaltiBebas() {
        return hitungRoyaltiBebas(hargaBuku, royaltiIngin);
    }

    public int getRoyalti10() {
        return hitungRoyalti(hargaBuku);
    }

    public String getKategori() {
        return Kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    private void menuSimpanFile() {
        System.out.println("Kategori apa yang ingin di simpan ?");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama"
                + "\n5. Psikologi\n6. Politik\n7. Fiksi");
        System.out.print("Masukan pilihan anda : ");
        indikator = in.nextShort();
        cek = true;
        pilih = indikator;

    }

    public void simpanFile(String namaFile) {
        
        try {
            FileWriter fileWriter = new FileWriter(namaFile, true); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            
            bufferedWriter.write(hargaBuku + ";" + judul + ";" + penulis + ";" + Kategori + ";" + sinopsis);
            bufferedWriter.newLine(); 
            System.out.println("Berhasil Disimpan");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
