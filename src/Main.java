

public class Main {
    public static void main(String[] args) {

        //задание 1

        int weHave = 0;
        int accumulate = 2_459_000;
        int monthlyPayment = 15000;
        int month = 0;
        while (weHave < accumulate) {
            weHave = weHave + weHave / 100;
            weHave = weHave + monthlyPayment;
            month = month + 1;
        }
        System.out.println("Месяц " + month + " , сумма накоплений равна " + weHave + " рублей");

        //задание 2

        int a = 0;
        int b = 10;
        while (a < b) {
            a = a + 1;
            System.out.print(a + " ");
        }

        System.out.println();

        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }

        System.out.println();

        //задание 3
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // принимая во внимание, что показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "

        int population = 12_000_000; // чосленность начеления общая
        int birthRatePerYear = 17;   // рождаемость за год
        int mortality = 8;           // смертность
        int forQuantity = 1000;      // на количество - на тысячу
        int i = 0;                   // года от 1 до 10

        int birthSpeedPerYear = population / forQuantity * birthRatePerYear;
        int deathSpeedPerYear = population / forQuantity * mortality;
        int resultSpeedPerYear = birthSpeedPerYear - deathSpeedPerYear;
        while (i < 10) {
            i = i +1;
            population = population + resultSpeedPerYear;
            System.out.println("Год " + i + " , численность населения составляет  " + population);
        }
             // 0 < 10
            // 12_000_000 + 12_000_000 / 1_000 * 17 - 12_000_000 / 1_000 * 8
        }

    }
