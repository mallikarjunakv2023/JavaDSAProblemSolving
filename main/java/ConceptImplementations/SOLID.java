package ConceptImplementations;

public class SOLID {
    // Liskov Substitution Principle (LSP)
    // Create a base class and derived classes that can be used interchangeably
    public static class Bird {
        private void fly() {
            System.out.println("Bird is flying");
        }
    }
    public static class Sparrow extends Bird {
//        @Override
//        public void fly() {
//            System.out.println("Sparrow is flying");
//        }

        public void chirp() {
            System.out.println("Sparrow is chirping");
        }
    }

    // Demonstrate LSP voilation
    public static class Penguin extends Bird {
        // Penguins cannot fly, so we do not override the fly method
        // This violates LSP because Penguin cannot be used interchangeably with Bird
        public void swim() {
            System.out.println("Penguin is swimming");
        }
    }

    // Create a main method to demonstrate LSP
    public static void main(String[] args) {
        Bird myBird = new Sparrow();
        myBird.fly(); // Output: Sparrow is flying

        // Demonstrating LSP with a different bird
        Bird anotherBird = new Penguin(); // This will break LSP because Penguin cannot fly and does
        // not override the fly method, though it still runs without error
        anotherBird.fly(); // Output: Bird is flying

        //


    }
}
