package com.example.demo.data;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Computer;

public class ComputerData {
    List<Computer> computers;

    public List<Computer> getAllComputer(){
         computers = new ArrayList<>();
         computers.add(new Computer(1, "Macos", 3224, "good"));
         computers.add(new Computer(2, "Hp", 32424, "so so"));
         computers.add(new Computer(3, "lenova", 32432, "vaoww"));
         computers.add(new Computer(4, "Macos", 3224, "good"));
         computers.add(new Computer(5, "Hp", 32424, "so so"));
         computers.add(new Computer(6, "lenova", 32432, "vaoww"));
         computers.add(new Computer(7, "Macos", 3224, "good"));
         computers.add(new Computer(8, "Hp", 32424, "so so"));
         computers.add(new Computer(9, "lenova", 32432, "vaoww"));
         computers.add(new Computer(10, "Macos", 3224, "good"));
         computers.add(new Computer(11, "Hp", 32424, "so so"));
         computers.add(new Computer(12, "lenova", 32432, "vaoww"));
         return computers;
    }
    
    
}
