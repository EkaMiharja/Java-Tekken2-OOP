class Fighter { // CLASS
    String name = ""; // ATTRIBUTE
    String fightingStyle = ""; // ATTRIBUTE
    String hobby = ""; // ATTRIBUTE
}

public class tekken2 {
    public static void main(String[] args) {

        // MASUKKAN DATA
        Fighter lee = new Fighter();
        lee.name = "Lee Chaolan"; // LEE CHAOLAN
        lee.fightingStyle = "Martial Arts combined with Mishima Style Fighting Karate";
        lee.hobby = "Kick-scooter parading";

        Fighter lei = new Fighter();
        lei.name = "Lei Wulong"; // LEI WULONG
        lei.fightingStyle = "Five-form-based Chinese martial arts";
        lei.hobby = "Watching movies, taking naps";

        Fighter angel = new Fighter();
        angel.name = "Angel"; // ANGEL
        angel.fightingStyle = "Karate";
        angel.hobby = "Saving others souls from evil";

        Fighter jun_kazama = new Fighter();
        jun_kazama.name = "Jun Kazama"; // JUN KAZAMA
        jun_kazama.fightingStyle = "Kazama Style Traditional Martial Arts";
        jun_kazama.hobby = "Bird watching";

        Fighter anna_williams = new Fighter();
        anna_williams.name = "Anna Williams"; // ANNA WILLIAMS
        anna_williams.fightingStyle = "Kazama Style Traditional Martial Arts";
        anna_williams.hobby = "Travelling";

        Fighter alex = new Fighter();
        alex.name = "Alex"; // ALEX
        alex.fightingStyle = "Commando Wrestling";
        alex.hobby = "Commando Wrestling";

        Fighter armor_king = new Fighter();
        armor_king.name = "Armor King"; // ARMOR KING
        armor_king.fightingStyle = "Pro Wrestling";
        armor_king.hobby = "Challenging dojo leaders";

        Fighter kazuya_mishima = new Fighter();
        kazuya_mishima.name = "Kazuya Mishima"; // KAZUYA MISHIMA
        kazuya_mishima.fightingStyle = "Mishima Style Fighting Karate";
        kazuya_mishima.hobby = "Collecting Sneakers";

        Fighter heihachi_mishima = new Fighter();
        heihachi_mishima.name = "Heihachi Mishima"; // HEIHACHI MISHIMA
        heihachi_mishima.fightingStyle = "Mishima Style Fighting Karate";
        heihachi_mishima.hobby = "Collecting Geta Sandals";

        Fighter wong_jinrei = new Fighter();
        wong_jinrei.name = "Wong Jinrei"; // WONG JINREI
        wong_jinrei.fightingStyle = "Yi Liu He Quan";
        wong_jinrei.hobby = "Vegetable Gardening";

        // PRINT
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\t      TEKKEN 2 FIGHTER \t\t\t\t\t\t\t|");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|Nama \t\t\t|Fighting Style \t\t\t\t\t\t|Hobby \t\t\t\t|");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|" + lee.name + "\t\t|" + lee.fightingStyle + "\t|" + lee.hobby + "\t\t|");
        System.out.println("|" + lei.name + "\t\t|" + lei.fightingStyle + "\t\t\t\t|" + lei.hobby + "\t|");
        System.out.println(
                "|" + angel.name + "\t\t\t|" + angel.fightingStyle + "\t\t\t\t\t\t\t\t|" + angel.hobby + "\t|");
        System.out.println("|" + jun_kazama.name + "\t\t|" + jun_kazama.fightingStyle + "\t\t\t\t|" + jun_kazama.hobby
                + "\t\t\t|");
        System.out.println("|" + anna_williams.name + "\t\t|" + anna_williams.fightingStyle + "\t\t\t\t|"
                + anna_williams.hobby + "\t\t\t|");
        System.out.println("|" + alex.name + "\t\t\t|" + alex.fightingStyle + "\t\t\t\t\t\t|" + alex.hobby + "\t\t|");
        System.out.println("|" + armor_king.name + "\t\t|" + armor_king.fightingStyle + "\t\t\t\t\t\t\t|"
                + armor_king.hobby + "\t|");
        System.out.println("|" + kazuya_mishima.name + "\t\t|" + kazuya_mishima.fightingStyle + "\t\t\t\t\t|"
                + kazuya_mishima.hobby + "\t\t|");
        System.out.println("|" + heihachi_mishima.name + "\t|" + heihachi_mishima.fightingStyle + "\t\t\t\t\t|"
                + heihachi_mishima.hobby + "\t|");
        System.out.println("|" + wong_jinrei.name + "\t\t|" + wong_jinrei.fightingStyle + "\t\t\t\t\t\t\t|"
                + wong_jinrei.hobby + "\t\t|");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\t\t Thank you \t\t\t\t\t\t\t|");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------");

    }
}
