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

	public int getOrig() {
		return orig;
	}

	public int getDest() {
		return dest;
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
		currentFloor = 1;
		point = 0;
	}

	public void setFloor(int floorId, boolean priority) {
		currentFloor = floorId;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void movingToFloor(int floorId) {
		currentFloor = floorId;
		point++;
	}

	public void movingUp() {
		currentFloor++;
		point++;
	}

	public void movingDown() {
		currentFloor--;
		point++
	}

	public static void main(String[] args) {
		Elevator elavator = new Elevator();

		Request a = new Request("p1", 1, 5);
		Request b = new Request("p2", 2, 3);
		Request c = new Request("p3", 2, 4);
		Request c = new Request("p4", 3, 4);
		Request d = new Request("p5", 3, 1);
		Request e = new Request("ps6", 5, 1);

		ArrayList<Request> req = new ArrayList<Request>();
		req.add(a);req.add(b);req.add(c);req.add(d);req.add(e);

		while (req.size() > 0) {
			for (Request r : req) { 
				if (r.getOrig == elevator.getCurrentFloor() || r.getDest == elevator.getCurrentFloor) {
					
				}
	      	}
		}
	}
}