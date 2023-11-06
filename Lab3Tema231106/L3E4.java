// Scrieti un program care verifica daca un cuvant este palindrom.

package Lab3Tema231106;

import java.util.Scanner;

public class L3E4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrome=true;
        int ultimaLitera;
        System.out.print("Introduceti un cuvant: ");
        String cuvant = scanner.nextLine();
        System.out.println();
        for (int i=0; i<cuvant.length()/2; i++){
            ultimaLitera = cuvant.length()-(i+1);
            if (cuvant.charAt(i) != cuvant.charAt(ultimaLitera)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Cuvantul \"" + cuvant + "\" este un palindrom.");
        else
            System.out.println("Cuvantul \"" + cuvant + "\" NU este un palindrom.");
    }
}
