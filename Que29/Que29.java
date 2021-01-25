
package Assgn4;

import java.util.Scanner;

enum TrafficLight{
	RED(60), GREEN(20), YELLOW(10);
	
	private int duration;
	TrafficLight(int i) {
		this.duration = i;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
public class Que9 {

	public static void main(String[] args) {
		TrafficLight[] lights = TrafficLight.values();
		for(TrafficLight light : lights) {
			System.out.printf("%-15s%-5d\n", light.name(), light.getDuration());
		}
	}	
}