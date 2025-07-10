package manajemenItem;

/**
 *
 * @author ZidaneMZ
 */

public class Item extends Entity {
    private String kategori;
    private int stok;

    public Item(String id, String nama, String kategori, int stok) {
        super(id, nama);
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return this.stok;
    }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > this.stok) {
            throw new IllegalArgumentException("Jumlah yang dikurangi melebihi stok yang tersedia.");
        }
        this.stok -= jumlah;
    }

    @Override
    public String getInfo() {
        String teks = this.id + " - " + this.nama + " ( " + this.kategori + " ) " + this.stok + " unit";
        return teks;

    }
}
