package animal;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int year){
        super(name,year);
    }

    @Override
    String getName() {
        return name;
    }
    @Override
    int getYear() {
        return year;
    }
    @Override
    String move() {
        return "Walk";
    }
    @Override
    String breathe() {
        return "Lungs";
    }
    @Override
    String reproduce() {
        return "Live Birth";
    }
    @Override public String toString(){
        return "Mammals: " + name + " " + move() + " " + breathe() + " " + year;
    }
}
