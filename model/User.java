package com.tapfoods.model;

/**
 * The User class represents a user in the system.
 */
public class User {
    private int userid;
    private String username;
    private String email;
    private String phonenumber;
    private String password;
    private String address;

    /**
     * Default constructor.
     */
    public User() {
        super();
    }

    /**
     * Constructor with all fields including userid.
     * 
     * @param userid the ID of the user
     * @param username the username of the user
     * @param email the email of the user
     * @param phonenumber the phone number of the user
     * @param password the password of the user
     * @param address the address of the user
     */
    public User(int userid, String username, String email, String phonenumber, String password, String address) {
        super();
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.address = address;
    }

    /**
     * Constructor without userid.
     * 
     * @param username the username of the user
     * @param email the email of the user
     * @param phonenumber the phone number of the user
     * @param password the password of the user
     * @param address the address of the user
     */
    public User(String username, String email, String phonenumber, String password, String address) {
        super();
        this.username = username;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.address = address;
    }

    /**
     * Gets the user ID.
     * 
     * @return the user ID
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Sets the user ID.
     * 
     * @param userid the user ID
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * Gets the username.
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * 
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone number.
     * 
     * @return the phone number
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * Sets the phone number.
     * 
     * @param phonenumber the phone number
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * 
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the User object.
     * 
     * @return a string representation of the User object
     */
    @Override
    public String toString() {
        return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", phonenumber=" + phonenumber
                + ", password=" + password + ", address=" + address + "]";
    }
}
