public class AmountLargerThanBalanceException extends Exception{
    public AmountLargerThanBalanceException() {
        super("Please input a amount less than balance");
    }
}
