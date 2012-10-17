package week06;

public class SwissClock implements Clock {

	private int militaryHours;
	private int militaryMinutes;

	public SwissClock(int militaryHours, int militaryMinutes) {
		this.militaryHours = militaryHours;
		this.militaryMinutes = militaryMinutes;
	}

	public int getMilitaryHours() {
		return militaryHours;
	}

	public void setMilitaryHours(int militaryHours) {
		this.militaryHours = militaryHours;
	}

	public int getMilitaryMinutes() {
		return militaryMinutes;
	}

	public void setMilitaryMinutes(int militaryMinutes) {
		this.militaryMinutes = militaryMinutes;
	}

	@Override
	public int getMinutes() {
		return militaryMinutes;
	}

	@Override
	public int getMilitaryHour() {
		return militaryHours;
	}

	@Override
	public int getNormalHour() {
		if (militaryHours > 12) {
			return militaryHours - 12;
		} else {
			return militaryHours;
		}
	}

	@Override
	public String getAMorPM() {
		if (militaryHours > 12) {
			return "PM";
		} else {
			return "AM";
		}
	}

}
