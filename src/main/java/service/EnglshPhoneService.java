package service;

import database.InmemoryDatabase;
import database.InmemoryPhoneDatabase;
import entites.Computer;
import entites.Phone;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnglshPhoneService implements PhoneService{
    Scanner scanner = new Scanner(System.in);
    InmemoryPhoneDatabase inmemoryDatabase;

    public EnglshPhoneService() {
        inmemoryDatabase = new InmemoryPhoneDatabase();

    }

    @Override
    public void save() {
        String bilgisayarAd = null;
        String bilgisayarRenk = null;
        String bilgisayarAciklama = null;
        double bilgisayarFiyat = 0;
        try {
            System.out.println("Please enter the name of the phone you want to add");
            bilgisayarAd = scanner.next();
            System.out.println("Please enter the color of the phone you want to add.");
            bilgisayarRenk = scanner.next();
            System.out.println("Please enter the description of the phone you want to add.");
            bilgisayarAciklama = scanner.next();
            System.out.println("Please enter the video card of the phone you want to add.");
            String camPixel = scanner.next();
            System.out.println("Please enter the price of the phone you want to add.");
            bilgisayarFiyat = scanner.nextDouble();
        } catch (Exception e) {
            save();
        }

        Phone phone = new Phone();
        phone.setAd(bilgisayarAd);
        phone.setRenk(bilgisayarRenk);
        phone.setAciklama(bilgisayarAciklama);
        phone.setFiyat(bilgisayarFiyat);
        phone.setId(phone.getId());

        inmemoryDatabase.phoneList().add(phone);
        System.out.println("success");
    }

    @Override
    public void update() {
        System.out.println("Please enter the ID of the computer you want to change.");
        String id = null;
        try {
            id = scanner.next();
        } catch (Exception e) {
            update();
        }
        Phone phone = new Phone();
        for (Phone each :
                inmemoryDatabase.phoneList()) {
            if (each.getId().equals(id)) {
                phone = each;
            }
            System.out.println("Please enter the new name of the phone");
            String computerName = scanner.next();
            System.out.println("Please enter the new color of the phone");
            String computerColor = scanner.next();
            System.out.println("Please enter the new video card of the phone");
            String camPixel = scanner.next();
            System.out.println("Please enter the price of the phone");
            double computerPrice = scanner.nextDouble();

            phone.setAd(computerName);
            phone.setRenk(computerColor);
            phone.setCamPIxel(camPixel);
            phone.setFiyat(computerPrice);
            System.out.println("success");
        }


    }

    @Override
    public void remove() {
        System.out.println("Enter the ID of the computer you want to delete.");
        String id = null;
        try {
            id = scanner.next();
        } catch (Exception e) {
            remove();
        }
        Phone phone= new Phone();

        for (Phone each :
                inmemoryDatabase.phoneList()) {
            if (each.getId().equals(id)) {
               phone = each;
            }
        }
        inmemoryDatabase.phoneList().remove(phone);
        System.out.println("success");
    }

    @Override
    public void option() {
        System.out.println("Select the action you want to perform" +
                "\n1.Filter phones" +
                "\n2.Add phone" +
                "\n3.Update phone" +
                "\n4.Wipe phone");

        String option = null;
        try {
            option = scanner.next();
        } catch (Exception e) {
            option();
        }
        switch (option) {
            case "1":
                computerFilter();
                break;
            case "2":
                save();
                break;
            case "3":
                update();
                break;
            case "4":
                remove();
            default:option();

        }
    }

    @Override
    public void newoption() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("mainmenu 1" +
                "\n for exit 2");
        String secenek = null;
        try {
            secenek = scanner1.next();
        } catch (Exception e) {
            newoption();
        }
        if (secenek.equals("1")){
            option();
        }else {
            System.out.println("exit");
        }
    }

    public void computerFilter () {
        System.out.println("1.To see all computers");
        System.out.println("2. To sort computers by price");
        System.out.println("3. To sort computers by discount rate ");
        String deger = scanner.next();

        switch (deger) {
            case "1":
                System.out.println(inmemoryDatabase.phoneList());
                break;
            case "2":
                List<Phone> phoneList = inmemoryDatabase.phoneList().stream().sorted(Comparator.comparingDouble(Phone::getFiyat)).collect(Collectors.toList());
                for (Phone each :
                        phoneList) {
                    System.out.println(each);
                }
                break;
            case "3":
                System.out.println("We cannot offer this service at the moment.");
            default:
                computerFilter();


        }

    }

}