public class ATM {
    float balance = 10000000;

    public float withdraw(float amount) throws NegativeException,AmountLargerThanBalanceException {
        if (amount <= 0) {
            throw new NegativeException();
        }
        if (amount > balance) {
            throw new AmountLargerThanBalanceException();
        }

        return balance -= amount;
    }
}
