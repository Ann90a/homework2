

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

        int population = 12_000_000;
        int birthRatePerYear = 17;
        int mortality = 8;
        int difference = birthRatePerYear - mortality;
        int forQuantity = 1000;
        int i = 0;
        while (i < 10) {
            i++;
            population += population * difference / forQuantity;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }



    }
}
