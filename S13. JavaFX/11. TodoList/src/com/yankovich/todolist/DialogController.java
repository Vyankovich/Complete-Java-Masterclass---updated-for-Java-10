package com.yankovich.todolist;

import com.yankovich.todolist.datamodel.TodoData;
import com.yankovich.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private DatePicker deadlinePicker;
    @FXML
    private TextArea detailsArea;
    @FXML
    private TextField shortDescriptionField;

    public TodoItem precessResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadLineValue = deadlinePicker.getValue();
        TodoItem newItem = new TodoItem(shortDescription, details, deadLineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
