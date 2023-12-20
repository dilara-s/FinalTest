package ru.itis.inf304;

public class Main {
    public static void main(String[] args) throws ElevatorException{
        EvenElevator e1 = new EvenElevator();
        EvenElevator e2 = new EvenElevator();
        EvenElevator e3 = new EvenElevator();

        OddElevator e4 = new OddElevator();
        OddElevator e5 = new OddElevator();
        OddElevator e6 = new OddElevator();

        EmployeeElevator e7 = new EmployeeElevator();

        for (int i = 1; i <= 20; i++) {
            e1.makeCall(2);
        }
        if () {
            throw new ElevatorException("All elevators are busy.");
        }
    }
}