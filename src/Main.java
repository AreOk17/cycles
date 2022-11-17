public class Main {
    public static void main(String[] args) {
        int mounth = 0;
        int vznos  = 15000;
        int sum = (vznos / 100) * 7;
        while (sum < 12_000_000) {
            sum = sum + (sum / 100) * 7;
            mounth = mounth + 1;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " cумма накоплений " + sum);
            }

        }
    }
}