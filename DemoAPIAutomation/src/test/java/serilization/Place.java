package serilization;

import java.util.List;

public class Place {
	
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private String website;
	private String language;
	private Location location;
	private List<String> types;
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public String getName() {
		return getName();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return getPhone_number();
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return getAddress();
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return getWebsite();
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return getLanguage();
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Location getLocation() {
		return getLocation();
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<String> getTypes() {
		return getTypes();
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	

}
