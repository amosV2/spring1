package cn.demo.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

	private static Map<String,Car> carMap = new HashMap<>();

	static{
		carMap.put("audi",new Car("audi",300000));
		carMap.put("levin",new Car("levin",100000));
	}

	public static Car getCar(String brand){
		return carMap.get(brand);
	}

}
