package com.example.housepos.tabs;

import com.example.housepos.Database.DBConst;
import com.example.housepos.Database.Database;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class AddItemTab extends Tab {
    private static AddItemTab instance;
    private Database database = Database.getInstance();
    private Connection connection = database.getConnection();

    public AddItemTab() {
        this.setText("Add Property");
        BorderPane root = new BorderPane();

        // Create form elements for adding a new property
        VBox form = new VBox(10); // 10 is the spacing between elements
        form.setPadding(new Insets(10, 10, 10, 10));

        Text title = new Text("Add New Property");
        title.setFont(new Font(18));

        TextField propertyIdField = new TextField();
        propertyIdField.setPromptText("Property ID");

        TextField propertyNameField = new TextField();
        propertyNameField.setPromptText("Property Name");

        TextField locationField = new TextField();
        locationField.setPromptText("Location");

        ComboBox<String> typeComboBox = new ComboBox<>();
        typeComboBox.getItems().addAll("Apartment", "Condo", "Loft", "House", "Cottage", "Cabin", "Suite");
        typeComboBox.setPromptText("Type");

        TextField monthlyRentField = new TextField();
        monthlyRentField.setPromptText("Monthly Rent");

        ComboBox<String> availabilityComboBox = new ComboBox<>();
        availabilityComboBox.getItems().addAll("Available", "Rented");
        availabilityComboBox.setPromptText("Availability");

        Button submitButton = new Button("Submit");

        // Add elements to form
        form.getChildren().addAll(
                title,
                new Label("Property ID"), propertyIdField,
                new Label("Property Name"), propertyNameField,
                new Label("Location"), locationField,
                new Label("Type"), typeComboBox,
                new Label("Monthly Rent"), monthlyRentField,
                new Label("Availability"), availabilityComboBox,
                submitButton
        );

        root.setCenter(form);
        this.setContent(root);

        // Event handling for the Submit button
        submitButton.setOnAction(event -> {
            try {
                String query = "INSERT INTO " + DBConst.PROPERTY_TABLE + " (" +
                        DBConst.PROPERTY_ID + ", " +
                        DBConst.PROPERTY_NAME + ", " +
                        DBConst.PROPERTY_LOCATION + ", " +
                        DBConst.PROPERTY_TYPE + ", " +
                        DBConst.PROPERTY_MONTHLY_RENT + ", " +
                        DBConst.PROPERTY_AVAILABILITY + ") VALUES (?, ?, ?, ?, ?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, Integer.parseInt(propertyIdField.getText()));
                preparedStatement.setString(2, propertyNameField.getText());
                preparedStatement.setString(3, locationField.getText());
                preparedStatement.setString(4, typeComboBox.getValue());
                preparedStatement.setDouble(5, Double.parseDouble(monthlyRentField.getText()));
                preparedStatement.setString(6, availabilityComboBox.getValue());

                preparedStatement.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Property Added");
                alert.setHeaderText(null);
                alert.setContentText("New property has been added successfully.");
                alert.showAndWait();
            } catch (Exception e) {
                e.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("An error occurred while adding the property.");
                alert.showAndWait();
            }
        });
    }


    public static AddItemTab getInstance() {
        if (instance == null) {
            instance = new AddItemTab();
        }
        return instance;
    }
}
