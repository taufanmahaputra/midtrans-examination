import java.util.*;

class Request {
	private String id;
	private int orig;
	private int dest;

	Request(String _id, int _orig, int _dest) {
		id = _id;
		orig = _orig;
		dest = _dest;
	}

	public boolean isRequestUp() {
		return orig < dest;
	}

	public boolean isRequestDown() {
		return orig > dest;
	}
}

public class Elevator {
	private int point;
	private int[] embarks;
	private int[] disembarks;
	private int currentFloor;
	
	Elevator() {
		currentFloor = 0;
		point = 0;
	}

	public void setFloor(int floorId, boolean priority) {
		currentFloor = floorId;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public boolean isElevatorGoingUp() {

	}

	public boolean isElevatorGoingDown() {

	}

	public static void main(String[] args) {
		Elevator elavator = new Elevator();

		Request a = new Request("p1", 1, 5);
		Request a = new Request("p2", 2, 3);
		Request a = new Request("p3", 2, 4);
		Request a = new Request("p4", 3, 4);
		Request a = new Request("p5", 3, 1);
		Request a = new Request("ps6", 5, 1);


	}
}