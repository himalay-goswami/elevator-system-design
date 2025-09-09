package work.higo.elevatorsysdes.engine;

import work.higo.elevatorsysdes.enums.ElevatorStateEnums;
import work.higo.elevatorsysdes.model.Elevator;
import work.higo.elevatorsysdes.state.ElevatorState;

import java.util.List;
import java.util.Queue;

public class ElevatorRunnerEngine {

  /*
   * A runner is basically a real-time (kind of) engine which will keep running
   * and wait for user commands.
   * It will read commands from a file or console input, and execute them
   * accordingly.
   */

  /*
   * We can implement the following commands:
   * 1. CALL <floor> <direction> --> to call the elevator to a specific floor in a
   * specific direction
   * Now, lets begin with the CALL command.
   */

  private List<Elevator> elevators;
  private Queue<ElevatorRequestModel> queue; // to hold the requests

  public ElevatorRunnerEngine(List<Elevator> elevators) {
    this.elevators = elevators;
  }

  public void callElevator(String direction) {
    ElevatorRequestModel request = new ElevatorRequestModel(direction);
    queue.add(request);
  }

  public ElevatorStateEnums setElevatorState(Elevator elevator, ElevatorStateEnums state) {
    return state;
  }

  private void findNearestElevator(ElevatorRequestModel request) {
    // logic to find the nearest elevator
  }
}
