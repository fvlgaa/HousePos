package com.example.housepos.tabs;


import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class RemoveItem extends Tab {

    private static RemoveItem instance;

    public RemoveItem() {
        this.setText("Remove Item");
        BorderPane root = new BorderPane();

        // Create form elements for removing a new property
        VBox form = new VBox(10); // 10 is the spacing between elements
        form.setPadding(new Insets(10, 10, 10, 10));
    }

    public static RemoveItem getInstance() {
        if(instance == null){
            instance = new RemoveItem();
        }
        return instance;
    }
}
