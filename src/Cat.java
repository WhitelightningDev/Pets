public class Cat {
    // Attributes of the Cat class
    boolean solitary;           // Indicates if the cat is solitary
    boolean social;             // Indicates if the cat is social
    String breed;               // Stores the breed of the cat
    String grooming;            // Stores information about grooming habits
    int climbingAbility;        // Stores the cat's climbing ability
    String territorial;         // Indicates if the cat is territorial

    // Constructor to initialize Cat objects
    public Cat(boolean solitary, boolean social, String breed, String grooming, int climbingAbility, String territorial) {
        this.solitary = solitary;
        this.social = social;
        this.breed = breed;
        this.grooming = grooming;
        this.climbingAbility = climbingAbility;
        this.territorial = territorial;
    }

    // Method to create a string representation of the Cat object
    public String toString(){
        String output = "Breed: " + breed;
        output += "\nGrooming: " + grooming;
        output += "\nIs Social: " + social;
        output += "\nIs Solitary: " + solitary;
        output += "\nClimbing Ability: " + climbingAbility;
        output += "\nIs Territorial: " + territorial;
        return output;
    }

    // Getter method to retrieve the breed of the cat
    public String getBreed(){
        return breed;
    }

    // Getter method to retrieve territorial information
    public String getTerritorial(){
        return territorial;
    }

    // Getter method to check if the cat is social
    public boolean isSocial(){
        return social;
    }

    // Getter method to check if the cat is solitary
    public boolean isSolitary() {
        return solitary;
    }
}
