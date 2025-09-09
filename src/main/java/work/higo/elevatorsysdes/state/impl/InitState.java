package work.higo.elevatorsysdes.state.impl;

import work.higo.elevatorsysdes.engine.ElevatorRunnerEngine;
import work.higo.elevatorsysdes.enums.ElevatorStateEnums;
import work.higo.elevatorsysdes.model.Elevator;
import work.higo.elevatorsysdes.state.ElevatorState;

public class InitState implements ElevatorState {

	private final ElevatorRunnerEngine elevatorRunnerEngine;

	public InitState(ElevatorRunnerEngine elevatorRunnerEngine) {
		this.elevatorRunnerEngine = elevatorRunnerEngine;
	}

	@Override
	public void init(Elevator elevator) {
		elevatorRunnerEngine.setElevatorState(elevator, ElevatorStateEnums.INIT);
	}

	@Override
	public void stepUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyMode() {
		// TODO Auto-generated method stub

	}

}
