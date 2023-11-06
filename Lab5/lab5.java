package Lab5;

import java.util.Scanner;

public class lab5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /*
        Cat cat1 = new Cat("Tom", "Gray", 83);
        Cat cat2 = new Cat("Garfield", "Orange", 45);
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        cat1.feed();
        cat1.play();
        cat1.sleep();
        */

        Employee angajat1 = new Employee();
        System.out.println("Veti introduce datele pentru un angajat:\n");
        System.out.print("Nume: ");
        angajat1.setName(scanner.nextLine());
        System.out.println();
        System.out.print("Email: ");
        angajat1.setEmail(scanner.nextLine());
        System.out.println();
        System.out.print("Salar (pe ora): ");
        angajat1.setHourRate(scanner.nextInt());
        System.out.println();
        System.out.print("Ore muncite (pe zi): ");
        angajat1.setCapacity(scanner.nextInt());
        System.out.println();
        System.out.print("Zile libere: ");
        angajat1.setFreeDays(scanner.nextInt());
        System.out.println("\n");
        angajat1.calculateMonthlyIncome();
    }
}
