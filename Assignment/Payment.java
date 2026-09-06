public class Payment {

    public void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }

    public static void main(String[] args) {

        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {
            100, 50, 200, 75, 120
        };

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            if (payments[i] instanceof CardPayment) {

                CardPayment cardPayment =
                        (CardPayment) payments[i];

                double charged =
                        cardPayment.payWithProcessingFee(amounts[i]);

                totalCollected = totalCollected + charged;

            } else {

                payments[i].pay(amounts[i]);

                totalCollected =
                        totalCollected + amounts[i];
            }
        }

        System.out.println(
                "Total Collected: Rs " + totalCollected);
    }
}

class CardPayment extends Payment {

    public double payWithProcessingFee(double amount) {

        double total = amount + (amount * 0.02);

        System.out.println(
                "Charged (card, incl. fee): Rs " + total);

        return total;
    }
}
