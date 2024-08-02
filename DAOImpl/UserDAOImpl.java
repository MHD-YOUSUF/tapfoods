package com.tapfoods.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tapfoods.DAO.UserDAO;
import com.tapfoods.dbUtils.DBUtils;
import com.tapfoods.model.User;

/**
 * The UserDAOImpl class implements the UserDAO interface and provides
 * the CRUD operations for User objects.
 */
public class UserDAOImpl implements UserDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet resultSet;
    private ArrayList<User> userList = new ArrayList<User>();
    private int status = 0;
    private User user;
    
    // SQL Queries
    private static final String ADD_USER = "INSERT INTO `user`(`username`,`email`,`phonenumber`,`password`,`address`)" + "VALUES(?,?,?,?,?)";
    private static final String SELECT_ALL = "SELECT * FROM `user`";
    private static final String SELECT_ON_EMAIL = "SELECT * FROM `user` WHERE `email`=?";
    private static final String UPDATE_ON_EMAIL = "UPDATE `user` SET `username`=?,`phonenumber`=?,`password`=?, `address`=? WHERE `email`=?";
    private static final String DELETE_ON_EMAIL = "DELETE FROM `user` WHERE `email`=?";
    
    /**
     * Constructor to initialize database connection.
     */
    public UserDAOImpl() {
        try {
            con = DBUtils.myConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Adds a new user to the database.
     * 
     * @param u the User object to be added
     * @return the number of rows affected
     */
    @Override
    public int addUser(User u) {
        try {
            pstmt = con.prepareStatement(ADD_USER);
            pstmt.setString(1, u.getUsername());
            pstmt.setString(2, u.getEmail());
            pstmt.setString(3, u.getPhonenumber());
            pstmt.setString(4, u.getPassword());
            pstmt.setString(5, u.getAddress());
            status = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
    
    /**
     * Retrieves all users from the database.
     * 
     * @return a list of all User objects
     */
    @Override
    public ArrayList<User> getAllUsers() {
        try {
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(SELECT_ALL);
            userList = extractUserFromResultSet(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
    
    /**
     * Retrieves a user from the database based on the email.
     * 
     * @param email the email of the user to be retrieved
     * @return the User object
     */
    @Override
    public User getUser(String email) {
        try {
            pstmt = con.prepareStatement(SELECT_ON_EMAIL);
            pstmt.setString(1, email);
            resultSet = pstmt.executeQuery();
            userList = extractUserFromResultSet(resultSet);
            user = userList.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    /**
     * Updates a user's information in the database based on the email.
     * 
     * @param u the User object with updated information
     * @return the number of rows affected
     */
    @Override
    public int updateUser(User u) {
        try {
            pstmt = con.prepareStatement(UPDATE_ON_EMAIL);
            pstmt.setString(1, u.getUsername());
            pstmt.setString(2, u.getPhonenumber());
            pstmt.setString(3, u.getPassword());
            pstmt.setString(4, u.getAddress());
            pstmt.setString(5, u.getEmail());
            status = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    /**
     * Deletes a user from the database based on the email.
     * 
     * @param email the email of the user to be deleted
     * @return the number of rows affected
     */
    @Override
    public int deleteUser(String email) {
        try {
            pstmt = con.prepareStatement(DELETE_ON_EMAIL);
            pstmt.setString(1, email);
            status = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    /**
     * Extracts a list of User objects from the given ResultSet.
     * 
     * @param resultSet the ResultSet containing user data
     * @return a list of User objects
     */
    private ArrayList<User> extractUserFromResultSet(ResultSet resultSet) {
        try {
            while (resultSet.next()) {
                userList.add(new User(
                    resultSet.getInt("userId"),
                    resultSet.getString("username"),
                    resultSet.getString("email"),
                    resultSet.getString("phonenumber"),
                    resultSet.getString("password"),
                    resultSet.getString("address")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
