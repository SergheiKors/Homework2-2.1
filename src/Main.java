// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int amount = 300; // сумма на счете
        int payment = 1500; // сумма пополнения
        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус: " + bonus);
        int total = amount + payment + bonus; // итоговая сумма
        System.out.println("Итого: " + total);
    }
}