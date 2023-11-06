/*
Scrieti o metoda care afiseaza suma cifrelor unui numar intreg
Exemplu:
Input: 254
Output: 11
*/
package Lab4Tema231106;

import java.util.Scanner;

public class L4E2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        Integer n = scanner.nextInt();
        System.out.println("\nSuma cifrelor numarului " + n + " este " + sumaCifre(n) + ".");
    }
    public static int sumaCifre(Integer numar){
        int s=0;
        while (numar > 0){
            s = s + numar%10;
            numar = numar/10;
        }
        return s;
    }
}
