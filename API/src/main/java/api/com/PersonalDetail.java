package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalDetail 
{
	@JsonProperty("PersonalHistory")
	private String personalhistory;
	@JsonProperty("FamilyHistory")
	private String familyhistory;
	@JsonProperty("SocioEconomicStatus")
	private String socioeconomicstatus;
	public String getPersonalhistory() {
		return personalhistory;
	}
	public void setPersonalhistory(String personalhistory) {
		this.personalhistory = personalhistory;
	}
	public String getFamilyhistory() {
		return familyhistory;
	}
	public void setFamilyhistory(String familyhistory) {
		this.familyhistory = familyhistory;
	}
	public String getSocioeconomicstatus() {
		return socioeconomicstatus;
	}
	public void setSocioeconomicstatus(String socioeconomicstatus) {
		this.socioeconomicstatus = socioeconomicstatus;
	}
}
