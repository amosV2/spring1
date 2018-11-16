package cn.demo.spring.aop.arithmetic;

public class APP {

	public static void main(String[] args) {

/*		ArithmeticCalculator calculator = new ArithmeticCalculatorImpl();
		int result = calculator.add(1, 3);
		System.out.println("------->"+result);
		result = calculator.div(4,2);
		System.out.println("------->"+result);*/

		ArithmeticCalculator calculator = new ArithmeticCalculatorImpl();
		ArithmeticCalculator target = new ArithmeticLoggingProxy(calculator).getTarget();
		Object result = target.add(1, 4);
		System.out.println(result);
	}

}
