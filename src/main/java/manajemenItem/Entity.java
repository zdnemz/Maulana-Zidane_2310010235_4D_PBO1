package manajemenItem;

/**
 *
 * @author ZidaneMZ
 */

public abstract class Entity {
    protected String id;
    protected String nama;

    public Entity(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract String getInfo();
}
