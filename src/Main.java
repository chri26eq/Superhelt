import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Database database = new Database();

        database.addSuperhero("Fat Fury", "Herbie Popnecker", "Flying, Invisibility, Zoolingualism, Time travel, Hypnotic eyes", 1958, true, 500);
        database.addSuperhero("Miracleman", "Michael \"Mike\" Moran", "Superhuman strength, Invulnerability, Telekinesis, Telepathy, Flight", 1954, true, 1000);
        database.addSuperhero("Madcap", "Unknown", "Healing factor, Insanity inducement", 1985, true, 400);
        database.addSuperhero("Atom Smasher", "Albert Rothstein", "Superhuman strength, Mass manipulation, Density control", 1996, true, 900);
        database.addSuperhero("Adam Warlock", "Adam Warlock", "Genius-Level Intelligence, Martial Arts", 1967, false, 700);


        StringBuilder menuMainTekst = new StringBuilder();
        menuMainTekst.append("\nWelcome to the Superhero Database.\n");
        menuMainTekst.append("1. Add superhero\n");
        menuMainTekst.append("2. View database\n");
        menuMainTekst.append("3. Search\n");
        menuMainTekst.append("4. Empty\n");
        menuMainTekst.append("5. Empty\n");
        menuMainTekst.append("6. Empty\n");
        menuMainTekst.append("7. Empty\n");
        menuMainTekst.append("8. Empty\n");
        menuMainTekst.append("9. Exit\n");

        String inputMenu;

        do {
            System.out.print(menuMainTekst);
            inputMenu = input.next();
            input.nextLine();
            switch (inputMenu) {
                case "1":
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Real Name: ");
                    String realName = input.nextLine();
                    System.out.print("Superpower: ");
                    String superpower = input.next();
                    System.out.print("Year Created: ");
                    int yearCreated = input.nextInt();
                    System.out.print("Is the superhero human? " + Farve.ANSI_GREEN + "Y" + Farve.ANSI_RESET + "es or " + Farve.ANSI_GREEN + "N" + Farve.ANSI_RESET + "o: ");
                    boolean isHuman;
                    input.nextLine();
                    while (true) {
                        String i = input.nextLine();
                        if (i.equalsIgnoreCase("y")) {
                            isHuman = true;
                            break;
                        } else if (i.equalsIgnoreCase("n")) {
                            isHuman = false;
                            break;
                        } else System.out.println("Select " + Farve.ANSI_GREEN + "Y" + Farve.ANSI_RESET + "es or " + Farve.ANSI_GREEN + "N" + Farve.ANSI_RESET + "o: ");
                    }

                    System.out.print("Strength: ");
                    int strength = input.nextInt();
                    database.addSuperhero(name, realName, superpower, yearCreated, isHuman, strength);
                    break;
                case "2":
                    System.out.println(database);
                    break;
                case "3":
                    System.out.print("Search criteria: ");
                    database.setSearchCriteria(input.nextLine());
                    Superhero i = (database.searchSuperhero());
                    if (i == null) {
                        System.out.println(Farve.ANSI_RED + "Nothing found" + Farve.ANSI_RESET);
                    } else {
                        StringBuilder supHerFound = new StringBuilder();
                        supHerFound.append("\nName: ").append(i.getName());
                        supHerFound.append("\nReal name: ").append(i.getRealName());
                        supHerFound.append("\nSuperpower: ").append(i.getSuperpower());
                        supHerFound.append("\nYear created: ").append(i.getYearCreated());
                        supHerFound.append("\nIs human: ").append(i.isHuman() ? "Yes" : "No");
                        supHerFound.append("\nStrength: ").append(i.getStrength()).append("\n");
                        System.out.println(supHerFound);
                    }
                    break;
                case "4":
                    ;
                    break;
                case "5":
                    ;
                    break;
                case "6":
                    ;
                    break;
                case "7":
                    ;
                    break;
                case "8":
                    ;
                    break;
                case "9":
                    ;
                    break;
                default:
                    System.out.println(Farve.ANSI_RED + "Select number between 1 and 9" + Farve.ANSI_RESET);
                    break;
            }
        } while (!inputMenu.equals("9"));
    }
}






