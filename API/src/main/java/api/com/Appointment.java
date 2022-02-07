package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Appointment 
{
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Condition")
	private String condition;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("Action")
	private String action;
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
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
