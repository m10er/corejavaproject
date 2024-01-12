package service;

import database.InmemoryDatabase;
import entites.Computer;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TurkceComputerService implements  ComputerService {
    Scanner scanner = new Scanner(System.in);
    InmemoryDatabase inmemoryDatabase;

    public TurkceComputerService() {
        inmemoryDatabase = new InmemoryDatabase();

    }

    @Override
    public void save() {
        String bilgisayarAd = null;
        String bilgisayarRenk = null;
        String bilgisayarAciklama = null;
        String bilgisayarEkranKarti = null;
        String bilgisayarRam = null;
        double bilgisayarFiyat = 0;
        try {
            System.out.println("Marka");
            bilgisayarAd = scanner.next();
            System.out.println("renk");
            bilgisayarRenk = scanner.next();
            System.out.println("aciklama");
            bilgisayarAciklama = scanner.next();
            System.out.println("ekran karti");
            bilgisayarEkranKarti = scanner.next();
            System.out.println("ram");
            bilgisayarRam = scanner.next();
            System.out.println("fiyati");
            bilgisayarFiyat = scanner.nextDouble();
        } catch (Exception e) {
            save();
        }

        Computer computer = new Computer();
        computer.setAd(bilgisayarAd);
        computer.setRenk(bilgisayarRenk);
        computer.setAciklama(bilgisayarAciklama);
        computer.setEkranKarti(bilgisayarEkranKarti);
        computer.setRam(bilgisayarRam);
        computer.setFiyat(bilgisayarFiyat);
        computer.setId(computer.getId());

        inmemoryDatabase.computerList().add(computer);

    }

    @Override
    public void update() {
        System.out.println("degistirmek istedigniz bilgisayar id'si.");
        String id = scanner.next();
        Computer computer = new Computer();
        for (Computer each :
                inmemoryDatabase.computerList()) {
            if (each.getId().equals(id)) {
                computer = each;
            }
            String computerName = null;
            String computerColor = null;
            String computerDisplayCard = null;
            String computerRam = null;
            double computerPrice = 0;
            try {
                System.out.println("Marka");
                computerName = scanner.next();
                System.out.println("Renk");
                computerColor = scanner.next();
                System.out.println("Aciklama");
                String computerComment = scanner.next();
                System.out.println("Ekran karti");
                computerDisplayCard = scanner.next();
                System.out.println("Ram");
                computerRam = scanner.next();
                System.out.println("Fiyati");
                computerPrice = scanner.nextDouble();
            } catch (Exception e) {
                update();
            }

            computer.setAd(computerName);
            computer.setRenk(computerColor);
            computer.setAciklama(computerRam);
            computer.setEkranKarti(computerDisplayCard);
            computer.setRam(computerRam);
            computer.setFiyat(computerPrice);

        }


    }

    @Override
    public void remove() {
        System.out.println("Silmek istedigniz bilgisayar id'sini giriniz.");
        String id = null;
        try {
            id = scanner.next();
        } catch (Exception e) {
            remove();
        }
        Computer computer = new Computer();

        for (Computer each :
                inmemoryDatabase.computerList()) {
            if (each.getId().equals(id)) {
                computer = each;
            }
        }
        inmemoryDatabase.computerList().remove(computer);
    }

    @Override
    public void option() {
        System.out.println("islem seciniz" +
                "\n1.bilgisaylari filtrele" +
                "\n2.Bilgisayar ekle" +
                "\n3.Bilgisayar guncelle" +
                "\n4.Bilgisayar sil");

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
    public void newOption() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("anamenu icin 1" +
                "\n cikmak icin 2");
        String secenek = null;
        try {
            secenek = scanner1.next();
        } catch (Exception e) {
            newOption();
        }
        if (secenek.equals("1")){
            option();
        }else {
            System.out.println("islem bitti");
        }
    }

    public void computerFilter () {
        System.out.println("1.Tum bilgisayarlari gor");
        System.out.println("2. Fiyata gore sirala");
        System.out.println("3. indirim oranina gore sirala ");
        String deger = null;
        try {
            deger = scanner.next();
        } catch (Exception e) {
            computerFilter();
        }

        switch (deger) {
            case "1":
                System.out.println(inmemoryDatabase.computerList());
                break;
            case "2":
                List<Computer> computerList = inmemoryDatabase.computerList().stream().sorted(Comparator.comparingDouble(Computer::getFiyat)).collect(Collectors.toList());
                for (Computer each :
                        computerList) {
                    System.out.println(each);
                }
                break;
            case "3":
                System.out.println("Suan hizmet veremiyoruz.");
            default:
                computerFilter();


        }

    }

}