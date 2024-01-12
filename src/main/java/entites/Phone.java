package entites;

public class Phone extends ElectronicProduct{
    private String camPIxel ="belirtilmemis";

    public Phone() {
    }

    public Phone(String renk, String camPIxel) {
        super(renk);
        this.camPIxel = camPIxel;
    }

    public Phone(String id, String ad, double fiyat, String aciklama, String renk, String camPIxel) {
        super(id, ad, fiyat, aciklama, renk);
        this.camPIxel = camPIxel;
    }

    public Phone(String camPIxel) {
        this.camPIxel = camPIxel;
    }

    public String getCamPIxel() {
        return camPIxel;
    }

    public void setCamPIxel(String camPIxel) {
        this.camPIxel = camPIxel;
    }

    @Override
    public String toString() {
        return super.toString()+
                "camPIxel='" + camPIxel + '\'' +
                '}';
    }
}
