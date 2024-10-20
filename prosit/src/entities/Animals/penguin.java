package entities.Animals;

public class penguin extends aquatic{
    private float swimmingDepth;
    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }
    public penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
}
