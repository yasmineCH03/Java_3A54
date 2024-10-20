package entities.Animals;

import entities.Animal;

public class aquatic extends Animal {
    private String habitat;


    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public aquatic() {
        super();
        this.habitat = "";
    }
    public aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
   public void displayAnimal() {
        super.displayAnimal();
        System.out.println("Habitat: " + habitat);
   }
}
