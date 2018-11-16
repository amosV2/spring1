package cn.demo.spring.aop.arithmetic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticLoggingProxy {

	private ArithmeticCalculator target;

	public ArithmeticLoggingProxy(ArithmeticCalculator target){
		this.target = target;
	}

	public ArithmeticCalculator getTarget(){

		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = new Class[]{ArithmeticCalculator.class};
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodName = method.getName();
				System.out.println(methodName + " begins with " + Arrays.asList(args));
				Object result =  method.invoke(target,args);
				return result;
			}
		};
		ArithmeticCalculator calculator = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, handler);
		return calculator;

	}


}
