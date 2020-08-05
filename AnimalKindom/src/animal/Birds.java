package animal;

public class Birds extends AbstractAnimal{
    public Birds(String name, int year){
        //we are using super to be able to bring the data from abstract classes
        super(name,year);
    }
    //actions from AbstractAnimals override
    @Override
    String move() {
        return "Fly";
    }
    @Override
    String breathe() {
        return "Lungs";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    String reproduce() {
        return "Eggs";
    }
    @Override public String toString(){
        return "Bird: " + name + " " + move() + " " + breathe() + " " + year;
    }
}
