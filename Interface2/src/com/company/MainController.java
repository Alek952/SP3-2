package com.company;

import com.company.Pizza;
import com.company.ShowMenu;
import com.company.ShowMenuDK;
//import com.company.ShowMenuUK;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ShowMenu showMenu = new ShowMenuDK();

    public void runProgram() {
        showMenu.showMenu();
        while (choice!=9) {
            choice = sc.nextInt();
            switch (choice) {
                case 1: showMenu.showMenu();break;
                case 2: createOrder();break;
                case 3: editOrder();break;
                case 4: confirmOrder();break;
                default:choice=9;break;
            }
        }
    }

    //Createorder 1. Via alle pizza'er.
    private void createOrder() {
        int lchoice = 0;
        System.out.println(getAllPizzasFromSource());
        while (lchoice != 9) {
            choice = sc.nextInt();
            switch (lchoice) {
                case 1: showMenu = new ShowMenuDK();break;

            }
        }
    }



    private void confirmOrder(){
    }

    private void editOrder(){
    }

        public ArrayList<Pizza> getAllPizzasFromSource(){

        ArrayList<Pizza> returnList = new ArrayList<>();
        //Henter pizza fra en fil.
            // 1;Vesuvio;Tomatsauce, ost, skinke og oregano;57
            File file = new File("Resources/Pizza.csv");
            try {

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = "";

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");
                    Pizza pizza = new Pizza(values[0],values[0],values[0],values[0]);
                    returnList.add(pizza);
                    System.out.println(returnList);



                }
            } catch(IOException e) {
                e.printStackTrace();
            }return returnList;

        }
    }

