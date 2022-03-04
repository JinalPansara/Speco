package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientIllnessSummary
{
	@JsonProperty("ChiefComplaint")
	private String chiefcomplaint;
	@JsonProperty("HistoryOfPresentIllness")
	private String historyofpresentillness;
	@JsonProperty("HistoryOfPastIllness")
	private String historyofpastillness;
	public String getChiefcomplaint() {
		return chiefcomplaint;
	}
	public void setChiefcomplaint(String chiefcomplaint) {
		this.chiefcomplaint = chiefcomplaint;
	}
	public String getHistoryofpresentillness() {
		return historyofpresentillness;
	}
	public void setHistoryofpresentillness(String historyofpresentillness) {
		this.historyofpresentillness = historyofpresentillness;
	}
	public String getHistoryofpastillness() {
		return historyofpastillness;
	}
	public void setHistoryofpastillness(String historyofpastillness) {
		this.historyofpastillness = historyofpastillness;
	}
	
}
