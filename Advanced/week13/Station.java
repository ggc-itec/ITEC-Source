package week13;

public enum Station {
	ONE(1), TWO(2), THREE(4), FOUR(8), FIVE(16), SIX(32), SEVEN(64), EIGHT(128);
	
	private final int stationNum;
	
	Station(int stationNum) {
		this.stationNum = stationNum;
	}
	
	public int getStationNum() {
		return stationNum;
	}
	
}