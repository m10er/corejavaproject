package database;

import entites.Computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InmemoryDatabase {
    Scanner scanner = new Scanner(System.in);

    List<Computer> computerList;

    public InmemoryDatabase() {
    computerList= new ArrayList<>();

    Computer computer1 =new Computer();
    computer1.setId("1");
    computer1.setAd("Macbook");
    computer1.setRam("256");
    computer1.setAciklama("2 yil garantili distrubuter");
    computerList.add(computer1);

    Computer computer2= new Computer();
    computer2.setId("2");
    computer2.setAd("Hp");
    computer2.setEkranKarti("128");
    computer2.setRenk("siyah");
    computerList.add(computer2);

        Computer computer3 =new Computer();
        computer3.setAd("Macbook");
        computer3.setRam("256");
        computer3.setAciklama("2 yil garantili distrubuter");
        computerList.add(computer3);

        Computer computer4= new Computer();
        computer4.setAd("Hp");
        computer4.setEkranKarti("128");
        computer4.setRenk("siyah");
        computerList.add(computer4);


    }
    public List<Computer> computerList(){
        System.out.println(computerList);
        return computerList;
    }



}
