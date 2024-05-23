public class AmountLessThanZeroException extends Exception {
    public AmountLessThanZeroException() {
        super("Amount is less than zero");
    }
}
