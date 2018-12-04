package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private CheckBox outCheckBox;
    @FXML
    private Label ourLabel;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
//    to assign the text field it created from the fxml to the name field instance variable
//    and the way we do that is we annotate the instance variable declaration with
//    the @fxml in the controller code
    @FXML
    private TextField nameField;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the: " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I'm going to sleep on the: " + s);
                            ourLabel.setText("We did something!");
                        }
                    });
                } catch (InterruptedException event) {
                    // we don't care about it
                }
            }
        };

        new Thread(task).start();

        if (outCheckBox.isSelected()) {
            nameField.clear();
            initialize();
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    @FXML
    public void handleChange() {
        System.out.println("The checkbox is " + (outCheckBox.isSelected() ? "checked" : "not checked"));
    }

}

//typically the life cycle of a UI program is as follows you will run the
//initialization code it will then build the main user interface and it will then
//wait for user input when the user does something for example pressing a
//button or typing something into a field
//or perhaps selecting a menu item the application will run the code that handles
//that particular event based on what the user has actually done what they have click or
//what they interacted with the controller on the screen so its gonna run
//event handler for that particular event when the user closes the main window
//or indicates that in some other way that they like to exit the application any cleanup
//code will run and the application will then exit at that point