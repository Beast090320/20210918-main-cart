package entity;

import java.util.Date;

public class Order {
	private Integer id; // 訂單編號
	private Integer userid;// 訂貨人 id
	private Integer productid;// 商品 id
	private Date ts;// 下單時間
	
	
	public Order() {
		
	}
	
	public Order(Integer id, Integer userid, Integer productid) {
		super();
		this.id = id;
		this.userid = userid;
		this.productid = productid;
		this.ts = new Date();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Date getTs() {
		return ts;
	}
	public void setTs(Date ts) {
		this.ts = ts;
	}
	
	
}
