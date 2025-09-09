package work.higo.elevatorsysdes.model;

import lombok.Getter;
import lombok.Setter;
import work.higo.elevatorsysdes.engine.ElevatorRunnerEngine;
import work.higo.elevatorsysdes.enums.ElevatorStateEnums;
import work.higo.elevatorsysdes.state.ElevatorState;
import work.higo.elevatorsysdes.state.impl.InitState;

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

	private final int ELEVATOR_CAPACITY = 20;
	private ElevatorState elevatorState;
	private ElevatorRunnerEngine elevatorRunnerEngine;

	public Elevator(int totalFloors) {
		this(totalFloors, 0, totalFloors - 1);
	}

	public Elevator(int totalFloors, int bottomFloor, int topFloor) {
		this.floors = new ArrayList<>(totalFloors);

		this.bottomFloor = bottomFloor;
		this.topFloor = topFloor;
		this.currentFloor = bottomFloor;
		this.direction = 2; // idle
		this.elevatorRunnerEngine = new ElevatorRunnerEngine(List.of(this));

		initElevator(bottomFloor, topFloor);
	}

	private void initElevator(int bottomFloor, int topFloor) {
		for (int i = bottomFloor; i <= topFloor; i++) {
			Floor floor = new Floor(i, setAllowedDirections(i, floors));
			floors.add(floor);
		}
		this.elevatorState = new InitState(elevatorRunnerEngine);
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

	public void setElevatorState(ElevatorStateEnums state) {

		// need to write a big switch case to handle all states
		switch (state) {

			case INIT:
				this.elevatorState = new InitState(elevatorRunnerEngine);
				break;
			case MOVING_UP:
				// this.elevatorState = new MovingUpState(elevatorRunnerEngine);
				break;
			case MOVING_DOWN:
				// this.elevatorState = new MovingDownState(elevatorRunnerEngine);
				break;
			case DOOR_OPEN:
				// this.elevatorState = new DoorOpenState(elevatorRunnerEngine);
				break;
			case DOOR_CLOSED:
				// this.elevatorState = new DoorClosedState(elevatorRunnerEngine);
				break;
			case EMERGENCY:
				// this.elevatorState = new EmergencyState(elevatorRunnerEngine);
				break;
			default:
				// change this to idle state later
				this.elevatorState = new InitState(elevatorRunnerEngine);
				break;
		}
	}
}
