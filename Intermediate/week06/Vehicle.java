package week06;

public abstract class Vehicle {

	private int x;
	private int y;
	private double speed;
	private boolean running;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Vehicle(int x, int y, double speed, boolean running) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.running = running;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public abstract void starts();

	public abstract void stops();

	public abstract void accelerate(int speed);

	public abstract void decelerate(int speed);

	public void moveX(int x) {
		this.x = x;
	}

	public void moveY(int y) {
		this.y = y;
	}
}
