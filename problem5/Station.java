import java.util.*;

class Time {
	public int toMinutes(String time) {
		String[] hourMin = time.split(":");
	    int hour = Integer.parseInt(hourMin[0]);
	    int mins = Integer.parseInt(hourMin[1]);
	    int hoursInMins = hour * 60;
	    return hoursInMins + mins;
	}
}

class Bus extends Time {
	private int id;
	private int arrivalInMinutes;
	private int departureInMinutes;

	Bus(int _id, String arrival, String departure) {
		id = _id;
		arrivalInMinutes = toMinutes(arrival);
		departureInMinutes = toMinutes(departure);
	}

	public int getArrival() {
		return arrivalInMinutes;
	}

	public int getDeparture() {
		return departureInMinutes;
	}
}

public class Station extends Time {

	private ArrayList<Bus> buses;

	Station() {
		buses = new ArrayList<Bus>();
	}

	public void addBus(Bus bus) {
		buses.add(bus);
	}

	public void maxNumberOfBusAtTime(String time) {
		int numOfBus = 0;
		int pointTime = toMinutes(time);

		for (Bus bus : buses) { 
        	if (bus.getArrival() <= pointTime && pointTime <= bus.getDeparture())
        		numOfBus++;		
      	}

      	System.out.println("Maxixum number of bus inside the station at " + time + " is " + numOfBus + " bus.");
      	System.out.println("output = " + numOfBus);
	}

	//The big O here is linear, which is O(n). and n itself is number of bus all the time to that station
	
	public static void main(String[] args) {
		Station st = new Station();

		Bus a = new Bus(1, "10:00", "10:05");
		Bus b = new Bus(2, "10:05", "10:15");
		Bus c = new Bus(3, "10:10", "10:30");
		Bus d = new Bus(4, "10:25", "10:40");
		Bus e = new Bus(5, "10:45", "10:50");

		st.addBus(a);
		st.addBus(b);
		st.addBus(c);
		st.addBus(d);
		st.addBus(e);

		Scanner sc = new Scanner(System.in);
		System.out.println("Fill the time with format \"HH:MM\" below: ");
		String time = sc.nextLine();

		st.maxNumberOfBusAtTime(time);
	}
}