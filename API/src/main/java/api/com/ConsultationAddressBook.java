package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultationAddressBook {

	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Sex")
	private String sex;
	@JsonProperty("Age")
	private String age;
	@JsonProperty("LastVisit")
	private String lastvisit;
	@JsonProperty("ContactNumber")
	private String contactnumber;
	@JsonProperty("ConsultationFees")
	private String consultationfees;
	
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLastvisit() {
		return lastvisit;
	}

	public void setLastvisit(String lastvisit) {
		this.lastvisit = lastvisit;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getConsultationfees() {
		return consultationfees;
	}

	public void setConsultationfees(String consultationfees) {
		this.consultationfees = consultationfees;
	}
}
