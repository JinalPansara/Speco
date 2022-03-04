package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WearableData 
{
	@JsonProperty("ConsultedTo")
	private String consultedto;
	@JsonProperty("Concern")
	private String concern;
	@JsonProperty("AppointmentDate")
	private String appointmentdate;
	@JsonProperty("WearableData")
	private String wearabledata;
	public String getConsultedto() {
		return consultedto;
	}
	public void setConsultedto(String consultedto) {
		this.consultedto = consultedto;
	}
	public String getConcern() {
		return concern;
	}
	public void setConcern(String concern) {
		this.concern = concern;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getWearabledata() {
		return wearabledata;
	}
	public void setWearabledata(String wearabledata) {
		this.wearabledata = wearabledata;
	}
	
}
