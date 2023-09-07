public class Main {
    public static void main(String[] args) {

        // Create a Persian Cat object
        Cat persian = new Cat(true, false, "Persian cat", "Grooms Itself", 4, "Not Territorial");

        // Creating a British Shorthair cat object
        Cat britishShorthair = new Cat(true, false, "British Shorthair","Need's grooming", 5,"Territorial");

        //Creating a Ragdoll cat object
        Cat ragdoll = new Cat(true, false, "Ragdoll", "Grooms Itself", 2,"not territorial");



        // Create a pitBull Dog object
        Dog pitBull = new Dog("Pitbull", "Can be trained", "Can be domesticated", true, false);

        // Create a Bulldog  Dog object
        Dog bulldog = new Dog("Bulldog", "Can be trained", "Can be domesticated", true, false);

        // Create a poodle Dog object
        Dog poodle = new Dog("Poodle", "Can be trained", "Can be domesticated", true, false);

        // Print information about the Persian Cat
        System.out.println("Type of Cat: " + "\n");
        System.out.println(persian + "\n");

        // Print information about the British Shorthair Cat
        System.out.println("Type of Cat: " + "\n");
        System.out.println(britishShorthair + "\n");

        // Print information about the Ragdoll Cat
        System.out.println("Type of Cat: " + "\n");
        System.out.println(ragdoll + "\n");

        // Print information about the Dog
        System.out.println("Type of Dog: "+"\n");
        System.out.println(pitBull + "\n");

        // Print information about the Dog
        System.out.println("Type of Dog: "+"\n");
        System.out.println(bulldog + "\n");

        // Print information about the Dog
        System.out.println("Type of Dog: "+"\n");
        System.out.println(poodle + "\n");
    }
}

