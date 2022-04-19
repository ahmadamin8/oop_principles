package inheritance;

public class Food {

    //instance variables
    public static final boolean isTangible = true;
    String taste;
    String name;
    boolean isSpicy;
    private boolean isOrganic;

    public boolean isOrganic() {
        return isOrganic;
    }

    @Override
    public String toString() {
        return "Food{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic +
                '}';
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;

    }

}
