package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dashboard {

	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("Condition")
	private String condition;
	@JsonProperty("Severity")
	private String severity;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Doctor")
	private String doctor;
	@JsonProperty("ConsultationMode")
	private String consultationmode;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Charges")
	private String charges;
	@JsonProperty("Status")
	private String status;
	

	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getConsultationmode() {
		return consultationmode;
	}

	public void setConsultationmode(String consultationmode) {
		this.consultationmode = consultationmode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
