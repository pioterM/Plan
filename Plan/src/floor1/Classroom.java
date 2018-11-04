package floor1;

import java.util.Scanner;

public class Classroom extends Rooms {
	int weekday = 1;
	int numberLesson = 1;
	String lesson = "Физика";
	String teacher = "Иванов Пётр";
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
		System.out.println("Введите номер аудитории:");
		this.number = scan.nextInt();
		System.out.println("Введите о каком по счёту дне недели вы хотите узнать информацию:");
		this.weekday = scan.nextInt();
		System.out.println("Введите номер лекции:");
		this.numberLesson = scan.nextInt();
		
	}
	
	@Override
	public void outInf() {
		if (numberLesson % 2 == 0) {
			this.lesson = "Физика";
			this.teacher = "Ньютон";
		} else {
			this.teacher = "Пифагор";
			this.lesson = "Математика";
		}
		System.out.println(lesson + ", ведёт " + teacher);
		System.out.println("Открыта с " + hourOpen + ":" + minOpen + " до " + hourClose + ":" + minClose);
	}
	
	
}
