/*

Gasiti elementele comune din 2 siruri
Exemplu:
    a={"java","test","university"}
    b={"car,"university","plane"}
--> university

*/

package Lab3Tema231106;

public class L3E1 {
    public static void main(String[] args) {
        boolean exista=false;
        String[] a={"casa", "usa", "fereastra"};
        String[] b={"masina", "casa", "apartament"};
        for(int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i].equals(b[j])) {
                    exista=true;
                    System.out.println(a[i]);
                }
            }
        }
        if (!exista){
            System.out.println("Nu exista cuvinte comune!");
        }

    }

}
