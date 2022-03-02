package api.com;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class FAQs1 extends FAQs
	{
		private String why;
		public String getWhy() {
			return why;
		}

		public void setWhy(String why) {
			this.why = why;
		}
		
	}
    

