

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


        // задание 3. полностью измененное, не смогла поменять в предыдущем

        int population1 = 12_000_000;
        int birthRatePerYear1 = 17;
        int mortality1 = 8;
        int difference1 = birthRatePerYear1 - mortality1;
        int forQuantity1 = 1000;
        int i = 0;
        while (i < 10) {
            i = i + 1;
            population1 += population1 * difference1 / forQuantity1;
            System.out.println("Год " + i + " численность населения составляет " + population1);

        }

    }
}