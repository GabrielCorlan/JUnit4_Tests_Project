import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 3. Scrie un program care negociază salariul. Acesta te va întreba: “Iti voi plati {numar} euro, ok?”, începând de la 100. De câte
        // ori tu răspunzi: “mai mult”, programul incrementează numar cu 100. Dacă răspunzi “ok”, programul afișează: “Salariul tau
        // este {numar} euro.”

        Scanner scanner = new Scanner(System.in);
        int salariu = 100;

        while (true) {
            System.out.printf("Iti voi plati %s euro, ok?\n", salariu);
            String answer = scanner.nextLine();

            if (answer.equals("ok")) {
                System.out.printf("Salarul tau este %s euro!\n", salariu);
                break;
            } else if (answer.equals("mai mult")) {
                salariu += 100;
            } else {
                System.out.println("Raspuns invalid.");
            }
        }
    }
}
