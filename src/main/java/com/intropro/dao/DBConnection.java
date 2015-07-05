package com.intropro.dao;

import java.sql.*;
import java.util.logging.Logger;

/**
 * Created by Viktoriia on 30.06.15.
 */
public class DBConnection {

    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/newdb";
    private static final String DB_USER = "Viktoriia";
    private static final String DB_PASSWORD = "qwerty";

    // SQL delete statement
    public  ResultSet queryExecutor(String query) throws SQLException {
        Connection dbConnection = null;
        Statement st = null;
        ResultSet rs = null;


        try {
            dbConnection = getDBConnection();
            st = dbConnection.createStatement();
            System.out.println(query);
            // execute SQL stetement
            rs = st.executeQuery(query);


        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

    		if (st != null) {
				st.close();
			}

            if (dbConnection != null) {
                dbConnection.close();
            }
        }
        return rs;
    }

    public void deleteRowFromDB(String deleteQuery) throws SQLException {
        Connection dbConnection = null;
        Statement st = null;
        ResultSet rs = null;


        try {
            dbConnection = getDBConnection();
            st = dbConnection.createStatement();
            System.out.println(deleteQuery);
            st.executeUpdate(deleteQuery);
        } catch (SQLException e) {
            Logger.getLogger(this.getClass().toString()).warning("[ERROR] Error while executing delete query in dataBase");
        } finally {
            if (st != null) {
                st.close();
            }
            dbConnection.close();

        }

    }

    // method that connect to DB
    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
                    DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }
}

