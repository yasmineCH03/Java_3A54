package entities.Animals;


public class dolphin extends aquatic{
    float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public dolphin(){
        super();
        swimmingSpeed = 0.0f;
    }
    public dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);  // Calls Aquatic's parameterized constructor
        this.swimmingSpeed = swimmingSpeed;
    }
}
