package Exceptions.HomeWorks.HomeWork_03.Task_02.model;

public class Players {
    String name;
    int count;

    public Players(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String toString() {
        return name + " " + count;
    }

}
