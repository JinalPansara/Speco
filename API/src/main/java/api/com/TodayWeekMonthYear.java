package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TodayWeekMonthYear 
{
	@JsonProperty("TotalPatient")
	private String totalpatients;
	@JsonProperty("PatientTreated")
	private String patientstreated;
	@JsonProperty("Income")
	private String income;
	@JsonProperty("CancelledAppointment")
	private String cancelledappointment;
	public String getTotalpatients() {
		return totalpatients;
	}
	public void setTotalpatients(String totalpatients) {
		this.totalpatients = totalpatients;
	}
	public String getPatientstreated() {
		return patientstreated;
	}
	public void setPatientstreated(String patientstreated) {
		this.patientstreated = patientstreated;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getCancelledappointment() {
		return cancelledappointment;
	}
	public void setCancelledappointment(String cancelledappointment) {
		this.cancelledappointment = cancelledappointment;
	}
	
}
