package cn.demo.spring.beans.factotybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {


	@Override
	public Car getObject() throws Exception {
		return new Car("city",100000);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
