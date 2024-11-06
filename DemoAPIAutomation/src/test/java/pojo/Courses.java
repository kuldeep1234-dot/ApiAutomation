package pojo;

import java.util.List;

public class Courses {

	private List <WebAutomation> webAutomation;
	 public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(WebAutomation webAutomation) {
		this.webAutomation = (List<WebAutomation>) webAutomation;
	}
	public List <Api> getApi() {
		return api;
	}
	public void setApi(List<Api> api) {
		this.api = api;
	}
	public List <Mobile> getMobile() {
		return (List<Mobile>) mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	private  List<Api> api;
	  private Mobile mobile;
	  

	

}
