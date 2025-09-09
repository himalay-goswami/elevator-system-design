package work.higo.elevatorsysdes.state;

import work.higo.elevatorsysdes.model.Elevator;

public interface ElevatorState {

	// State Design Pattern can be implemented here.

	void init(Elevator elevator);

	void stepUp();

	void stepDown();

	void openDoor();

	void closeDoor();

	void emergencyMode();
}
