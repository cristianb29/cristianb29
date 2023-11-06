/*
Scrieti o metoda care primeste ca parametru un string
afiseaza caracterul/caracterele din mijloc. Daca cuvantul
are numar par de litere, mijlocul e format din 2 litere,
daca cuvantul are numar impar de litere, mijlocul e format
dintr-o singura litera.

Exemplu:
Input: masina
Output: si

Input: reptila
Output: t
*/

package Lab4Tema231106;

public class L4E1 {
    public static void main(String[] args) {
        mijloc("lustra");
        mijloc("saizeci");
    }

    public static void mijloc(String cuvantMij) {

        int lungCuv = cuvantMij.length();
        if (lungCuv % 2 == 0) {
            System.out.println(cuvantMij.charAt((lungCuv / 2) - 1) + "" + cuvantMij.charAt(lungCuv / 2));
        }
        else {
            System.out.println(cuvantMij.charAt(lungCuv / 2));
        }
    }
}
