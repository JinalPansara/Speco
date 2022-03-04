package api.com;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Consultation 
{
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("ConsultedTo")
	private String consultedto;
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("Age")
	private String age;
	@JsonProperty("Symptoms")
	private List<Symptom> symptoms;
	@JsonProperty("Findings")
	private List<Findings> finding;
	@JsonProperty("Diagnosis")
	private List<Diagnosis> diagnosis;
	@JsonProperty("Instruction")
	private String instruction;
	@JsonProperty("FollowUp")
	private List<FollowUps> followup;
	@JsonProperty("Prescription")
	private List<Prescription> prescription;
	@JsonProperty("EMRGenerated")
	private List<EMRGenerated> emrgenerated;
	@JsonProperty("Concern")
	private String concern;
	@JsonProperty("InvoiceGenerated")
	private List<InvoiceGenerated> invoicegenerated;
	@JsonProperty("WearableData")
	private List<WearableData> wearabledata;
	@JsonProperty("Allergies")
	private String allergies;
	@JsonProperty("CurrentMedications")
	private String currentmedications;
	@JsonProperty("Diseases")
	private String diseases;
	@JsonProperty("Surgeries")
	private String surgeries;
	@JsonProperty("PersonalDetail")
	private List<PersonalDetail> personaldetail;
	@JsonProperty("PatientIllnessSummary")
	private List<PatientIllnessSummary> patientillnesssummary;
	@JsonProperty("Examination")
	private List<Examination> examination;
	@JsonProperty("Others")
	private List<Others> others;
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("Visits")
	private List<Visit> visits;
	@JsonProperty("Phone")
	private String phone;
	@JsonProperty("ConsultationFees")
	private String consultationfees;
	@JsonProperty("ConsultationId")
	private int consultationid;
	@JsonProperty("PatientUploadData")
	private List<PatientUploadData> patientuploaddata;
	
	
	
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getConsultedto() {
		return consultedto;
	}
	public void setConsultedto(String consultedto) {
		this.consultedto = consultedto;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<Symptom> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}
	public List<Findings> getFinding() {
		return finding;
	}
	public void setFinding(List<Findings> finding) {
		this.finding = finding;
	}
	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public List<Prescription> getPrescription() {
		return prescription;
	}
	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}
	public List<FollowUps> getFollowup() {
		return followup;
	}
	public void setFollowup(List<FollowUps> followup) {
		this.followup = followup;
	}
	public List<EMRGenerated> getEmrgenerated() {
		return emrgenerated;
	}
	public void setEmrgenerated(List<EMRGenerated> emrgenerated) {
		this.emrgenerated = emrgenerated;
	}
	public List<InvoiceGenerated> getInvoicegenerated() {
		return invoicegenerated;
	}
	public void setInvoicegenerated(List<InvoiceGenerated> invoicegenerated) {
		this.invoicegenerated = invoicegenerated;
	}
	public String getConcern() {
		return concern;
	}
	public void setConcern(String concern) {
		this.concern = concern;
	}
	
	public List<WearableData> getWearabledata() {
		return wearabledata;
	}
	public void setWearabledata(List<WearableData> wearabledata) {
		this.wearabledata = wearabledata;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public String getSurgeries() {
		return surgeries;
	}
	public void setSurgeries(String surgeries) {
		this.surgeries = surgeries;
	}
	public List<PersonalDetail> getPersonaldetail() {
		return personaldetail;
	}
	public void setPersonaldetail(List<PersonalDetail> personaldetail) {
		this.personaldetail = personaldetail;
	}
	public List<PatientIllnessSummary> getPatientillnesssummary() {
		return patientillnesssummary;
	}
	public void setPatientillnesssummary(List<PatientIllnessSummary> patientillnesssummary) {
		this.patientillnesssummary = patientillnesssummary;
	}
	public List<Examination> getExamination() {
		return examination;
	}
	public void setExamination(List<Examination> examination) {
		this.examination = examination;
	}
	public List<Others> getOthers() {
		return others;
	}
	public void setOthers(List<Others> others) {
		this.others = others;
	}
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public List<Visit> getVisits() {
		return visits;
	}
	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getConsultationfees() {
		return consultationfees;
	}
	public void setConsultationfees(String consultationfees) {
		this.consultationfees = consultationfees;
	}
	public int getConsultationid() {
		return consultationid;
	}
	public void setConsultationid(int consultationid) {
		this.consultationid = consultationid;
	}
	public List<PatientUploadData> getPatientuploaddata() {
		return patientuploaddata;
	}
	public void setPatientuploaddata(List<PatientUploadData> patientuploaddata) {
		this.patientuploaddata = patientuploaddata;
	}
	public String getCurrentmedications() {
		return currentmedications;
	}
	public void setCurrentmedications(String currentmedications) {
		this.currentmedications = currentmedications;
	}
}
