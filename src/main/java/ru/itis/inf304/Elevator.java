package ru.itis.inf304;

public abstract class Elevator implements Call{
    public Status status;
    protected int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void makeCall(int floor){
        if (floor % 2 == 0) {
            System.out.println("you call even elevator");
        }else {
            System.out.println("you call odd elevator");
        }
        System.out.println("you call employee elevator");
    }

}
