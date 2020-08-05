package animal;

public class Fish extends AbstractAnimal{

    //The constructor with super
    public Fish(String name, int year){
        super(name, year);
    }
    //override methods
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
        return "swim";
    }
    @Override
    String breathe() {
        return "gills";
    }
    @Override
    String reproduce() {
        return "Eggs";
    }
    //override print display
    @Override public String toString(){
        return "Fish: " + name + " " + move() + " " + breathe() + " " + year;
    }
}
