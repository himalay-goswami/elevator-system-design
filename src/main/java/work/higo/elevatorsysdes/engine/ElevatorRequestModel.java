package work.higo.elevatorsysdes.engine;

public class ElevatorRequestModel {
	// private int floor;
	private String direction;

	public ElevatorRequestModel(String direction) {
		// this.floor = floor;
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}
}
