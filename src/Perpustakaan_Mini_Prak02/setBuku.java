package Perpustakaan_Mini_Prak02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class setBuku {

    public setBuku() {
        switch (isiKonten.pilih) {
            case 1:

                isiKonten teknologi1 = new isiKonten(85000, "Homo Deus", "Yuval Noah",
                        "Buku ini  menjelaskan tentang peradaban manusia pada masa saat ini sekaligus peradaban manusia pada 100 tahun sebelumnya.");
                isiKonten teknologi2 = new isiKonten(120000, "Life 3.0", "Max Tegmark",
                        "Buku yang berisi anuSebuah pemikiran filosofis praktis mengenai potensi AI sebagai pisau dua sisi dalam kehidupan manusia modern");
                if (isiKonten.indikator == 1) {
                    teknologi1.simpanFile("Simpan.txt");
                    teknologi2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(teknologi1, teknologi2);
                    copy(teknologi1, teknologi2);
                }
                break;
            case 2:
                isiKonten filsafat1 = new isiKonten(150000, "Filosofi Teras", "Henry Manampiring",
                        "Buku pengantar filsafat Stoa yang dibuat khusus sebagai panduan moral anak muda.");
                isiKonten filsafat2 = new isiKonten(70000, "Dunia Sophie", "Jostein Gaarder",
                        "Dunia Sophie adalah sebuah novel karya Jostein Gaarder, diterbitkan di Indonesia oleh Penerbit Mizan tahun 1996.");
                if (isiKonten.indikator == 2) {
                    filsafat1.simpanFile("Simpan.txt");
                    filsafat2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(filsafat1, filsafat2);
                    copy(filsafat1, filsafat2);
                }
                break;
            case 3:
                isiKonten sejarah1 = new isiKonten(200000, "Sejarah Dunia yang disembunyikan", "Jonathan Black",
                        "Buku Sejarah Dunia Yang Disembunyikan yang ditulis oleh Jonathan Black merupakan buku yang mengungkapkan tentang keraguan dan kepercayaan kita akan sejarah mitologi Yunani dan Mesir Kuno");
                isiKonten sejarah2 = new isiKonten(100000, "Max Havelaar", "Multatuli",
                        "Buku Max Havelaar atau \"Lelang Kopi Perusahaan Dagang Belanda\" berisi tentang kritik terhadap kesewenang-wenangan pemerintahan kolonial Belanda di Indonesia.");
                if (isiKonten.indikator == 3) {
                    sejarah1.simpanFile("Simpan.txt");
                    sejarah2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(sejarah1, sejarah2);
                    copy(sejarah1, sejarah2);
                }
                break;
            case 4:
                isiKonten agama1 = new isiKonten(50000, "Kitab Tauhid", "Dr. Shalih bin",
                        "Buku yang menjelaskan tentang mengesakan Allah -ta'ala- dalam peribadatan, keutamaan, hukum-hukum, syarat-syarat, dan konsekuensinya");
                isiKonten agama2 = new isiKonten(70000, "Kisah Para Nabi", "Ibnu Katsir",
                        "Buku Kisah para Nabi ini merupakan karya fenomenal ulama terkemuka sekaligus ahli tafsir dan sejarah, Ibnu Katsir. ");
                if (isiKonten.indikator == 4) {
                    agama1.simpanFile("Simpan.txt");
                    agama2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(agama1, agama2);
                    copy(agama1, agama2);
                }
                break;
            case 5:
                isiKonten psikologi1 = new isiKonten(75000, "Outliers", "Malcom Gladwell",
                        "Dalam buku yang menakjubkan ini, Malcolm Gladwell membawa kita pada perjalanan intelektual melalui dunia “outlier”");
                isiKonten psikologi2 = new isiKonten(95000, "Atomic Habits", "James Clear",
                        "Perubahan Kecil yang Memberikan Hasil Luar Biasa adalah buku kategori self improvement");
                if (isiKonten.indikator == 5) {
                    psikologi1.simpanFile("Simpan.txt");
                    psikologi2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(psikologi1, psikologi2);
                    copy(psikologi1, psikologi2);
                }
                break;
            case 6:
                isiKonten politik1 = new isiKonten(145000, "Memenangkan Indonesia", "Anies R. Baswedan",
                        "Buku Memenangkan Indonesia berisi kumpulan pemikiran dan gagasan Anies Rasyid Baswedan");
                isiKonten politik2 = new isiKonten(145000, "Memenangkan Indonesia", "Anies R. Baswedan",
                        "Buku Memenangkan Indonesia berisi kumpulan pemikiran dan gagasan Anies Rasyid Baswedan");
                if (isiKonten.indikator == 6) {
                    politik1.simpanFile("Simpan.txt");
                    politik2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(politik1, politik2);
                    copy(politik1, politik2);
                }
                break;
            case 7:
                isiKonten fiksi1 = new isiKonten(100000, "Bumi", "Tere Liye",
                        "Bumi, merupakan rangkaian awal dari kisah sekelompok anak remaja berkemampuan istimewa.");
                isiKonten fiksi2 = new isiKonten(100000, "Komet", "Tere Liye",
                        "Novel ini adalah lanjutan kisah perjalanan tiga remaja petualang, yakni Raib, Ali, dan Seli");
                if (isiKonten.indikator == 7) {
                    fiksi1.simpanFile("Simpan.txt");
                    fiksi2.simpanFile("Simpan.txt");
                } else {
                    cekKesamaan(fiksi1, fiksi2);
                    copy(fiksi1, fiksi2);
                }
                break;
            case 8:
                bacaFile("listBuku.txt");
                break;

        }

    }

    private void cekKesamaan(isiKonten buku1, isiKonten buku2) {
        int a = 0;
        if (buku1.getKategori().equals(buku2.getKategori())) {
            a += 1;
        }
        if (buku1.getJudul().equals(buku2.getJudul())) {
            a += 1;
        }
        if (buku1.getPenulis().equals(buku2.getPenulis())) {
            a += 1;
        }
        if (buku1.getSinopsis().equals(buku2.getSinopsis())) {
            a += 1;
        }
        if (buku1.getJumlahKata() == buku2.getJumlahKata()) {
            a += 1;
        }
        if (buku1.getHargaBuku() == buku2.getHargaBuku()) {
            a += 1;
        }
        if (buku1.getRoyalti10() == buku2.getRoyalti10()) {
            a += 1;
        }
        if (buku1.getRoyaltiBebas() == buku2.getRoyaltiBebas()) {
            a += 1;
        }
        System.out.println("Nilai cek hasil Kesamaan : " + (a * 12.5) + "%");
    }

    private void copy(isiKonten buku1, isiKonten buku2) {
        buku1 = buku2;
        System.out.println("Hasil Pemnaggilan Method Copy");
        System.out.println("============================");
        buku2.display(isiKonten.pilih);
        System.out.println("");
        buku1.display(isiKonten.pilih);
    }

    private void bacaFile(String pathFile) {
        ArrayList<isiKonten> daftarBuku = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("listBukuu.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(";");

                
                isiKonten buku = new isiKonten(Double.parseDouble(data[0]), data[1], data[2], data[3], data[4]);
                daftarBuku.add(buku);
            }

            bufferedReader.close();
        } catch (IOException e) {
        }
        for (isiKonten buku : daftarBuku) {
            System.out.println("Kategori   : " + buku.getKategori());
            System.out.println("Judul      : " + buku.getJudul());
            System.out.println("Penulis    : " + buku.getPenulis());
            System.out.println("Sinopsis   : " + buku.getSinopsis());
            System.out.printf("Harga Buku : %.0f", buku.getHargaBuku());
            System.out.println("Jumlah Kata: " + buku.getJumlahKata());
            System.out.println("Harga Royalti 10% : Rp."+buku.getRoyalti10());
            System.out.println("Harga Royalti " + buku.getRoyaltiIngin() + "% : Rp." + buku.getRoyaltiBebas());
            System.out.println();
        }
        
            }

}