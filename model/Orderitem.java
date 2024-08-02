package com.tapfoods.model;

/**
 * The Orderitem class represents an item in an order.
 */
public class Orderitem {
    private int orderitemid;
    private int orderid;
    private int menuid;
    private int quantity;
    private float subtotal;
    
    /**
     * Default constructor.
     */
    public Orderitem() {
        super();
    }
    
    /**
     * Constructor with all fields including orderitemid.
     * 
     * @param orderitemid the ID of the order item
     * @param orderid the ID of the order
     * @param menuid the ID of the menu item
     * @param quantity the quantity of the menu item
     * @param subtotal the subtotal price for the order item
     */
    public Orderitem(int orderitemid, int orderid, int menuid, int quantity, float subtotal) {
        super();
        this.orderitemid = orderitemid;
        this.orderid = orderid;
        this.menuid = menuid;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }
    
    /**
     * Constructor without orderitemid.
     * 
     * @param orderid the ID of the order
     * @param menuid the ID of the menu item
     * @param quantity the quantity of the menu item
     * @param subtotal the subtotal price for the order item
     */
    public Orderitem(int orderid, int menuid, int quantity, float subtotal) {
        super();
        this.orderid = orderid;
        this.menuid = menuid;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }
    
    /**
     * Gets the order item ID.
     * 
     * @return the order item ID
     */
    public int getOrderitemid() {
        return orderitemid;
    }
    
    /**
     * Sets the order item ID.
     * 
     * @param orderitemid the order item ID
     */
    public void setOrderitemid(int orderitemid) {
        this.orderitemid = orderitemid;
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
     * Gets the menu item ID.
     * 
     * @return the menu item ID
     */
    public int getMenuid() {
        return menuid;
    }
    
    /**
     * Sets the menu item ID.
     * 
     * @param menuid the menu item ID
     */
    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }
    
    /**
     * Gets the quantity of the menu item.
     * 
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Sets the quantity of the menu item.
     * 
     * @param quantity the quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     * Gets the subtotal price for the order item.
     * 
     * @return the subtotal price
     */
    public float getSubtotal() {
        return subtotal;
    }
    
    /**
     * Sets the subtotal price for the order item.
     * 
     * @param subtotal the subtotal price
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    /**
     * Returns a string representation of the Orderitem object.
     * 
     * @return a string representation of the Orderitem object
     */
    @Override
    public String toString() {
        return "Orderitem [orderitemid=" + orderitemid + ", orderid=" + orderid + ", menuid=" + menuid + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
    }
}
