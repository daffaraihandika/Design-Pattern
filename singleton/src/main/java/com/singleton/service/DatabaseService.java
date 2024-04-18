package com.singleton.service;

import org.springframework.stereotype.Service;

import com.singleton.manager.DatabaseManager;
import java.sql.SQLException;

@Service
public class DatabaseService {
    private final DatabaseManager databaseManager;

    public DatabaseService(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void connectToDatabase() {
        try {
            databaseManager.getConnection();
            System.out.println("Successfully connected to database");
        } catch (SQLException e) {
            System.err.println("Failed to connect to database.");
            e.printStackTrace();
        }
    }

    public void disconnectDatabase() {
        try {
            databaseManager.disconnect();
            System.out.println("Successfully disconnected from database");
        } catch (Exception e) {
            System.err.println("Failed to disconnect from database.");
        }
    }
}
