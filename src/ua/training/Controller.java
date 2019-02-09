package ua.training;

import ua.training.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void processUser() {

        view.printInvitation();

        getAndValidateInData(view.FIRST_INPUT_PART);
        getAndValidateInData(view.SECOND_INPUT_PART);

        view.printMessage(model.makeSentence(view.FIRST_INPUT_PART, view.SECOND_INPUT_PART));
    }

    void getAndValidateInData(String comparasion) {

        Scanner scanner = new Scanner(System.in);
        boolean isInputWrong = true;

        while (isInputWrong) {
            if (scanner.nextLine().equals(comparasion)) {
                isInputWrong = false;
            } else {
                view.printWarning();
            }
        }
    }
}
