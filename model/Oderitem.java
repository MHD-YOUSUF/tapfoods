package com.tapfoods.model;

public class Oderitem {
	private int oderitemid;
	private int oderid;
	private int menuid;
	private int quantity;
	private float subtotal;
	public Oderitem() {
		super();
	}
	public Oderitem(int oderitemid, int oderid, int menuid, int quantity, float subtotal) {
		super();
		this.oderitemid = oderitemid;
		this.oderid = oderid;
		this.menuid = menuid;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	public Oderitem(int oderid, int menuid, int quantity, float subtotal) {
		super();
		this.oderid = oderid;
		this.menuid = menuid;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	public int getOderitemid() {
		return oderitemid;
	}
	public void setOderitemid(int oderitemid) {
		this.oderitemid = oderitemid;
	}
	public int getOderid() {
		return oderid;
	}
	public void setOderid(int oderid) {
		this.oderid = oderid;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "Oderitem [oderitemid=" + oderitemid + ", oderid=" + oderid + ", menuid=" + menuid + ", quantity="
				+ quantity + ", subtotal=" + subtotal + "]";
	}
	
	

}
