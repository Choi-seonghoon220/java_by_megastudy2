package test13;

public class Tv {
	private String type;
	private int channel;
	
	Tv(String type, int channel){
		this.type = type;
		this.channel = channel;
	}
	
	void view() {
		System.out.printf("%sTv Ã¤³Î%4d\n", this.type, this.channel);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
