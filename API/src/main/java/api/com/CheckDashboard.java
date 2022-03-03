package api.com;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import api.com.Onboarding;

public class CheckDashboard {
	@JsonProperty("Message")
	private String message;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("Data")
	private List<Dashboard> data;
	
	public List<Dashboard> getData() {
		return data;
	}
	public void setData(List<Dashboard> data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
