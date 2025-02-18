package penaltykick;

import penaltykick.controller.GameController;
import penaltykick.view.InputView;
import penaltykick.view.OutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        GameController gameController = new GameController(inputView, outputView);
        gameController.play();
    }
}
