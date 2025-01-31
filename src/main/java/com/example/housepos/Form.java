package com.example.housepos;

import com.example.housepos.Database.Database;
import com.example.housepos.tabs.AddItemTab;
import com.example.housepos.tabs.RemoveItem;
import com.example.housepos.tabs.StatisticsTab;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.IOException;


public class Form extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        //Build a MenuBar
        MenuBar menu = new MenuBar();
        //Build menu items
        Menu fileMenu = new Menu("File");
        Menu creditsMenu = new Menu("Credits");
        MenuItem exit = new Menu("Exit");
        exit.setOnAction(e->System.exit(0));
        //add the menu item to the menu bar
        fileMenu.getItems().add(exit);
        menu.getMenus().addAll(fileMenu, creditsMenu);
        //Create a TabPane
        TabPane tabPane = new TabPane();
        //Create the tabs
        AddItemTab addItemTab = AddItemTab.getInstance();
        addItemTab.setClosable(false);
        RemoveItem removeItemTab = RemoveItem.getInstance();
        removeItemTab.setClosable(false);
        StatisticsTab statisticsTab = StatisticsTab.getInstance();
        statisticsTab.setClosable(false);
        //Add the tabs to the TabPane
        tabPane.getTabs().addAll(addItemTab, removeItemTab, statisticsTab);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        //Set the top of the BorderPane to the menubar
        root.setTop(menu);
        root.setCenter(tabPane);
        //Set the center of the BorderPane to the TabPane

        Database db = Database.getInstance();
        Scene scene = new Scene(root, 700, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}