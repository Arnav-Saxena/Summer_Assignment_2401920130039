import java.util.Random;

// Abstract base class representing a rail coach compartment
abstract class Compartment {
    public abstract String notice();
}

// Subclasses overriding the notice method
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Comfort and privacy guaranteed.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved strictly for female passengers.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Open seating for general ticket holders.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment: For heavy baggage transport only.";
    }
}

// Test class demonstrating polymorphic behavior
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        // Instantiate compartments randomly (1 to 4)
        for (int i = 0; i < compartments.length; i++) {
            int randomNum = rand.nextInt(4) + 1; // Generates 1, 2, 3, or 4
            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Invoke notice() on each to check polymorphism
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + " Notice: " + compartments[i].notice());
        }
    }
}