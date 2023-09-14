import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> database = new ArrayList<Superhero>();
    private String searchCriteria;


//Getters


    //Setters
    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }


    // Tilføj superhelt til database
    public void addSuperhero(String name, String realName, String superpower, int yearCreated, boolean isHuman, int strength) {
        database.add(new Superhero(name, realName, superpower, yearCreated, isHuman, strength));
    }


//Printmetode










    // Print database
    public String toString() {
        StringBuilder databaseText = new StringBuilder();
        for (Superhero i : database) {
            databaseText.append("\nName: ").append(i.getName()).
                    append("\nReal name: ").append(i.getRealName()).
                    append("\nSuperpower: ").append(i.getSuperpower()).
                    append("\nYear created: ").append(i.getYearCreated()).
                    append("\nIs human: ").append(i.isHuman() ? "Yes" : "No").
                    append("\nStrength: ").append(i.getStrength()).append("\n");

        }
        return databaseText.toString();
    }


//Søgemetode
    public Superhero searchSuperhero() {

        Superhero result = null;
        for (Superhero i : database) {
            if (i.getName().toLowerCase().contains(searchCriteria.toLowerCase())) {
                result = i;
                break;
            } else result = null;

        }return result;
    }


}
