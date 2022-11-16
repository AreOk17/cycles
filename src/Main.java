public class Main {
    public static void main(String[] args) {
        int mounth = 0;
        int total = 0;
        int salary = 15000;
        while (total < 2_459_000) {
            total = total + salary;
            mounth = mounth + 1;
            System.out.println("Месяц " +mounth+ " сумма накоплений:" +total);
        }
    }
}