package animal;

abstract class AbstractAnimal {

    //setting up variables
    private static int maxId=-1;
    protected int id;
    int year;
    String name;

    //Now setting up the constructor

    public AbstractAnimal(String name, int year){
        maxId++;
        this.name=name;
        this.id= maxId;
        this.year=year;
    }
    //getting data
    public int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getYear(){
        return year;
    }
    //actions they can do
    abstract String move();
    abstract String breathe();
    abstract String reproduce();
}
