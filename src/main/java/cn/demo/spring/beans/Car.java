package cn.demo.spring.beans;

public class Car {

	private String name;

	private String corp;

	private double price;

	private int speed;

	public Car(){

	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", corp='" + corp + '\'' +
				", price=" + price +
				", speed=" + speed +
				'}';
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Car(String name, String corp, int speed) {
		this.name = name;
		this.corp = corp;
		this.speed = speed;
	}

	public Car(String name, String corp, double price) {
		this.name = name;
		this.corp = corp;
		this.price = price;
	}
}
