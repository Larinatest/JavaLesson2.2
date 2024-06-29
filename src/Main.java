public class Main {
    public static void main(String[] args) {
        // Стоимость билета в рублях
        int ticketPrice = 13676;

        // Количество бонусных миль за каждые 20 рублей
        int milesPer20Rub = 1;

        // Вычисление количества бонусных миль
        int bonusMiles = ticketPrice / 20 * milesPer20Rub;

        // Вывод результата
        System.out.println("За билет стоимостью " + ticketPrice + " рублей начисляется " + bonusMiles + " бонусных миль.");
    }
}
