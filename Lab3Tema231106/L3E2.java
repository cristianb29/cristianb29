//Se da un sir de numere intregi, afisati numerele care sunt prime.

package Lab3Tema231106;

public class L3E2 {
    public static void main(String[] args){
        int[] arr = {97, 18, 2, 1, 15, 29, 5};
        boolean prim=true;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]==0 || arr[i]==1)
            {
                continue; //Daca numarul este 0 sau 1, se merge la urmatoarea iteratie
            }
            for (int d=2; d<=arr[i]/2; d++)
                if (arr[i]%d==0) {
                    prim=false;
                    break; //Daca se gaseste cel putin un divizor, se iese din al 2-lea "for"
                }
            if (prim)
                System.out.print(arr[i] + " ");
            prim=true;
        }
        System.out.println();
    }
}
