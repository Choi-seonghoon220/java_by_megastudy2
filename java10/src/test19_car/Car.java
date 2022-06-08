package test19_car;

public class Car {
	String model, color;
	
	public void setModel(String strangeName) {
		this.model = strangeName.replace(" ", "");
	}
	
	public void setColor(String strangeColor) {
		if (strangeColor.equals("흰색") || strangeColor.equals("회색") || strangeColor.equals("검정")) {
			this.color = strangeColor;
		}
	}
	
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
}
