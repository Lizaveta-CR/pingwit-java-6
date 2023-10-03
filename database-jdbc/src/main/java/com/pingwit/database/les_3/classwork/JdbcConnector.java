package com.pingwit.database.les_3.classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnector {

    private static final String URL = "jdbc:postgresql://localhost:5432/mashinki";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "docker";
    private static final String SELECT_AUTO_HOUSE = "select * from auto_house";
    private static final String INSERT = "INSERT INT fuel(name) VALUES (?)";

    public static void main(String[] args) {
        JdbcConnector jdbcConnector = new JdbcConnector();
        jdbcConnector.runQuery();
    }

    public void runQuery() {
        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(SELECT_AUTO_HOUSE);

            List<Car> cars = new ArrayList<>();

            while (rs.next()) {
                long carId = rs.getLong(1);
                String producer = rs.getString(2);
                String vin = rs.getString(3);
                long fuel = rs.getLong(4);
                long wheel = rs.getLong(5);
                Car car = new Car(carId, producer, vin, fuel, wheel);
                cars.add(car);
            }

            cars.forEach(System.out::println);

            Statement update = connection.createStatement();
            connection.setAutoCommit(false);
            int counter = update.executeUpdate("DELETE from auto_house WHERE id = 7");
            System.out.println(counter);

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, "nanana");

            preparedStatement.execute();
            connection.commit();
//          connection.rollback();
            int transactionIsolation = connection.getTransactionIsolation(); //set
            System.out.println(transactionIsolation);

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
