package design_pattern.ch01_check02;

public class Phone {
	private String homephones;
	private String officePhone;
	
	public String getHomephones() {
		return homephones;
	}
	public void setHomephones(String homephones) {
		this.homephones = homephones;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String homephones, String officePhone) {
		super();
		this.homephones = homephones;
		this.officePhone = officePhone;
	}
	@Override
	public String toString() {
		return "Phone [homephones=" + homephones + ", officePhone=" + officePhone + "]";
	}
	
	
	
}
