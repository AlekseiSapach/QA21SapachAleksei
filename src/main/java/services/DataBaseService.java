package services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class DataBaseService {
    static Logger logger = LogManager.getLogger(DataBaseService.class);
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS ="1348";

    Connection connection = null;
    Statement statement = null;

    public DataBaseService(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (connection !=null){
            logger.info("You successfully connected to database");
        }else {
            logger.info("Что-то пошло не так");
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public Statement getStatement() {
        try {
            if (statement == null) {
                statement = getConnection().createStatement();
            }
        } catch (SQLException sqlException) {
            logger.error("Не удалось создать Statement...");
        }
        return statement;
    }

    public void executeSQL(String sql){
        try {
            logger.info("Результат выполнения запроса " + getStatement().executeQuery(sql));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ResultSet executeQuery(String sql) {
        try {
            getStatement().execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public void closeConnected(){
        try {
            connection.close();
            logger.info("You successfully dropped the connected to database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
