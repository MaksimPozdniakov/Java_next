package Exceptions.HomeWorks.HomeWork_03.Task_02.model;

import java.util.ArrayList;

public class Model {

    private ArrayList<String> allClients = new ArrayList<>();

    public void add(Players players) {
        ArrayList<Players> ourDB = new ArrayList<>();
        ourDB.add(players);

        for (Players el: ourDB) {
            allClients.add(el.toString());
        }

    }


    public void print() {
        for (String el: allClients) {
            System.out.println(el);
        }
    }



}
