public class Dog {
    // Attributes of the Dog class
    String breed;           // Stores the breed of the dog
    String trainability;    // Indicates trainability of the dog
    String domestication;   // Indicates domestication status of the dog
    boolean social;         // Indicates if the dog is social
    boolean solitary;       // Indicates if the dog is solitary

    // Constructor to initialize Dog objects
    public Dog(String breed, String trainability, String domestication, boolean social, boolean solitary) {
        this.breed = breed;
        this.trainability = trainability;
        this.domestication = domestication;
        this.social = social;
        this.solitary = solitary;
    }

    // Method to create a string representation of the Dog object
    @Override
    public String toString() {
        String output = "Breed: " + breed;
        output += "\nTrainability: " + trainability;
        output += "\nDomestication: " + domestication;
        output += "\nSocial: " + social;
        output += "\nSolitary: " + solitary;
        return output;
    }

    // Getter method to retrieve the breed of the dog
    public String getBreed(){
        return breed;
    }

    // Getter method to retrieve trainability information
    public String getTrainability(){
        return trainability;
    }
}
