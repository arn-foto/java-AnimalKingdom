package animalkingdomApp;

// interfaces can implement other interfaces and can extend an abstract class.
public class Mammal extends AbstractAnimal
 {
    public Mammal(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live birth";
    }
}