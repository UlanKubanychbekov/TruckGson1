package com.company;

import com.company.Model.Driver;
import com.company.Model.Truck;
import com.company.enums.State;
import com.company.service.Service;
import com.company.yourException.InvalidChangeAttemptException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck(1, "Man  ", State.BASE);
        Truck truck1 = new Truck(2, "Mers ", State.BASE);
        Truck truck2 = new Truck(3, "Volvo", State.BASE);

        Driver driver = new Driver(1, "Kuba    ");
        Driver driver1 = new Driver(2, "Tologon ");
        Driver driver2 = new Driver(3, "Altynbek");

        Service service = new Service();

        service.putDriver(driver);
        service.putDriver(driver1);
        service.putDriver(driver2);

        service.putTruck(truck);
        service.putTruck(truck1);
        service.putTruck(truck2);

        Scanner scanner = new Scanner(System.in);


        service.showTruck();
        while (true) {
            try {


                System.out.println();
                System.out.print("ENTER ID OF TRUCK TO SEE ALL INFORMATION ABOUT IT: ");
                int truckNum = scanner.nextInt();
                System.out.println();
                service.showIdtruck(truckNum);
                chooseAnAction();
                int state = scanner.nextInt();
                switch (state) {
                    case 1 -> service.changeDriver(truckNum);
                    case 2 -> service.route(truckNum);
                    case 3 -> service.repairing(truckNum);
                    case 4 -> service.base(truckNum);
                }


            } catch (InvalidChangeAttemptException e) {
                System.err.println("no find number");
            }
            System.out.println();
            service.showTruck();
            System.out.println();
            service.showDriver();
            service.writeJson();
        }
    }

    public static void chooseAnAction() {
        System.out.println();
        System.out.println("choose an Action");
        System.out.println(" - 1: choose an driver");
        System.out.println(" - 2: start in driving");
        System.out.println(" - 3: tart repair");
        System.out.println(" - 4: ot send to the Base");

    }

    public static void chooseAnActionTruck() {

    }
}
