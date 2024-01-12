package database;

import entites.Computer;
import entites.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InmemoryPhoneDatabase {

    List<Phone> phoneList;

    public InmemoryPhoneDatabase() {
       phoneList= new ArrayList<>();

      Phone phone2 = new Phone( );
      phone2.setId("2");
      phone2.setAd("Samsung");
      phone2.setRenk("siyah");
      phone2.setAciklama("iyi kamera");
      phone2.setFiyat(12321);
      phone2.setCamPIxel("12");
      phoneList.add(phone2);
        Phone phone3 = new Phone( );
        phone3.setId("3");
        phone3.setAd("Samsung");
        phone3.setRenk("siyah");
        phone3.setAciklama("iyi kamera");
        phone3.setFiyat(12321);
        phone3.setCamPIxel("12");
        phoneList.add(phone3);

        Phone phone4 = new Phone( );
        phone4.setId("4");
        phone4.setAd("I Phone");
        phone4.setRenk("Mavi");
        phone4.setAciklama("iyi kamera");
        phone4.setFiyat(1233);
        phone4.setCamPIxel("12");
        phoneList.add(phone4);
        Phone phone5 = new Phone( );
        phone5.setId("5");
        phone5.setAd("Xiaomi");
        phone5.setRenk("beyaz");
        phone5.setAciklama(" 2 yil garantili");
        phone5.setFiyat(1000);
        phone5.setCamPIxel("10");
        phoneList.add(phone5);


    }
    public List<Phone> phoneList(){
        return phoneList;
    }

}
