package studio8;

import java.security.Identity;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @author RamyaSamudrala
 *
 */

public class Date {

	//A Date has-a month, day, and year. It also has-a field that 
	//indicates whether the date is a holiday or not. 
	//(To simplify your work you may assume that all months have 31 days)

	String month;
	int day;
	int year;
	boolean isHoliday;
	
	/**
	 * Constructor
	 * @param m
	 * @param d
	 * @param y
	 */
	public Date(String m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}

	/**
	 * Gets month
	 * @return month
	 */
	public String getMonth() {
		return this.month;
	}
	
	/**
	 * Gets day
	 * @return day
	 */
	public int getDay() {
		return this.day;
	}
	
	/**
	 * Gets year
	 * @return year
	 */
	public int getYear() {
		return this.year;
	}
	
	/**
	 * Sets holiday
	 * @return isHoliday
	 */
	public boolean setHoliday(boolean tF) {
		if (tF == true) {
			this.isHoliday = true;
		}
		else {
			this.isHoliday = false;
		}
		return this.isHoliday;
	}
	/**
	 * Converts month, day, year to string formatted specifically
	 * @return date
	 */
	public String toString() {
		String date = this.getMonth() + " " + this.getDay() + ", " + this.getYear();
		return date;
	}
	
	//How do i generate hashCode() and equals(): source dropdown -> generate hashCode() and equals() 
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}
	
	  public static void main(String[] args) {
	    	Date a = new Date ("August", 12, 2022);
	    	Date b = new Date ("August", 12, 2022);
	    	Date c = new Date ("December", 9, 2022);
	    	Date d = new Date ("May", 23, 2022);
	    	Date e = new Date ("October", 31, 2022);
	    	
	    	//prints entire list without checking equality of attributes
	    	LinkedList<Date> list = new LinkedList<Date>();

	    	list.add(a);
	    	list.add(b);
	    	list.add(c);
	    	list.add(d);
	    	list.add(e);
	    	System.out.println(list);

	    	//prints list after checking equality of attributes - not duplicating 
	    	//objects with the same attributes
	    	HashSet<Date> set = new HashSet<Date>();

	    	set.add(a);
	    	set.add(b);
	    	set.add(c);
	    	set.add(d);
	    	set.add(e);
	    	System.out.println(set);
	    }

}
