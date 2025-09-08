package work.higo.model;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Elevator {

	private List<Floor> floors;
	private int bottomFloor;
	private int topFloor;
	private int currentFloor;
	private int direction; // 0 for up, 1 for down, 2 for idle ---> convert to enum later

	public Elevator(int totalFloors) {
		this(totalFloors, 0, totalFloors-1);
	}

	public Elevator(int totalFloors, int bottomFloor, int topFloor) {
		this.floors = new ArrayList<>(totalFloors);

		this.bottomFloor = bottomFloor;
		this.topFloor = topFloor;
		this.currentFloor = bottomFloor;
		this.direction = 2; // idle

		initElevator(bottomFloor, topFloor);
	}

	private void initElevator(int bottomFloor, int topFloor) {
		for(int i = bottomFloor; i<=topFloor; i++) {
			Floor floor = new Floor(i, setAllowedDirections(i,floors));
			floors.add(floor);
		}
	}

	private int[] setAllowedDirections(int currentFloor, List<Floor> floors) {

		final int lowestFloor = floors.get(0).getFloorNo();
		final int rooftopFloor = floors.get(floors.size() - 1).getFloorNo();

		int[] allowedDirections = new int[2];

		if (currentFloor == lowestFloor) {
			allowedDirections[0] = 0;
			allowedDirections[1] = 1;
		}

		if (currentFloor == rooftopFloor) {
			allowedDirections[0] = 1;
			allowedDirections[1] = 0;
		}

		else {
			allowedDirections[0] = 1;
			allowedDirections[1] = 1;
		}
		return allowedDirections;
	}
}
