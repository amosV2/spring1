package cn.demo.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
		System.out.println("postProcessBeforeInitialization:"+o+","+s);
		Car car = (Car) o;
		car.setBrand("Levin--");
		return o;
	}

	@Override
	public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
		System.out.println("postProcessAfterInitialization:"+o+","+s);
		return o;
	}
}
