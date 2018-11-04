package floor1;

import java.util.Scanner;

public class Classroom extends Rooms {
	int weekday = 1;
	int numberLesson = 1;
	String lesson = "������";
	String teacher = "������ ϸ��";
	static String[][] teachTimetable = new String[7][6];
	static String[][] lessonTimetable = new String[7][6];
	
	
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	public int getNumberLesson() {
		return numberLesson;
	}
	public void setNumberLesson(int numberLesson) {
		this.numberLesson = numberLesson;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	Classroom(int number, int weekday, int numberLesson) {
		this.number = number;
		this.weekday = weekday;
		this.numberLesson = numberLesson;
		this.hourOpen = 8;
		this.minOpen = 10;
		this.hourClose = 16;
		this.minClose = 30;
	}
	Classroom(int number, int weekday) {
		this.number = number;
		this.weekday = weekday;
		this.hourOpen = 8;
		this.minOpen = 10;
		this.hourClose = 16;
		this.minClose = 30;
	}
	Classroom(int number) {
		this.number = number;
		this.hourOpen = 8;
		this.minOpen = 10;
		this.hourClose = 16;
		this.minClose = 30;
	}
	
	@Override
	public void inInf() {
		@SuppressWarnings({ "resource"})
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� ���������:");
		this.number = scan.nextInt();
		System.out.println("������� � ����� �� ����� ��� ������ �� ������ ������ ����������:");
		this.weekday = scan.nextInt();
		System.out.println("������� ����� ������:");
		this.numberLesson = scan.nextInt();
		
	}
	
	@Override
	public void outInf() {
		if (numberLesson % 2 == 0) {
			this.lesson = "������";
			this.teacher = "������";
		} else {
			this.teacher = "�������";
			this.lesson = "����������";
		}
		System.out.println(lesson + ", ���� " + teacher);
		System.out.println("������� � " + hourOpen + ":" + minOpen + " �� " + hourClose + ":" + minClose);
	}
	
	
}
