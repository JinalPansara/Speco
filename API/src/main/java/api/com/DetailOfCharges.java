package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailOfCharges 
{
	@JsonProperty("Detail")
	private String detail;
	@JsonProperty("Quantity")
	private String quantity;
	@JsonProperty("UnitCost")
	private String unitcost;
	@JsonProperty("Charges")
	private String charges;
	@JsonProperty("Discount")
	private String discount;
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(String unitcost) {
		this.unitcost = unitcost;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
