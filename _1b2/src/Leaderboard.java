public class Leaderboard {
    /**
     * Das Programm gibt eine Tabelle mit vier Zeilen und drei Spalten aus. Der Name der Tabelle ist Leaderboard.
     * @author leddis08
     * @version 2023-12-19
     */
    public static void main(String[] args) {
        int ranking1 = 1;
        String name1 = "Ralph";
        int ergebnis1 = 100;
        int ranking2 = 2;
        String name2 = "Sonja";
        int ergebnis2 = 90;
        int ranking3 = 3;
        String name3 = "Tobias";
        int ergebnis3 = 80;

        System.out.println("LEADERBOARD");
        for(int counter = 0; counter < 10; counter ++) {
            System.out.print("*");
        }
        System.out.println(' ');

        System.out.println("Ranking \t\t Name \t Ergebnis");

        System.out.println(ranking1 + "\t\t\t" + name1 + "\t" + ergebnis1);

        System.out.println(ranking2 + "\t\t\t"+ name2 + "\t" + ergebnis2);

        System.out.println(ranking3 + "\t\t\t" + name3 + "\t" + ergebnis3);

        for(int counter = 0; counter < 10; counter ++) {
            System.out.print("*");
        }
    }
}
