package Lab4;

public class Lab04 {

    public static void main(String[] args)
    {
        //mijloc("masini");
        //mijloc("reptila");
        Person person1 = new Person();
        Profesor profesor1 = new Profesor();
        Student student1 = new Student();
        person1.setName("Mihai");
        person1.setAge(19);
        person1.setEmail("someone@example.com");
        profesor1.setName("Mirela");
        profesor1.setAge(48);
        profesor1.setEmail("mp@uoradea.ro");

    }
    public static void mijloc(String cuvantMij)
    {

        int lungCuv = cuvantMij.length();
        if (lungCuv % 2 == 0)
        {
            System.out.println(cuvantMij.charAt((lungCuv/2)-1) + "" + cuvantMij.charAt(lungCuv/2));
        }
        else
        {
            System.out.println(cuvantMij.charAt(lungCuv/2));
        }
    }
}
