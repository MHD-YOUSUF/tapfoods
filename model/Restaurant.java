package com.tapfoods.model;

/**
 * The Restaurant class represents a restaurant in the system.
 */
public class Restaurant {
    private int restaurantid;
    private String restaurantname;
    private int deliverytime;
    private String cuisinetype;
    private String address;
    private float ratings;
    private String isactive;
    private int adminid;
    private String imagepath;

    /**
     * Default constructor.
     */
    public Restaurant() {
        super();
    }

    /**
     * Constructor with all fields including restaurantid.
     * 
     * @param restaurantid the ID of the restaurant
     * @param restaurantname the name of the restaurant
     * @param deliverytime the delivery time of the restaurant
     * @param cuisinetype the type of cuisine the restaurant offers
     * @param address the address of the restaurant
     * @param ratings the ratings of the restaurant
     * @param isactive the active status of the restaurant
     * @param adminid the ID of the admin managing the restaurant
     * @param imagepath the path to the image of the restaurant
     */
    public Restaurant(int restaurantid, String restaurantname, int deliverytime, String cuisinetype, String address,
                      float ratings, String isactive, int adminid, String imagepath) {
        super();
        this.restaurantid = restaurantid;
        this.restaurantname = restaurantname;
        this.deliverytime = deliverytime;
        this.cuisinetype = cuisinetype;
        this.address = address;
        this.ratings = ratings;
        this.isactive = isactive;
        this.adminid = adminid;
        this.imagepath = imagepath;
    }

    /**
     * Constructor without restaurantid.
     * 
     * @param restaurantname the name of the restaurant
     * @param deliverytime the delivery time of the restaurant
     * @param cuisinetype the type of cuisine the restaurant offers
     * @param address the address of the restaurant
     * @param ratings the ratings of the restaurant
     * @param isactive the active status of the restaurant
     * @param adminid the ID of the admin managing the restaurant
     * @param imagepath the path to the image of the restaurant
     */
    public Restaurant(String restaurantname, int deliverytime, String cuisinetype, String address, float ratings,
                      String isactive, int adminid, String imagepath) {
        super();
        this.restaurantname = restaurantname;
        this.deliverytime = deliverytime;
        this.cuisinetype = cuisinetype;
        this.address = address;
        this.ratings = ratings;
        this.isactive = isactive;
        this.adminid = adminid;
        this.imagepath = imagepath;
    }

    /**
     * Gets the restaurant ID.
     * 
     * @return the restaurant ID
     */
    public int getRestaurantid() {
        return restaurantid;
    }

    /**
     * Sets the restaurant ID.
     * 
     * @param restaurantid the restaurant ID
     */
    public void setRestaurantid(int restaurantid) {
        this.restaurantid = restaurantid;
    }

    /**
     * Gets the restaurant name.
     * 
     * @return the restaurant name
     */
    public String getRestaurantname() {
        return restaurantname;
    }

    /**
     * Sets the restaurant name.
     * 
     * @param restaurantname the restaurant name
     */
    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    /**
     * Gets the delivery time.
     * 
     * @return the delivery time
     */
    public int getDeliverytime() {
        return deliverytime;
    }

    /**
     * Sets the delivery time.
     * 
     * @param deliverytime the delivery time
     */
    public void setDeliverytime(int deliverytime) {
        this.deliverytime = deliverytime;
    }

    /**
     * Gets the cuisine type.
     * 
     * @return the cuisine type
     */
    public String getCuisinetype() {
        return cuisinetype;
    }

    /**
     * Sets the cuisine type.
     * 
     * @param cuisinetype the cuisine type
     */
    public void setCuisinetype(String cuisinetype) {
        this.cuisinetype = cuisinetype;
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
     * Gets the ratings.
     * 
     * @return the ratings
     */
    public float getRatings() {
        return ratings;
    }

    /**
     * Sets the ratings.
     * 
     * @param ratings the ratings
     */
    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    /**
     * Gets the active status.
     * 
     * @return the active status
     */
    public String getIsactive() {
        return isactive;
    }

    /**
     * Sets the active status.
     * 
     * @param isactive the active status
     */
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    /**
     * Gets the admin ID.
     * 
     * @return the admin ID
     */
    public int getAdminid() {
        return adminid;
    }

    /**
     * Sets the admin ID.
     * 
     * @param adminid the admin ID
     */
    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    /**
     * Gets the image path.
     * 
     * @return the image path
     */
    public String getImagepath() {
        return imagepath;
    }

    /**
     * Sets the image path.
     * 
     * @param imagepath the image path
     */
    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    /**
     * Returns a string representation of the Restaurant object.
     * 
     * @return a string representation of the Restaurant object
     */
    @Override
    public String toString() {
        return "Restaurant [restaurantid=" + restaurantid + ", restaurantname=" + restaurantname + ", deliverytime=" + deliverytime + ", cuisinetype=" + cuisinetype + ", address=" + address + ", ratings=" + ratings + ", isactive=" + isactive + ", adminid=" + adminid + ", imagepath=" + imagepath + "]";
    }
}
