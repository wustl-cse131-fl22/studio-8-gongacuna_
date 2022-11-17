package studio8;

import java.security.Identity;
import java.util.Objects;

public class Time {
	//A Time has-an hour (0 to 23) and a minute (0 to 59). 
	//It also has-a field that indicates whether the time 
	//should be shown in 12- or 24-hour format (this dictates how toString() behaves) .
	
	int hour;
	int minute;
	boolean isMilitaryTime;
	
	public Time(int h, int m, boolean isM) {
		// TODO Auto-generated constructor stub
		this.hour = h;
		this.minute = m;
		this.isMilitaryTime = isM;
	}
	
	public int getHour() {
		return this.hour;
	}

	public int getMin() {
		return this.minute;
	}
	
	public String toString() {
		String time = "";
		String minString;
		if (this.getMin() < 10)
		{
			minString = "0" + this.getMin();
		}
		else 
		{
			minString = "" + this.getMin();
		}
		
		if (isMilitaryTime == true) {
			time = this.getHour() + ":" + minString;
		}
		else {
			if (this.getHour() < 12) {
				time = getHour() + ":" + minString;
			}
			else {
				int hour = this.getHour()-12;
				
				time = hour + ":" + minString;
			}
		}
		return time;
	}


	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
public static void main(String[] args) {
		
		Time rightNow = new Time(17, 01, false);
    	System.out.println(rightNow.toString());
    }

}