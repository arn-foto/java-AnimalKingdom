package animalkingdomApp;


// This interface that has one method. It’s one method will take as a parameter an 
// object of the data type we wish to check. The method will be implemented using a lambda expression

public interface CheckAnimal 
{
    boolean test(AbstractAnimal a);
}