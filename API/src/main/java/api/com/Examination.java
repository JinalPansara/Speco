package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Examination
{
	@JsonProperty("GeneralPhysicalExamination")
	private String generalphysicalexamination;
	@JsonProperty("SystematicExamination")
	private String systematicexamination;
	@JsonProperty("LocalExamination")
	private String localexamination;
	public String getGeneralphysicalexamination() {
		return generalphysicalexamination;
	}
	public void setGeneralphysicalexamination(String generalphysicalexamination) {
		this.generalphysicalexamination = generalphysicalexamination;
	}
	public String getSystematicexamination() {
		return systematicexamination;
	}
	public void setSystematicexamination(String systematicexamination) {
		this.systematicexamination = systematicexamination;
	}
	public String getLocalexamination() {
		return localexamination;
	}
	public void setLocalexamination(String localexamination) {
		this.localexamination = localexamination;
	}
	
}
