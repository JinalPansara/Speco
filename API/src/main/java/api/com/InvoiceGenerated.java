package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceGenerated 
{
	@JsonProperty("Invoice")
	private String invoice;
	@JsonProperty("GeneratedBy")
	private String generatedby;
	@JsonProperty("Date")
	private String date;
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getGeneratedby() {
		return generatedby;
	}
	public void setGeneratedby(String generatedby) {
		this.generatedby = generatedby;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
