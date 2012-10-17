package week06;

public class Car extends Vehicle {

	public Car(int x, int y, double speed, boolean running) {
		super(x, y, speed, running);
	}

	@Override
	public void starts() {
		setRunning(true);
	}

	@Override
	public void stops() {
		setRunning(false);
	}

	@Override
	public void accelerate(int speed) {
		setSpeed(getSpeed() + speed);
	}

	@Override
	public void decelerate(int speed) {
		setSpeed(getSpeed() - speed);
	}

}
