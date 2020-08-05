package animalkingdomApp;

// interfaces can implement other interfaces and can extend an abstract class.
public class Fish extends AbstractAnimal 
{
    public Fish(String name, int yearDiscovered)
     {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}