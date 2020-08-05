package animalkingdomApp;


// using this import for the arraylist
import java.util.ArrayList;

public class Main {
    public static void printAnimals(ArrayList<AbstractAnimal> animal, CheckAnimal tester)
     {
        for (AbstractAnimal a : animal) 
        {
            if (tester.test(a)) 
            {
                System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearDiscovered());
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animalCollection = new ArrayList<AbstractAnimal>();

        //Mammals
        animalCollection.add(new Mammal("Panda", 1869));
        animalCollection.add(new Mammal("Zebra", 1778));
        animalCollection.add(new Mammal("Koala", 1816));
        animalCollection.add(new Mammal("Sloth", 1804));
        animalCollection.add(new Mammal("Armadillo", 1758));
        animalCollection.add(new Mammal("Raccoon", 1758));
        animalCollection.add(new Mammal("Bigfoot", 2021));

        //Birds
        animalCollection.add(new Bird("Pigeon", 1837));
        animalCollection.add(new Bird("Peacock", 1821));
        animalCollection.add(new Bird("Toucan", 1758));
        animalCollection.add(new Bird("Parrot", 1824));
        animalCollection.add(new Bird("Swan", 1758));

        //Fish
        animalCollection.add(new Fish("Salmon", 1758));
        animalCollection.add(new Fish("Catfish", 1817));
        animalCollection.add(new Fish("Perch", 1758));

        //Lambda Functions  

        //1.  - using numbers with "a" to tell java which order to start from
        System.out.println();
        System.out.println(" *** List all the animals in descending order by year named ***");
        animalCollection.sort((a1, a2) -> a2.getyearDiscovered() - a1.getyearDiscovered());
        animalCollection.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getyearDiscovered()));

        //2.
        System.out.println();
        System.out.println("*** List all the animals alphabetically ***");
        animalCollection.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalCollection.forEach(animal -> System.out.println(animal.getName()));

        //3.
        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        animalCollection.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalCollection.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

        //4. - not using a number with "a" because I only wanted to print out animals with a certain trait, not in any order inparticular.
        System.out.println();
        System.out.println(" *** List only those animals the breath with lungs ***");
        printAnimals(animalCollection, a -> a.breath() == "lungs");

        //.5
        System.out.println();
        System.out.println(" *** List only those animals that breath with lungs and were named in 1758 ***");
        printAnimals(animalCollection, animal -> animal.breath().equals("lungs") && animal.getyearDiscovered() == 1758);

        //6.
        System.out.println();
        System.out.println(" *** List only those animals that lay eggs and breath with lungs ***");
        printAnimals(animalCollection, animal -> animal.breath().equals("lungs") && animal.reproduce().equals("eggs"));

        //.7
        System.out.println();
        System.out.println(" *** List alphabetically only those animals that were named in 1758 ***");
        animalCollection.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalCollection, animal -> animal.getyearDiscovered() == 1758);
    }

}