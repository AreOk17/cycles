public class Main {
    public static void main(String[] args) {
       int vznos = 15000;
       int procentpovklady = 7;
       int mounth = 1;
       int summavznosa = (vznos / 100) * procentpovklady;
        System.out.println(summavznosa);
        int summavklada = vznos + summavznosa;
        System.out.println(summavklada);
        while (mounth <= 108) {
            vznos = vznos + summavznosa;
            mounth = mounth +1;
            if ( mounth % 6 == 0) {
                System.out.println("месяц: " +mounth+ " Cумма накоплений: " +vznos);
            }
        }
       }
    }