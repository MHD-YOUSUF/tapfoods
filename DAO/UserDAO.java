package com.tapfoods.DAO;

import java.util.ArrayList;
import com.tapfoods.model.User;

/**
 * The UserDAO interface provides methods for CRUD operations on User objects.
 */
public interface UserDAO {
    
    /**
     * Adds a new user to the database.
     * 
     * @param u the User object to be added
     * @return the number of rows affected
     */
    int addUser(User u);
    
    /**
     * Retrieves all users from the database.
     * 
     * @return a list of all User objects
     */
    ArrayList<User> getAllUsers();
    
    /**
     * Retrieves a user from the database based on the email.
     * 
     * @param email the email of the user to be retrieved
     * @return the User object
     */
    User getUser(String email);
    
    /**
     * Updates a user's information in the database based on the email.
     * 
     * @param u the User object with updated information
     * @return the number of rows affected
     */
    int updateUser(User u);
    
    /**
     * Deletes a user from the database based on the email.
     * 
     * @param email the email of the user to be deleted
     * @return the number of rows affected
     */
    int deleteUser(String email);
}
