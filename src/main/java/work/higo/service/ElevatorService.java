package work.higo.service;

public interface ElevatorService {

  void callElevator(int floor, int direction);

  void selectFloor(int floor);

  void step();

  String status();

  void initEmergency();
}
