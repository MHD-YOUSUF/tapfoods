package com.tapfoods.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.tapfoods.DAO.RestaurantDAO;
import com.tapfoods.dbUtils.DBUtils;
import com.tapfoods.model.Restaurant;

/**
 * The RestaurantDAOImpl class implements the RestaurantDAO interface and provides
 * the CRUD operations for Restaurant objects.
 */
public class RestaurantDAOImpl implements RestaurantDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet resultSet;
    private ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
    private int status = 0;
    private Restaurant restaurant;

    // SQL Queries
    private static final String ADD_RESTAURANT = "INSERT INTO `restaurant`(`restaurantname`,`delivarytime`,`cuisinetype`,`address`,`ratings`,`isactive`,`adminid`,`imagepath`)" + "VALUES(?,?,?,?,?,?,?,?)";
    private static final String SELECT_ALL = "SELECT * FROM `restaurant`";
    private static final String SELECT_ON_ID = "SELECT * FROM `restaurant` WHERE `restaurantid`=?";
    private static final String UPDATE_ON_ID = "UPDATE `restaurant` SET `restaurantname`=?,`delivarytime`=?,`cuisinetype`=?, `address`=?,`ratings`=?,`isactive`=?,`adminid`=?,`imagepath`=? WHERE `restaurantid`=?";
    private static final String DELETE_ON_ID = "DELETE FROM `restaurant` WHERE `restaurantid`=?";

    /**
     * Constructor to initialize database connection.
     */
    public RestaurantDAOImpl() {
        try {
            con = DBUtils.myConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a new restaurant to the database.
     * 
     * @param r the Restaurant object to be added
     * @return the number of rows affected
     */
    @Override
    public int addRestaurant(Restaurant r) {
        try {
            pstmt = con.prepareStatement(ADD_RESTAURANT);
            pstmt.setString(1, r.getRestaurantname());
            pstmt.setInt(2, r.getDeliverytime());
            pstmt.setString(3, r.getCuisinetype());
            pstmt.setString(4, r.getAddress());
            pstmt.setFloat(5, r.getRatings());
            pstmt.setString(6, r.getIsactive());
            pstmt.setInt(7, r.getAdminid());
            pstmt.setString(8, r.getImagepath());
            status = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    /**
     * Retrieves all restaurants from the database.
     * 
     * @return a list of all Restaurant objects
     */
    @Override
    public ArrayList<Restaurant> getAllRestaurant() {
        try {
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(SELECT_ALL);
            restaurantList = extractRestaurantFromResultSet(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return restaurantList;
    }

    /**
     * Retrieves a restaurant from the database based on the restaurant ID.
     * 
     * @param restaurantid the ID of the restaurant to be retrieved
     * @return the Restaurant object
     */
    @Override
    public Restaurant getRestaurant(int restaurantid) {
        try {
            pstmt = con.prepareStatement(SELECT_ON_ID);
            pstmt.setInt(1, restaurantid);
            resultSet = pstmt.executeQuery();
            restaurantList = extractRestaurantFromResultSet(resultSet);
            restaurant = restaurantList.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return restaurant;
    }

    /**
     * Updates a restaurant's information in the database based on the restaurant ID.
     * 
     * @param r the Restaurant object with updated information
     * @return the number of rows affected
     */
    @Override
    public int updateRestaurant(Restaurant r) {
        try {
            pstmt = con.prepareStatement(UPDATE_ON_ID);
            pstmt.setString(1, r.getRestaurantname());
            pstmt.setInt(2, r.getDeliverytime());
            pstmt.setString(3, r.getCuisinetype());
            pstmt.setString(4, r.getAddress());
            pstmt.setFloat(5, r.getRatings());
            pstmt.setString(6, r.getIsactive());
            pstmt.setInt(7, r.getAdminid());
            pstmt.setString(8, r.getImagepath());
            pstmt.setInt(9, r.getRestaurantid());
            status = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    /**
     * Deletes a restaurant from the database based on the restaurant ID.
     * 
     * @param restaurantid the ID of the restaurant to be deleted
     * @return the number of rows affected
     */
    @Override
    public int deleteRestaurant(int restaurantid) {
        try {
            pstmt = con.prepareStatement(DELETE_ON_ID);
            pstmt.setInt(1, restaurantid);
            status = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    /**
     * Extracts a list of Restaurant objects from the given ResultSet.
     * 
     * @param resultSet the ResultSet containing restaurant data
     * @return a list of Restaurant objects
     */
    private ArrayList<Restaurant> extractRestaurantFromResultSet(ResultSet resultSet) {
        ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
        try {
            while (resultSet.next()) {
                restaurantList.add(new Restaurant(
                    resultSet.getInt("restaurantid"),
                    resultSet.getString("restaurantname"),
                    resultSet.getInt("delivarytime"),
                    resultSet.getString("cuisinetype"),
                    resultSet.getString("address"),
                    resultSet.getFloat("ratings"),
                    resultSet.getString("isactive"),
                    resultSet.getInt("adminid"),
                    resultSet.getString("imagepath")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return restaurantList;
    }
}
