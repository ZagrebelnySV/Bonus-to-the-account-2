public class Main {
    public static void main(String[] args) {
        int score = 150; // баланс до пополнения
        int depositAmount = 1020; // сумма пополнения баланса
        boolean replenishmentCondition = depositAmount >= 1000;
        int bonus = replenishmentCondition ? depositAmount / 100 : 0;
        System.out.println("Бонус за пополнение: " + bonus + "рублей");
        System.out.println("Итоговый счёт: " + (score + depositAmount + bonus) + "рублей");


    }
}
