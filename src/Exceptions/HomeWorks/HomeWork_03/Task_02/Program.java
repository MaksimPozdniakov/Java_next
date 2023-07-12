package Exceptions.HomeWorks.HomeWork_03.Task_02;

import Exceptions.HomeWorks.HomeWork_03.Task_02.model.Model;
import Exceptions.HomeWorks.HomeWork_03.Task_02.model.Players;

public class Program {
    public static void main(String[] args) {
        Model model = new Model();
        model.add(new Players("Mike", 100));
        model.print();
    }
}
