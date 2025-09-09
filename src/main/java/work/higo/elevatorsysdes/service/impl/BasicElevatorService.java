package work.higo.elevatorsysdes.service.impl;

import work.higo.elevatorsysdes.service.ElevatorService;

public class BasicElevatorService implements ElevatorService {

    public BasicElevatorService() {
      // this needs fixing when the design is ready
    }

  @Override
  public void callElevator(int floor, int direction) {
      // check which elevator is free and closest to the floor
        // send the elevator to that floor
    // add a request to the queue
  }

  @Override
  public void selectFloor(int floor) {

  }

  @Override
  public void step() {

  }

  @Override
  public String status() {
    return "";
  }

  @Override
  public void initEmergencyMode() {

  }
}
