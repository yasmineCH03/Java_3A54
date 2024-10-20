package entities.Animals;

import entities.Animal;

public class terrestrial extends Animal {
    private int nbrLegs;
    public int getNbrLegs() {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public terrestrial() {
        super();
        this.nbrLegs = 0;
    }
    public terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }


}
