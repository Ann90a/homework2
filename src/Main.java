

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



    }
}