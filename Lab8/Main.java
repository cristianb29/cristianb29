package Lab8;

import org.w3c.dom.ls.LSInput;
//g
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        probl1();
        probl2();
        probl3();
    }

    public static void probl1(){
        List<Integer> nr = Arrays.asList(3, 19, 19, 2020, 11, 3, 11);
        List<Integer> duplicate = nr.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Lista introdusa fara duplicari: " + duplicate);
    }

    public static void probl2() {
        List<String> siruri = Arrays.asList("Caine", "Pisica", "Leu", "Leopard");
        Scanner cin = new Scanner(System.in);
        System.out.println("In program exista " + siruri.size() + " siruri.\nIntroduceti o litera si programul va numara cate siruri incep cu litera introdusa.");
        String caracterInc = cin.nextLine();
        int counter = (int) siruri.stream().filter(s -> s.startsWith(String.valueOf(caracterInc))).count();
        System.out.println(counter + " sir(uri) incep cu litera " + caracterInc);
    }

    public static void probl3() {
        List<Integer> lista = new ArrayList<Integer>();
        Scanner cin = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente: ");
        int marime = cin.nextInt();
        System.out.println("Introduceti elementele: ");
        for(int i=0; i<marime; i++) {
            lista.add(cin.nextInt());
        }
        Collections.sort(lista);
        System.out.println("Lista ordonata crescator: " + lista);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista ordonata descrescator: " + lista);
    }
}
