package com.javaex.oop.tv;

public class Tv {

	private int channel;
	private int volume;
	private boolean power;
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	public void power(boolean on) {
		if(on == true) {
			power = true;
		} else {
			power = false;
		}
	}
	
	public void channel(int channel) {
		if (channel <= 255 && channel >= 1) {
			this.channel = channel;
		}
	}		
	public void channel(boolean up) {
		channel += up ? +1 : -1;
	}
	
	public void volume(int volume) {
		if (volume <= 100 && volume >= 0) {
			this.volume = volume;
		}	
	}
	public void volume(boolean up) {
		volume += up ? +1 : -1;	
	}
	
	public void status() {
		if (power == false) {
			System.out.printf("꺼져있습니다.\n현재값: 채널%d볼륨%d%n", channel, volume);
			
		} else {
		System.out.printf("채널: %d, 볼륨: %d, 전원: %s%n", channel, volume, power);
	
		}
	}
}
