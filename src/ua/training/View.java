package ua.training;

public class View {

    public static final String INVITATION = "Type your data, please!";
    public static final String FIRST_INPUT_PART = "Hello";
    public static final String SECOND_INPUT_PART = "world!";
    public static final String WRONG_INPUT = "Wrong input! Repeat please!";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printInvitation() {
        System.out.println(INVITATION);
    }

    public void printWarning() {
        System.out.println(WRONG_INPUT);
    }

}
