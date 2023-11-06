/*
Creati o clasa java numita Dog, cu proprietatile name si breed,
pentru clasa Dog creati un constructor care initializeaza cele
2 proprietati, de asemenea creati si getter si setter pentru
proprietati. In clasa Main, creati 2 instante ale clasei Dog
folosind constructorul de mai sus, apoi modificati proprietatile
folosind setter-ele si afisati modificarile folosind getter-ele.
*/

package Lab4Tema231106;

public class L4E3 {
    public static void main(String[] args){
        Dog caine1 = new Dog("Rex", "Golden Retriever");
        Dog caine2 = new Dog("Mishka", "Husky");
        //Inainte de modificare
        System.out.println("Caine 1: " + caine1.getName());
        System.out.println("Rasa caine 1: " + caine1.getBreed() + "\n");
        System.out.println("Caine 2: " + caine2.getName());
        System.out.println("Rasa caine 2: " + caine2.getBreed() + "\n");
        caine1.setName("Max");
        caine1.setBreed("Labrador");
        caine2.setName("Leo");
        caine2.setBreed("Dalmatian");
        System.out.println("\nDupa modificari:");
        System.out.println("Caine 1: " + caine1.getName());
        System.out.println("Rasa caine 1: " + caine1.getBreed() + "\n");
        System.out.println("Caine 2: " + caine2.getName());
        System.out.println("Rasa caine 2: " + caine2.getBreed() + "\n");
    }
}
