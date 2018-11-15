package cn.demo.spring.beans.cycle;

public class Car {

	private String brand;

	public Car(){
		System.out.println("car constructor...");
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}

	public void setBrand(String brand) {
		System.out.println("set brand...");
		this.brand = brand;
	}

	public void init(){
		System.out.println("init...");
	}

	public void destroy(){
		System.out.println("destroy...");
	}

}
