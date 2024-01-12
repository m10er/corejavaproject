package entites;

public class ElectronicProduct extends Product{
    private String renk="belirtilmemis";

    public ElectronicProduct(String renk) {
        this.renk = renk;
    }

    public ElectronicProduct(String id, String ad, double fiyat, String aciklama, String renk) {
        super(id, ad, fiyat, aciklama);
        this.renk = renk;
    }

    public ElectronicProduct() {
    }

    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "renk='" + renk + '\'' ;
    }


}
