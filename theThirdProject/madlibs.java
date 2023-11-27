class MadLibs {
    public static void main(String[] args) {
        String adjective1 = " ";
        String noun1 = " ";
        String verb1 = " ";
        String adjective2 = " ";
        String noun2 = " ";
        String adverb = " ";
        String verb2 = " ";
        String adjective3 = " ";
        String noun3 = " ";
        String exclamation = " "; //add a ! to the end

        //////////////////////////////
        System.out.println("Welcome to Mad Libs!");
        System.out.println("Let's create a fun story together.");

        System.out.println("Once upon a time, there was a " + adjective1 + " " + noun1 + ".");
        System.out.println("This " + noun1 + " loved to " + verb1 + " " + adverb + " every day.");
        System.out.println("One day, a " + adjective2 + " " + noun2 + " appeared!");
        System.out.println("The " + noun2 + " challenged our hero to " + verb2 + " " + adjective3 + ".");
        System.out.println("Despite the odds, our " + adjective1 + " " + noun1 + " triumphed and found a hidden " + noun3 + ".");
        System.out.println("In the end, they exclaimed, "+ exclamation);

        System.out.println("Thanks for playing Mad Libs!");
    }
}