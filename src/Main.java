public class Main {
    public static void main(String[] args) {
        int mounth = 0;
        int vkladvasilia  = 15000;
int procentpovklady = (vkladvasilia / 100) * 7;
        while (vkladvasilia < 12_000_000) {
            vkladvasilia = vkladvasilia + procentpovklady;
            mounth = mounth + 1;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " +mounth + "cумма накоплений " + vkladvasilia);
            }

        }
    }
}