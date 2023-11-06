/*
Creati o clasa Rectangle cu proprietarile width si length,
creati gettere si settere si metode care calculeaza aria
respectiv perimetrul.
*/

package Lab4Tema231106;

import java.util.Scanner;

public class L4E4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Rectangle dreptunghi = new Rectangle();
        System.out.println("Introduceti lungimile unui dreptunghi:");
        System.out.print("L = ");
        dreptunghi.setLength(scanner.nextInt());
        System.out.print("l = ");
        dreptunghi.setWidth(scanner.nextInt());
        System.out.println("\nPerimetrul dreptunghiului este: " + calcPerimetru(dreptunghi.getLength(), dreptunghi.getWidth()));
        System.out.println("Aria dreptunghiului este: " + calcAria(dreptunghi.getLength(), dreptunghi.getWidth()));
    }

    public static int calcAria(Integer L, Integer l){
        return L*l;
    }

    public static int calcPerimetru(Integer L, Integer l){
        return (2*l)+(2*L);
    }

}
