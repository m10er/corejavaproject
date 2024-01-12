package controller;

import service.ComputerService;
import service.EnglishComputerSErvice;
import service.TurkceComputerService;

import java.util.Scanner;

public class ComputerController {
    Scanner scanner = new Scanner(System.in);
    public void calistir(ComputerService computerService){
        try {
            computerService.option();
        } catch (Exception e) {
            calistir(computerService);
        }



    }

}

