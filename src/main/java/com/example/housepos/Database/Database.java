package com.example.housepos.Database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.housepos.Database.Const.*;
import static com.example.housepos.Database.Const.DB_NAME;
import static com.example.housepos.Database.Const.DB_PASS;
import static com.example.housepos.Database.Const.DB_USER;
import static com.example.housepos.Database.DBConst.*;

public class Database {
    private static Database instance;
    private Connection connection = null;

    private Database() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.
                    getConnection("jdbc:mysql://localhost/"+ DB_NAME +
                                    "?serverTimezone=UTC",
                            DB_USER,
                            DB_PASS);
            System.out.println("Created Connection!");




            String createPropertyTableSQL = "CREATE TABLE " + DBConst.PROPERTY_TABLE + " (" +
                    DBConst.PROPERTY_ID + " INT PRIMARY KEY, " +
                    DBConst.PROPERTY_NAME + " VARCHAR(255), " +
                    DBConst.PROPERTY_LOCATION + " VARCHAR(255), " +
                    DBConst.PROPERTY_TYPE + " VARCHAR(50), " +
                    DBConst.PROPERTY_MONTHLY_RENT + " DECIMAL(10,2), " +
                    DBConst.PROPERTY_AVAILABILITY + " VARCHAR(50));";

            String createTenantTableSQL = "CREATE TABLE IF NOT EXISTS " + TENANT_TABLE + " (" +
                    TENANT_ID + " INT PRIMARY KEY, " +
                    TENANT_NAME + " VARCHAR(255), " +
                    TENANT_CONTACT_INFO + " VARCHAR(255), " +
                    TENANT_EMAIL + " VARCHAR(255), " +
                    TENANT_LOYALTY_POINTS + " INT);";
            String createPaymentsTableSQL = "CREATE TABLE IF NOT EXISTS " + PAYMENT_TABLE + " (" +
                    PAYMENT_ID + " INT PRIMARY KEY AUTO_INCREMENT, " +
                    PAYMENT_TENANT_ID + " INT, " +
                    PAYMENT_AMOUNT + " DECIMAL(10,2), " +
                    PAYMENT_DATE + " DATE, " +
                    PAYMENT_STATUS + " VARCHAR(50), " +
                    "FOREIGN KEY (" + PAYMENT_TENANT_ID + ") REFERENCES " + TENANT_TABLE + "(" + TENANT_ID + "));";

            String createLeaseTableSQL = "CREATE TABLE IF NOT EXISTS " + LEASE_TABLE + " (" +
                    LEASE_ID + " INT PRIMARY KEY AUTO_INCREMENT, " +
                    LEASE_PROPERTY_ID + " INT, " +
                    LEASE_TENANT_ID + " INT, " +
                    LEASE_START_DATE + " DATE, " +
                    LEASE_END_DATE + " DATE, " + " VARCHAR(50), " +
                    "FOREIGN KEY (" + LEASE_PROPERTY_ID + ") REFERENCES " + PROPERTY_TABLE + "(" + PROPERTY_ID + "), " +
                    "FOREIGN KEY (" + LEASE_TENANT_ID + ") REFERENCES " + TENANT_TABLE + "(" + TENANT_ID + "));";

            createTable(PROPERTY_TABLE, createPropertyTableSQL, connection);
            createTable(TENANT_TABLE, createTenantTableSQL, connection);
            createTable(PAYMENT_TABLE, createPaymentsTableSQL, connection);
            createTable(LEASE_TABLE, createLeaseTableSQL, connection);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable(String tableName, String tableQuery, Connection connection) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getTables(null, null, tableName, null);


        if (resultSet.next()) {
            System.out.println(tableName + " Table already exists!");
        } else {

            Statement statement = connection.createStatement();
            statement.execute(tableQuery);
            System.out.println("The " + tableName + " table has been created");
        }
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}


