package day1128;

public class CalendarDTO {

	int Year,Month,Day;

	public CalendarDTO() {
	}

	public CalendarDTO(int year, int month, int day) {
		Year = year;
		Month = month;
		Day = day;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	@Override
	public String toString() {
		return "CalendarDTO [Year=" + Year + ", Month=" + Month + ", Day=" + Day + "]";
	}
	
	
	
	
	
}
