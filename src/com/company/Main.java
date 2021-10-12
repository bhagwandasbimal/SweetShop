package com.company;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Sweet Shop");

        Laddu laddu = new Laddu();
        laddu.id = "l001";
        laddu.price = 15;

        RasGulla rasGulla = new RasGulla();
        rasGulla.id = "r002";
        rasGulla.price= 20;

        Jalebi jalebi = new Jalebi();
        jalebi.id = "j003";
        jalebi.price = 10;

        Kalakhand kalakhand = new Kalakhand();
        kalakhand.id = "k004";
        kalakhand.price = 30;

        GulabJamun gulabJamun = new GulabJamun();
        gulabJamun.id = "g005";
        gulabJamun.price = 25;

        Laddu laddu1 = new Laddu();
        laddu1.id = "l002";
        laddu1.price = 5;

        SweetRepository sweetRepository = new SweetRepository();
        sweetRepository.add(laddu);
        sweetRepository.add(rasGulla);
        sweetRepository.add(jalebi);
        sweetRepository.add(kalakhand);
        sweetRepository.add(gulabJamun);
        sweetRepository.add(laddu1);

        UserInterface ui = new UserInterface();

        //List sweetList = sweetRepository.getSweetList();
        Set sweetList = sweetRepository.getSweetList();
        ui.print(sweetList);

        sweetRepository.delete(laddu);
        sweetRepository.delete(rasGulla);
        sweetRepository.delete(jalebi);
        sweetRepository.delete(kalakhand);
        sweetRepository.delete(gulabJamun);

        System.out.println("After deleting the remaining Sweet list : ");
        ui.print(sweetList);


    }
}