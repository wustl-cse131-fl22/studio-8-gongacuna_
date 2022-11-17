/**
 * 
 */
package studio8;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 * @author RamyaSamudrala
 *
 */
public class Appointment {

	Date appDate;
	Time appTime;
	
	/**
	 * Constructor
	 * @param d
	 * @param t
	 */
	public Appointment(Date d, Time t) {
		// TODO Auto-generated constructor stub
		this.appDate = d;
		this.appTime = t;
	}
	
	/**
	 * Gets appointment date
	 * @return aDate
	 */
	public Date getDate() {
		return this.appDate;
	}
	
	/**
	 * Gets appointment time
	 * @return aDate
	 */
	public Time getTime() {
		return this.appTime;
	}
	
	public String toString() {
		
		String dateTime = this.getDate()+ " " + this.getTime(); 
		return dateTime;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(appDate, appTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appDate, other.appDate) && Objects.equals(appTime, other.appTime);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date aD = new Date("November", 16, 2022);
		Date bD = new Date("November", 16, 2022);
		
		Time aT = new Time(17, 35, false);
		Time bT = new Time(17, 35, false);
		
		Appointment a = new Appointment(aD, aT);
		Appointment b = new Appointment(bD, bT);
		
		LinkedList<Appointment> set = new LinkedList<Appointment>();
		
		set.add(a);
		set.add(b);
		
		System.out.println(set);

	}

}
