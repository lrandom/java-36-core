public class AmountLargerThanBalanceExeption extends Exception {
    public AmountLargerThanBalanceExeption() {
        super("Amount is larger than balance");
    }
}
