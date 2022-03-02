package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FAQs 
{
	@JsonProperty("Topic")
	private String topic;
	@JsonProperty("Question")
	private String question;
	@JsonProperty("Answer")
	public String answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
}
