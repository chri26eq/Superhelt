public class Superhero {

    //Attributter
    private String name;
    private String realName;
    private String superpower;
    private int yearCreated;
    private boolean isHuman;
    private int strength;

//Konstruktør


    public Superhero(String name, String realName, String superpower, int yearCreated, boolean isHuman, int strength) {
        this.name = name;
        this.realName = realName;
        this.superpower = superpower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

//Getters
    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getStrength() {
        return strength;
    }
}


