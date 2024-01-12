package entites;

public class Product {
    private String id;
    private String ad;
    private double fiyat;
    private String aciklama;


    public Product(String id, String ad, double fiyat, String aciklama) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return   ", ad='" + ad + '\'' +
                ", fiyat=" + fiyat +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
