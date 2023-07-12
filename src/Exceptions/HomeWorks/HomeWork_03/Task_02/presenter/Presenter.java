package Exceptions.HomeWorks.HomeWork_03.Task_02.presenter;

import Exceptions.HomeWorks.HomeWork_03.Task_02.model.Model;
import Exceptions.HomeWorks.HomeWork_03.Task_02.model.Players;

public class Presenter {
    Model model = new Model();

    public void add(Players players){
        model.add(players);
    }

    public void print(){
        model.print();
    }



}
