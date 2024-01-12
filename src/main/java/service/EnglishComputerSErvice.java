package service;

import database.InmemoryDatabase;
import entites.Computer;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnglishComputerSErvice implements ComputerService {
    Scanner scanner = new Scanner(System.in);
    InmemoryDatabase inmemoryDatabase;

    public EnglishComputerSErvice() {
        inmemoryDatabase = new InmemoryDatabase();

    }

    @Override
    public void save() {
        System.out.println("Please enter the name of the computer you want to add");
        String bilgisayarAd = scanner.next();
        System.out.println("Please enter the color of the computer you want to add.");
        String bilgisayarRenk = scanner.next();
        System.out.println("Please enter the description of the computer you want to add.");
        String bilgisayarAciklama = scanner.next();
        System.out.println("Please enter the video card of the computer you want to add.");
        String bilgisayarEkranKarti = scanner.next();
        System.out.println("Please enter the ram of the computer you want to add.");
        String bilgisayarRam = scanner.next();
        System.out.println("Please enter the price of the computer you want to add.");
        double bilgisayarFiyat = scanner.nextDouble();

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
        System.out.println("Please enter the ID of the computer you want to change.");
        String id = scanner.next();
        Computer computer = new Computer();
        for (Computer each :
                inmemoryDatabase.computerList()) {
            if (each.getId().equals(id)) {
                computer = each;
            }
            System.out.println("Please enter the new name of the computer");
            String computerName = scanner.next();
            System.out.println("Please enter the new color of the computer");
            String computerColor = scanner.next();
            System.out.println("Please enter the new description of the computer");
            String computerComment = scanner.next();
            System.out.println("Please enter the new video card of the computer");
            String computerDisplayCard = scanner.next();
            System.out.println("Please enter the ram of the computer");
            String computerRam = scanner.next();
            System.out.println("Please enter the price of the computer");
            double computerPrice = scanner.nextDouble();

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
        System.out.println("Enter the ID of the computer you want to delete.");
        String id = scanner.next();
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
        System.out.println("Select the action you want to perform" +
                "\n1.Filter computers" +
                "\n2.Add computer" +
                "\n3.Update computer" +
                "\n4.Wipe computer");

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
        System.out.println("mainmenu 1" +
                "\n for exit 2");
        String secenek = null;
        try {
            secenek = scanner1.next();
        } catch (Exception e) {
            newOption();
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
                System.out.println("We cannot offer this service at the moment.");
            default:
                computerFilter();


        }

    }

}