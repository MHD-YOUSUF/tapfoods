package com.tapfoods.model;

/**
 * The OrderTable class represents an order placed in a restaurant.
 */
public class OrderTable {
    private int orderid;
    private int restaurantid;
    private int userid;
    private float totalamount;
    private String status;
    private String paymentmode;
    
    /**
     * Default constructor.
     */
    public OrderTable() {
        super();
    }
    
    /**
     * Constructor with all fields including orderid.
     * 
     * @param orderid the ID of the order
     * @param restaurantid the ID of the restaurant
     * @param userid the ID of the user
     * @param totalamount the total amount of the order
     * @param status the status of the order
     * @param paymentmode the payment mode of the order
     */
    public OrderTable(int orderid, int restaurantid, int userid, float totalamount, String status, String paymentmode) {
        super();
        this.orderid = orderid;
        this.restaurantid = restaurantid;
        this.userid = userid;
        this.totalamount = totalamount;
        this.status = status;
        this.paymentmode = paymentmode;
    }
    
    /**
     * Constructor without orderid.
     * 
     * @param restaurantid the ID of the restaurant
     * @param userid the ID of the user
     * @param totalamount the total amount of the order
     * @param status the status of the order
     * @param paymentmode the payment mode of the order
     */
    public OrderTable(int restaurantid, int userid, float totalamount, String status, String paymentmode) {
        super();
        this.restaurantid = restaurantid;
        this.userid = userid;
        this.totalamount = totalamount;
        this.status = status;
        this.paymentmode = paymentmode;
    }
    
    /**
     * Gets the order ID.
     * 
     * @return the order ID
     */
    public int getOrderid() {
        return orderid;
    }
    
    /**
     * Sets the order ID.
     * 
     * @param orderid the order ID
     */
    public void setOrderid(int orderid) {
        this.orderid = orderid;
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
     * Gets the total amount of the order.
     * 
     * @return the total amount
     */
    public float getTotalamount() {
        return totalamount;
    }
    
    /**
     * Sets the total amount of the order.
     * 
     * @param totalamount the total amount
     */
    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }
    
    /**
     * Gets the status of the order.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the status of the order.
     * 
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Gets the payment mode of the order.
     * 
     * @return the payment mode
     */
    public String getPaymentmode() {
        return paymentmode;
    }
    
    /**
     * Sets the payment mode of the order.
     * 
     * @param paymentmode the payment mode
     */
    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }
    
    /**
     * Returns a string representation of the OrderTable object.
     * 
     * @return a string representation of the OrderTable object
     */
    @Override
    public String toString() {
        return "OrderTable [orderid=" + orderid + ", restaurantid=" + restaurantid + ", userid=" + userid + ", totalamount=" + totalamount + ", status=" + status + ", paymentmode=" + paymentmode + "]";
    }
}
