package api.com;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EMR 
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
	@JsonProperty("PatientUploadData")
	private List<PatientUploadData> patientuploadata;
	@JsonProperty("WearableData")
	private List<WearableData> wearabledata;
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
	public List<PatientUploadData> getPatientuploadata() {
		return patientuploadata;
	}
	public void setPatientuploadata(List<PatientUploadData> patientuploadata) {
		this.patientuploadata = patientuploadata;
	}
	public List<WearableData> getWearabledata() {
		return wearabledata;
	}
	public void setWearabledata(List<WearableData> wearabledata) {
		this.wearabledata = wearabledata;
	}
}
