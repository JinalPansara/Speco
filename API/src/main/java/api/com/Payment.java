package api.com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payment 
{
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Time")
	private String time;
	@JsonProperty("Charges")
	private String charges;
	@JsonProperty("Detail")
	private List<DetailOfCharges> details;
	@JsonProperty("Total")
	private String total;
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public List<DetailOfCharges> getDetails() {
		return details;
	}
	public void setDetails(List<DetailOfCharges> details) {
		this.details = details;
	}
	
	
	
	
}
