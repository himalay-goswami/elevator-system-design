package work.higo.model;

// can we convert this class into a record?
public class Floor {

	private int floorNo;
	private int[] allowedDirections; // we can use 0 and 1 for up and down

	public Floor(int floorNo, int[] allowedDirections) {
		this.floorNo = floorNo;
		this.allowedDirections = allowedDirections;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public int[] getAllowedDirections() {
		return allowedDirections;
	}

	public void setAllowedDirections(int[] allowedDirections) {
		this.allowedDirections = allowedDirections;
	}
}
