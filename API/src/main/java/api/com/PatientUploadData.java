package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientUploadData 
{
	@JsonProperty("FileUploaded")
	private String fileuploaded;
	@JsonProperty("ConsultedTo")
	private String consultedto;
	@JsonProperty("Concern")
	private String concern;
	@JsonProperty("AppointmentDate")
	private String appointmentdate;
	public String getFileuploaded() {
		return fileuploaded;
	}
	public void setFileuploaded(String fileuploaded) {
		this.fileuploaded = fileuploaded;
	}
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
	
}
