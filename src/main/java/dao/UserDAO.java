package dao;

import db.MyConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    // Check if email already exists
    public static boolean isExists(String email) throws SQLException {
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM users WHERE email = ?");
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        return rs.next(); // returns true if at least one record found
    }

    // Save a new user
    public static int saveUser(User user) throws SQLException {
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO users VALUES (DEFAULT, ?, ?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        return ps.executeUpdate();
    }
}
