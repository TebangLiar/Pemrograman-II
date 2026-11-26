package com;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "John", "123"),
                new Student(2, "Jane", "123"),
                new Student(3, "Jono", "124123"),
                new Student(4, "Agus", "1241234"),
                new Student(5, "Siti", "1241235"),
                new Student(6, "Budi", "1241236"),
                new Student(7, "Rina", "1241237"),
                new Student(8, "Dewi", "1241238"),
                new Student(9, "Andi", "1241239"),
                new Student(10, "Tono", "1241240")
        );

        studentTable.setItems(studentList);
    }
}