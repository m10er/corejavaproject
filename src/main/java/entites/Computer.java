package entites;

public class Computer extends ElectronicProduct{
  private String ekranKarti="belirtilmemis";
   private String ram= "belirtilmemis";

    public Computer(String renk, String ekranKarti, String ram) {
        super(renk);
        this.ekranKarti = ekranKarti;
        this.ram = ram;
    }

    public Computer(String id, String ad, double fiyat, String aciklama, String renk, String ekranKarti, String ram) {
        super(id, ad, fiyat, aciklama, renk);
        this.ekranKarti = ekranKarti;
        this.ram = ram;
    }

    public Computer(String ekranKarti, String ram) {
        this.ekranKarti = ekranKarti;
        this.ram = ram;
    }

    public Computer() {
    }

    public String getEkranKarti() {
        return ekranKarti;
    }

    public void setEkranKarti(String ekranKarti) {
        this.ekranKarti = ekranKarti;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" + super.toString()+
                "ekranKarti='" +ekranKarti + '\'' +
                ", ram='" + ram + '\'' +
                '}'+ "\n";
    }
}
