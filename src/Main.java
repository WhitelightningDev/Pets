public class Main {
    public static void main(String[] args) {

        // Create a Cat object
        Cat persian = new Cat(true, false, "Persian cat", "Grooms Itself", 4, "Not Territorial");

        // Create a Dog object
        Dog pitbull = new Dog("Pitbull", "Can be trained", "Can be domesticated", true, false);

        // Print information about the Cat
        System.out.println("Type of Cat: " + "\n");
        System.out.println(persian.toString() + "\n");

        // Print information about the Dog
        System.out.println("Type of Dog: "+"\n");
        System.out.println(pitbull.toString() + "\n");
    }
}
