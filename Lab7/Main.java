package Lab7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //problema1_var1();
        //problema1_var2();
        //problema2_var1();
        problema2_var2();
    }

    public static void problema1_var1() {
        List<Integer> numereZ = Arrays.asList(1, 25, 12, 2023);
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereZ.forEach(n -> {
            sum.set(sum.get() + n);
        });
        System.out.println("Media aritmetica: " + ((1.0 * sum.get()) / numereZ.size()));
    }

    public static void problema1_var2() {
        List<Integer> numereZ = Arrays.asList(1, 25, 12, 2023);
        double v = numereZ.stream()
                .mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println("Media aritmetica: " + v);
    }

    public static void problema2_var1() {
        List<String> nume = Arrays.asList("masina", "telefon", "pc");
        nume.forEach(s ->
        {
            nume.set(nume.indexOf(s), s.toUpperCase());
            //Alternativa pentru a[i] = a[i].toUpperCase();
        });
        System.out.println("Lista: " + nume);
    }

    public static void problema2_var2() {
        List<String> nume = Arrays.asList("masina", "telefon", "pc");
        List<String> list = nume.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Lista: " + list);
    }
}


