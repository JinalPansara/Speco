package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Others 
{
	@JsonProperty("Medications")
	private String medications;
	@JsonProperty("Invoices")
	private String invoices;
	public String getMedications() {
		return medications;
	}
	public void setMedications(String medications) {
		this.medications = medications;
	}
	public String getInvoices() {
		return invoices;
	}
	public void setInvoices(String invoices) {
		this.invoices = invoices;
	}
}
