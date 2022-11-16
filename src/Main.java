

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






    }
}