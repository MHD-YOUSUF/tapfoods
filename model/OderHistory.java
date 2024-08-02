package com.tapfoods.model;

public class OderHistory {
	private int oderhistoryid;
	private int fk_oderid;
	private int fk_userid;
	private String oderdate;
	private float totalamount;
	private String status;
	
	
	public OderHistory() {
		super();
	}


	public OderHistory(int oderhistoryid, int fk_oderid, int fk_userid, String oderdate, float totalamount,
			String status) {
		super();
		this.oderhistoryid = oderhistoryid;
		this.fk_oderid = fk_oderid;
		this.fk_userid = fk_userid;
		this.oderdate = oderdate;
		this.totalamount = totalamount;
		this.status = status;
	}


	public OderHistory(int fk_oderid, int fk_userid, String oderdate, float totalamount, String status) {
		super();
		this.fk_oderid = fk_oderid;
		this.fk_userid = fk_userid;
		this.oderdate = oderdate;
		this.totalamount = totalamount;
		this.status = status;
	}


	public int getOderhistoryid() {
		return oderhistoryid;
	}


	public void setOderhistoryid(int oderhistoryid) {
		this.oderhistoryid = oderhistoryid;
	}


	public int getFk_oderid() {
		return fk_oderid;
	}


	public void setFk_oderid(int fk_oderid) {
		this.fk_oderid = fk_oderid;
	}


	public int getFk_userid() {
		return fk_userid;
	}


	public void setFk_userid(int fk_userid) {
		this.fk_userid = fk_userid;
	}


	public String getOderdate() {
		return oderdate;
	}


	public void setOderdate(String oderdate) {
		this.oderdate = oderdate;
	}


	public float getTotalamount() {
		return totalamount;
	}


	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "OderHistory [oderhistoryid=" + oderhistoryid + ", fk_oderid=" + fk_oderid + ", fk_userid=" + fk_userid
				+ ", oderdate=" + oderdate + ", totalamount=" + totalamount + ", status=" + status + "]";
	}
	
	
	
}

