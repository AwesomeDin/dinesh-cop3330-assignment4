package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class theListController {
    //definitions for the observablelist of items

    //definitions for the textfields, filepath and filename

    //definitions for the table using hashmaps

    //definitions for the tab, creating new tabs

    //initialize the table using setCellValueFactory
    //update the fields to edit in the table itself

    public void tester() {
        System.out.println("hello");
    }

    @FXML
    public void buttonAddItem(ActionEvent actionEvent) {
        //adds a list item to the table
    }

    public void buttonRemoveItem(ActionEvent actionEvent) {
        //check to see if row was selected
        //removes a listitem from the table
        //refresh the table
    }

    public void buttonChangeStatus(ActionEvent actionEvent) {
        //check to see if row was selected
        //change status to "complete" or "incomplete"
        //refresh the table
    }

    public void buttonShowIncomplete(ActionEvent actionEvent) {
        //create a new ObservableList
        //if the status is incomplete add to the new list
        //refresh the table with that new list
    }

    public void buttonShowComplete(ActionEvent actionEvent) {
        //create a new ObservableList
        //if the status is complete add to the new list
        //refresh the table with that new list
    }
    public void buttonShowAll(ActionEvent actionEvent) {
        //The status does not matter
        //refresh the table with the full list
    }

    public void buttonImportList(ActionEvent actionEvent) {
        //get external text file
        //import that textfile into the table of the current tab
    }

    public void buttonExportList(ActionEvent actionEvent) {
        //export current tab table as text file
    }

    public void buttonChangeTitle(ActionEvent actionEvent) {
        //Changes title of the current tabbed list
    }

    public void buttonNewTab(ActionEvent actionEvent) {
        //creates a new tab by creating a new list with the same format
        //allows for management of multiple individual lists
    }

    public void buttonClearList(ActionEvent actionEvent) {
        //allows the removal of an existing list
    }
}