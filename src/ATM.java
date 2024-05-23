public class ATM {
    float balance = 100000000;

    public float widthdraw(float amount)
            throws AmountLargerThanBalanceExeption, AmountLessThanZeroException {
        if (amount > balance) {
            throw new AmountLargerThanBalanceExeption();
        }
        if (amount <= 0) {
            throw new AmountLessThanZeroException();
        }
        return balance -= amount;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.widthdraw(-1);
        } catch (AmountLargerThanBalanceExeption e) {
            System.out.println(e.getMessage());
        } catch (AmountLessThanZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
