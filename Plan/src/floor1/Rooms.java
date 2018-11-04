package floor1;

import java.util.Scanner;

public class Rooms {
	String type;
	int number = 0;
	int hourOpen = 0;
	int minOpen = 0;
	int hourClose = 23;
	int minClose = 59;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public int getMinOpen() {
		return minOpen;
	}
	public void setMinOpen(int minOpen) {
		this.minOpen = minOpen;
	}
	public int getMinClose() {
		return minClose;
	}
	public void setMinClose(int minClose) {
		this.minClose = minClose;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getHourOpen() {
		return hourOpen;
	}
	public void setHourOpen(int hourOpen) {
		this.hourOpen = hourOpen;
	}
	public int getHourClose() {
		return hourClose;
	}
	public void setHourClose(int hourClose) {
		this.hourClose = hourClose;
	}
	
	public void inInf() {
		@SuppressWarnings({ "resource"})
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип помещения (аудитория, служебное, туалет, столовая):");
		type = scan.next();
	}
	
	public void outInf() {
		System.out.println("Открыто с " + hourOpen + ":" + minOpen + " до " + hourClose + ":" + minClose);
	}
	
}
