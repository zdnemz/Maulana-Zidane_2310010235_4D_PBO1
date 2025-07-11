package manajemenItem;

import java.util.Scanner;

/**
 *
 * @author ZidaneMZ
 */

public class ManajemenItem {

    protected Item[] daftarItem = new Item[5];
    protected int jumlahItem = 0;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ManajemenItem manajer = new ManajemenItem();

            while (true) {
                try {

                    System.out.println("\n=== Sistem Manajemen Gudang ===");
                    System.out.println("1. Tambah Item Baru");
                    System.out.println("2. Tambah Stok Item");
                    System.out.println("3. Kurangi Stok Item");
                    System.out.println("4. Lihat Semua Item");
                    System.out.println("5. Keluar");
                    System.out.print("Pilih menu    : ");
                    int pilihan = input.nextInt();
                    input.nextLine();
                    System.out.println("===============================");

                    switch (pilihan) {
                        case 1 -> {
                            System.out.print("Id Item       : ");
                            String id = input.nextLine();
                            System.out.print("Nama Item     : ");
                            String nama = input.nextLine();
                            System.out.print("Kategori      : ");
                            String kategori = input.nextLine();
                            System.out.print("Stok Awal     : ");
                            int stok = input.nextInt();
                            input.nextLine();
                            
                            manajer.tambahItem(new Item(id, nama, kategori, stok));
                        }
                        
                        case 2 -> {
                            System.out.print("Masukkan ID Item yang ingin ditambah stok : ");
                            String idTambah = input.nextLine();
                            Item tambah = manajer.cariItemById(idTambah);
                            if (tambah != null) {
                                System.out.print("Jumlah yang ingin ditambah                : ");
                                int jumlahTambah = input.nextInt();
                                tambah.tambahStok(jumlahTambah);
                                System.out.println("Stok berhasil ditambahkan.");
                            } else {
                                System.out.println("Item tidak ditemukan.");
                            }
                        }

                        case 3 -> {
                            System.out.print("Masukkan ID Item yg ingin dikurangi stok  : ");
                            String idKurang = input.nextLine();
                            Item kurang = manajer.cariItemById(idKurang);
                            if (kurang != null) {
                                System.out.print("Jumlah yang ingin dikurangi               : ");
                                int jumlahKurang = input.nextInt();
                                kurang.kurangiStok(jumlahKurang);
                                System.out.println("Stok berhasil dikurangi.");
                            } else {
                                System.out.println("Item tidak ditemukan.");
                            }
                        }

                        case 4 -> manajer.tampilkanSemuaItem();

                        case 5 -> {
                            System.out.println("Terima kasih telah menggunakan sistem.");
                            System.exit(0);
                        }

                        default -> System.out.println("Pilihan tidak valid.");
                    }

                    System.out.println("===============================");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("===============================");
                    input.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public void tambahItem(Item item) {
        if (jumlahItem < daftarItem.length) {
            daftarItem[jumlahItem] = item;
            jumlahItem++;
            System.out.println("Item berhasil ditambahkan.");
        } else {
            System.out.println("Gudang sudah penuh, tidak bisa menambah Item.");
        }
    }

    public Item cariItemById(String id) {
        for (int i = 0; i < jumlahItem; i++) {
            if (daftarItem[i].getId().equalsIgnoreCase(id)) {
                return daftarItem[i];
            }
        }
        return null;
    }

    public void tampilkanSemuaItem() {
        if (jumlahItem <= 0) {
            System.out.println("Belum ada data Item.");
        } else {
            System.out.println("======== Daftar Item ========");
            for (int i = 0; i < jumlahItem; i++) {
                System.out.println(daftarItem[i].getInfo());
            }
        }
    }
}
