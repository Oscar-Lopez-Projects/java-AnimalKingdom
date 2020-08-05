package animal;

//importing packages

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<AbstractAnimal> filteredList = new ArrayList<>();

    public static void filterAnimal(List<AbstractAnimal> animal, InterfaceCheck tester){

        // start with a fresh filteredList
        filteredList.clear();
        for (AbstractAnimal v : animal) {
            if (tester.test(v)) {
                filteredList.add(v);
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("******Birds*******");
        //Birds
        Birds pigeon = new Birds("pigeon",1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        //Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        //Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals ("Koala", 1816);
        Mammals sloth = new Mammals ("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        //spacing
        System.out.println("\n");
        List<AbstractAnimal> myList= new ArrayList<>();
        myList.add(panda);
        myList.add(koala);
        myList.add(sloth);
        myList.add(raccoon);
        myList.add(armadillo);
        myList.add(toucan);
        myList.add(swan);
        myList.add(salmon);
        myList.add(parrot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(zebra);
        myList.add(perch);
        myList.add(catfish);
        myList.add(bigfoot);

        System.out.println("\n ***sorting*** in descending order by year***");
        myList.sort((v1,v2)->v2.getYear()-(v1.getYear()));
        System.out.println(myList);


        System.out.println("\n ***Listing all animals alphabetically***");
        myList.sort((v1,v2)->v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(myList);

        System.out.println("\n ***List all the animals order by how they move***");
        myList.sort((v1,v2)->v1.move().compareToIgnoreCase(v2.move()));
        System.out.println(myList);

        System.out.println("\n **** List only those animals the breath with lungs  ****");
        filterAnimal(myList, a -> (a.breathe()=="Lungs"));
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

        System.out.println("\n ***List only those animals that breath with lungs and were named in 1758 ***");
        filterAnimal(myList, a -> (a.breathe()=="Lungs")&&a.getYear()==1758);
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

        System.out.println("\n **** List only those animals that lay eggs and breath with lungs ****");
        filterAnimal(myList, a -> (a.reproduce()=="Eggs")&&a.breathe()=="Lungs");
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

        System.out.println("\n ****  List alphabetically only those animals that were named in 1758  *****");
        filterAnimal(myList, a -> a.getYear()==1758);
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

    }
}
