package test19_car;

public class Car {
	String model, color;
	
	public void setModel(String strangeName) {
		this.model = strangeName.replace(" ", "");
	}
	
	public void setColor(String strangeColor) {
		if (strangeColor.equals("���") || strangeColor.equals("ȸ��") || strangeColor.equals("����")) {
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
