package cn.demo.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {

	private Map<String,Car> carMap = new HashMap<>();

	public InstanceCarFactory(){
		carMap.put("ford",new Car("ford",200000));
		carMap.put("levin",new Car("levin",100000));
	}

	public Car getCar(String brand){
		return carMap.get(brand);
	}

}
