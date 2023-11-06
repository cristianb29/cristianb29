/*

Scrieti un program care afiseaza sirul Fibonnaci pana la un nr N citit de la tastatura.
N = 20
0 1 1 2 3 5 8 13

*/

package Lab3Tema231106;

import java.util.Scanner;

public class L3E3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1=0, n2=1, n3;
        System.out.print("N = ");
        Integer N = scanner.nextInt();
        while (N<1){
            System.out.println("\nNumarul \"N\" trebuie sa fie cel putin \"1\". Incercati din nou.");
            System.out.print("N = ");
            N = scanner.nextInt();
        }
        System.out.print(n1 + " " + n2);
        while (true){
            n3 = n1 + n2;
            if (n3<=N)
                System.out.print(" " + n3);
            else
                break;
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
