package work.higo.elevatorsysdes.enums;

import javax.naming.InitialContext;

public enum ElevatorStateEnums {

    IDLE(0),
    INIT(6),
    MOVING_UP(1),
    MOVING_DOWN(-1),
    DOOR_OPEN(2),
    DOOR_CLOSED(3),
    EMERGENCY(4),
    OVERLOADED(5);

    private final int currentStateCode;

    ElevatorStateEnums(int currentStateCode) {
        this.currentStateCode = currentStateCode;
    }

    public int getCurrentStateCode() {
        return currentStateCode;
    }

    public static ElevatorStateEnums fromCode(int code) {
        for (ElevatorStateEnums state : ElevatorStateEnums.values()) {
            if (state.getCurrentStateCode() == code) {
                return state;
            }
        }
        throw new IllegalArgumentException("Invalid state: " + code);
    }
}
