package com.pingwit.spring.les_1.hw.task2.repository;

import com.pingwit.spring.les_1.hw.task2.model.Employee;
import com.pingwit.spring.les_1.hw.task2.model.EmployeeCriteria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class JbdcEmployeeConnector implements JdbcConnector<Employee, EmployeeCriteria> {

    private static final String URL = "jdbc:postgresql://localhost:5432/mashinki";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "docker";

    @Override
    public List<Employee> getAll() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("select * from employees");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Employee> getAll(EmployeeCriteria criteria) {
        Connection connection = null;
        try {
            connection = getConnection();

            //        String sql;
//        if (criteria.name() == null && criteria.ratePerHour() != null) {
//            sql = "select * from employees where rate_per_hour = ?";
//            ps.set(1, criteria.ratePerHour());
//        }
            connection.prepareStatement("");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
