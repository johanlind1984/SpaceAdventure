package sample;

public class HardwareCreditCardReader {

    public static boolean requestSwipe() {
        return true;
    }

    public static int getCC() {
        return -1;
    }

    public static boolean requestPayment(int cardnumber, double price) {
        return true;
    }
}