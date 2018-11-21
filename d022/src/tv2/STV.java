package tv2;

import tv2.TV;

public class STV implements TV {
	String status;
	int volume;
	int size;
	String color;
	
	
	public STV() {
		System.out.println("Constructor STV ...");
	}
	
	
	
	
	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public int getVolume() {
		return volume;
	}




	public void setVolume(int volume) {
		this.volume = volume;
	}




	public int getSize() {
		return size;
	}




	public void setSize(int size) {
		this.size = size;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public void startTV() {
		System.out.println("Start STV ...");
	}
	
	public void endTV() {
		System.out.println("End STV ...");
	}
	
	@Override
	public void turnOn() {
		this.status = "STV ON";
	}

	@Override
	public void turnOff() {
		this.status = "STV OFF";
	}

	@Override
	public void volumeUp(int v) {
		this.volume += v;
	}

	@Override
	public void volumeDown(int v) {
		this.volume -= v;
	}
	@Override
	public String toString() {
		return "STV [status=" + status + ", volume=" + volume + ", size=" + size + ", color=" + color + "]";
	}

	
	
}




