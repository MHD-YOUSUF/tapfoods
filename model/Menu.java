package com.tapfoods.model;

/**
 * The Menu class represents a menu item in a restaurant.
 */
public class Menu {
    private int menuid;
    private int restaurantid;
    private String menuname;
    private float price;
    private String description;
    private String isavailable;
    private String imgpath;
    
    /**
     * Default constructor.
     */
    public Menu() {
        super();
    }
    
    /**
     * Constructor with all fields including menuid.
     * 
     * @param menuid the ID of the menu item
     * @param restaurantid the ID of the restaurant
     * @param menuname the name of the menu item
     * @param price the price of the menu item
     * @param description the description of the menu item
     * @param isavailable the availability status of the menu item
     * @param imgpath the image path of the menu item
     */
    public Menu(int menuid, int restaurantid, String menuname, float price, String description, String isavailable, String imgpath) {
        super();
        this.menuid = menuid;
        this.restaurantid = restaurantid;
        this.menuname = menuname;
        this.price = price;
        this.description = description;
        this.isavailable = isavailable;
        this.imgpath = imgpath;
    }
    
    /**
     * Constructor without menuid.
     * 
     * @param restaurantid the ID of the restaurant
     * @param menuname the name of the menu item
     * @param price the price of the menu item
     * @param description the description of the menu item
     * @param isavailable the availability status of the menu item
     * @param imgpath the image path of the menu item
     */
    public Menu(int restaurantid, String menuname, float price, String description, String isavailable, String imgpath) {
        super();
        this.restaurantid = restaurantid;
        this.menuname = menuname;
        this.price = price;
        this.description = description;
        this.isavailable = isavailable;
        this.imgpath = imgpath;
    }
    
    /**
     * Gets the menu ID.
     * 
     * @return the menu ID
     */
    public int getMenuid() {
        return menuid;
    }
    
    /**
     * Sets the menu ID.
     * 
     * @param menuid the menu ID
     */
    public void setMenuid(int menuid) {
        this.menuid = menuid;
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
     * Gets the menu name.
     * 
     * @return the menu name
     */
    public String getMenuname() {
        return menuname;
    }
    
    /**
     * Sets the menu name.
     * 
     * @param menuname the menu name
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }
    
    /**
     * Gets the price of the menu item.
     * 
     * @return the price
     */
    public float getPrice() {
        return price;
    }
    
    /**
     * Sets the price of the menu item.
     * 
     * @param price the price
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    /**
     * Gets the description of the menu item.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the description of the menu item.
     * 
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Gets the availability status of the menu item.
     * 
     * @return the availability status
     */
    public String getIsavailable() {
        return isavailable;
    }
    
    /**
     * Sets the availability status of the menu item.
     * 
     * @param isavailable the availability status
     */
    public void setIsavailable(String isavailable) {
        this.isavailable = isavailable;
    }
    
    /**
     * Gets the image path of the menu item.
     * 
     * @return the image path
     */
    public String getImgpath() {
        return imgpath;
    }
    
    /**
     * Sets the image path of the menu item.
     * 
     * @param imgpath the image path
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }
    
    /**
     * Returns a string representation of the Menu object.
     * 
     * @return a string representation of the Menu object
     */
    @Override
    public String toString() {
        return "Menu [menuid=" + menuid + ", restaurantid=" + restaurantid + ", menuname=" + menuname + ", price=" + price + ", description=" + description + ", isavailable=" + isavailable + ", imgpath=" + imgpath + "]";
    }
}
